package com.batman.upms.client.shiro.realm;

import com.batman.common.util.PropertiesFileUtil;
import com.batman.upms.dao.model.UpmsUser;
import com.batman.upms.rpc.api.UpmsApiService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UpmsRealm extends AuthorizingRealm {

    @Autowired
    private UpmsApiService upmsApiService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 认证，登录时调用
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());
        //client无密认证
        String upmsType = PropertiesFileUtil.getInstance("batman-upms-client").get("batman.upms.client");
        if ("client".equals(upmsType)) {
            return new SimpleAuthenticationInfo(username, password, getName());
        }

        //查询用户信息
        UpmsUser upmsUser = upmsApiService.selectUpmsUserByUsername(username);
        if (null == upmsUser) {
            throw new UnknownAccountException();
        }
        if (!upmsUser.getPassword().equals(password)) {
            throw new IncorrectCredentialsException();
        }
        if (upmsUser.getStatus() == 1) {
            throw new LockedAccountException();
        }
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
