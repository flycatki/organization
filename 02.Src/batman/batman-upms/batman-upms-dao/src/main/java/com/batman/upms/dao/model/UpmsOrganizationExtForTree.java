package com.batman.upms.dao.model;

import java.io.Serializable;
import java.util.Map;

/*
 * 方便组织机构查询后直接json化传输至前端
 * */
public class UpmsOrganizationExtForTree implements Serializable {
	
	/*本实体类中属性对应jstree中data对象的属性值*/
	
	
	/*tree中节点的id,表中uuid*/
	private String id;
	
	/*tree中父节点的id,表中parent_uuid*/
	private String parent;
	
	/*画面中对应组织机构编号,表中id*/
	private String organizationCode;
	
	/*tree中节点的名字,表中name*/
	private String text;
	
	/*tree中节点的type(用于设置icon等属性),表中organization_type*/
	private String type;
	
	/*tree中节点状态*/
	private Map<String, String> state;
	
	/*tree中节点打开状态*/
	private String opened;
	
	/*tree中节点可用状态*/
	private String disabled;
	
	/*tree中节点选中状态*/
	private String selected;
	
	/*tree中节点行状态添加用*/
	private String li_attr;
	
	/*tree中节点a标签状态添加用*/
	private String a_attr;
	
    /**
     * 组织机构是否可见flag ： 0 不可见 ， 1 可见 ；
     */
    private Integer isvisible;
	
    /**
     * 组织机构描述
     */
    private String description;
	
    /**
     * 逻辑删除状态： 0 正常 ， 1 删除 。 
     */
    private Integer deleteflag;

	/**
	 * idを取得します。
	 * @return id
	 */
	public String getId() {
	    return id;
	}

	/**
	 * idを設定します。
	 * @param id id
	 */
	public void setId(String id) {
	    this.id = id;
	}

	/**
	 * parentを取得します。
	 * @return parent
	 */
	public String getParent() {
	    return parent;
	}

	/**
	 * parentを設定します。
	 * @param parent parent
	 */
	public void setParent(String parent) {
	    this.parent = parent;
	}

	/**
	 * organizationCodeを取得します。
	 * @return organizationCode
	 */
	public String getOrganizationCode() {
	    return organizationCode;
	}

	/**
	 * organizationCodeを設定します。
	 * @param organizationCode organizationCode
	 */
	public void setOrganizationCode(String organizationCode) {
	    this.organizationCode = organizationCode;
	}

	/**
	 * textを取得します。
	 * @return text
	 */
	public String getText() {
	    return text;
	}

	/**
	 * textを設定します。
	 * @param text text
	 */
	public void setText(String text) {
	    this.text = text;
	}

	/**
	 * typeを取得します。
	 * @return type
	 */
	public String getType() {
	    return type;
	}

	/**
	 * typeを設定します。
	 * @param type type
	 */
	public void setType(String type) {
	    this.type = type;
	}

	/**
	 * stateを取得します。
	 * @return state
	 */
	public Map<String,String> getState() {
	    return state;
	}

	/**
	 * stateを設定します。
	 * @param state state
	 */
	public void setState(Map<String,String> state) {
	    this.state = state;
	}

	/**
	 * openedを取得します。
	 * @return opened
	 */
	public String getOpened() {
	    return opened;
	}

	/**
	 * openedを設定します。
	 * @param opened opened
	 */
	public void setOpened(String opened) {
	    this.opened = opened;
	}

	/**
	 * disabledを取得します。
	 * @return disabled
	 */
	public String getDisabled() {
	    return disabled;
	}

	/**
	 * disabledを設定します。
	 * @param disabled disabled
	 */
	public void setDisabled(String disabled) {
	    this.disabled = disabled;
	}

	/**
	 * selectedを取得します。
	 * @return selected
	 */
	public String getSelected() {
	    return selected;
	}

	/**
	 * selectedを設定します。
	 * @param selected selected
	 */
	public void setSelected(String selected) {
	    this.selected = selected;
	}

	/**
	 * li_attrを取得します。
	 * @return li_attr
	 */
	public String getLi_attr() {
	    return li_attr;
	}

	/**
	 * li_attrを設定します。
	 * @param li_attr li_attr
	 */
	public void setLi_attr(String li_attr) {
	    this.li_attr = li_attr;
	}

	/**
	 * a_attrを取得します。
	 * @return a_attr
	 */
	public String getA_attr() {
	    return a_attr;
	}

	/**
	 * a_attrを設定します。
	 * @param a_attr a_attr
	 */
	public void setA_attr(String a_attr) {
	    this.a_attr = a_attr;
	}

	/**
	 * 组织机构是否可见flag ： 0 不可见 ， 1 可见 ；を取得します。
	 * @return 组织机构是否可见flag ： 0 不可见 ， 1 可见 ；
	 */
	public Integer getIsvisible() {
	    return isvisible;
	}

	/**
	 * 组织机构是否可见flag ： 0 不可见 ， 1 可见 ；を設定します。
	 * @param isvisible 组织机构是否可见flag ： 0 不可见 ， 1 可见 ；
	 */
	public void setIsvisible(Integer isvisible) {
	    this.isvisible = isvisible;
	}

	/**
	 * 组织机构描述を取得します。
	 * @return 组织机构描述
	 */
	public String getDescription() {
	    return description;
	}

	/**
	 * 组织机构描述を設定します。
	 * @param description 组织机构描述
	 */
	public void setDescription(String description) {
	    this.description = description;
	}

	/**
	 * 逻辑删除状态： 0 正常 ， 1 删除 。を取得します。
	 * @return 逻辑删除状态： 0 正常 ， 1 删除 。
	 */
	public Integer getDeleteflag() {
	    return deleteflag;
	}

	/**
	 * 逻辑删除状态： 0 正常 ， 1 删除 。を設定します。
	 * @param deleteflag 逻辑删除状态： 0 正常 ， 1 删除 。
	 */
	public void setDeleteflag(Integer deleteflag) {
	    this.deleteflag = deleteflag;
	}

}
