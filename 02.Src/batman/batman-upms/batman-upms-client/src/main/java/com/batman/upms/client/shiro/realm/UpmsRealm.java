package com.batman.upms.client.shiro.realm;

import com.batman.common.util.PropertiesFileUtil;
import com.batman.upms.dao.model.UpmsUser;
import com.batman.upms.rpc.api.UpmsApiService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
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

        UpmsUser upmsUser = upmsApiService.selectUpmsUserByUsername(username);
        return null;
    }
}
