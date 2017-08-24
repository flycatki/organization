package com.batman.upms.dao.model;

import java.io.Serializable;

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
    private UpmsOrganizationExtForTree state;
	
	/*tree中节点打开状态,根据parentUuid状态判断,为null,则为开*/
	private boolean opened;
	
	/*tree中节点可用状态,根据isenable状态判断,0 不可用 , 1 可用 */
	private boolean disabled;
	
	/*tree中节点选中状态*/
	private boolean selected;
	
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
	 * id属性取得。
	 * @return id
	 */
	public String getId() {
	    return id;
	}

	/**
	 * id属性设定。
	 * @param id id
	 */
	public void setId(String id) {
	    this.id = id;
	}

	/**
	 * parent属性取得。
	 * @return parent
	 */
	public String getParent() {
	    return parent;
	}

	/**
	 * parent属性设定。
	 * @param parent parent
	 */
	public void setParent(String parent) {
	    this.parent = parent;
	}

	/**
	 * organizationCode属性取得。
	 * @return organizationCode
	 */
	public String getOrganizationCode() {
	    return organizationCode;
	}

	/**
	 * organizationCode属性设定。
	 * @param organizationCode organizationCode
	 */
	public void setOrganizationCode(String organizationCode) {
	    this.organizationCode = organizationCode;
	}

	/**
	 * text属性取得。
	 * @return text
	 */
	public String getText() {
	    return text;
	}

	/**
	 * text属性设定。
	 * @param text text
	 */
	public void setText(String text) {
	    this.text = text;
	}

	/**
	 * type属性取得。
	 * @return type
	 */
	public String getType() {
	    return type;
	}

	/**
	 * type属性设定。
	 * @param type type
	 */
	public void setType(String type) {
	    this.type = type;
	}

	/**
	 * state属性取得。
	 * @return state
	 */
	public UpmsOrganizationExtForTree getState() {
	    return state;
	}

	/**
	 * state属性设定。
	 * @param state state
	 */
	public void setState(UpmsOrganizationExtForTree state) {
	    this.state = state;
	}

	/**
	 * opened属性取得。
	 * @return opened
	 */
	public boolean getOpened() {
	    return opened;
	}

	/**
	 * opened属性设定。
	 * @param opened opened
	 */
	public void setOpened(boolean opened) {
	    this.opened = opened;
	}

	/**
	 * disabled属性取得。
	 * @return disabled
	 */
	public boolean getDisabled() {
	    return disabled;
	}

	/**
	 * disabled属性设定。
	 * @param disabled disabled
	 */
	public void setDisabled(boolean disabled) {
	    this.disabled = disabled;
	}

	/**
	 * selected属性取得。
	 * @return selected
	 */
	public boolean getSelected() {
	    return selected;
	}

	/**
	 * selected属性设定。
	 * @param selected selected
	 */
	public void setSelected(boolean selected) {
	    this.selected = selected;
	}

	/**
	 * li_attr属性取得。
	 * @return li_attr
	 */
	public String getLi_attr() {
	    return li_attr;
	}

	/**
	 * li_attr属性设定。
	 * @param li_attr li_attr
	 */
	public void setLi_attr(String li_attr) {
	    this.li_attr = li_attr;
	}

	/**
	 * a_attr属性取得。
	 * @return a_attr
	 */
	public String getA_attr() {
	    return a_attr;
	}

	/**
	 * a_attr属性设定。
	 * @param a_attr a_attr
	 */
	public void setA_attr(String a_attr) {
	    this.a_attr = a_attr;
	}

	/**
	 * 组织机构是否可见flag 取得。 ： 0 不可见 ， 1 可见 ；
	 * @return 组织机构是否可见flag ： 0 不可见 ， 1 可见 ；
	 */
	public Integer getIsvisible() {
	    return isvisible;
	}

	/**
	 * 组织机构是否可见flag 设定。 ： 0 不可见 ， 1 可见 ；
	 * @param isvisible 组织机构是否可见flag ： 0 不可见 ， 1 可见 ；
	 */
	public void setIsvisible(Integer isvisible) {
	    this.isvisible = isvisible;
	}

	/**
	 * 组织机构描述属性取得。
	 * @return 组织机构描述
	 */
	public String getDescription() {
	    return description;
	}

	/**
	 * 组织机构描述属性设定。
	 * @param description 组织机构描述
	 */
	public void setDescription(String description) {
	    this.description = description;
	}

	/**
	 * 逻辑删除状态 属性取得。： 0 正常 ， 1 删除 。
	 * @return 逻辑删除状态： 0 正常 ， 1 删除 。
	 */
	public Integer getDeleteflag() {
	    return deleteflag;
	}

	/**
	 * 逻辑删除状态 属性设定。： 0 正常 ， 1 删除 。
	 * @param deleteflag 逻辑删除状态： 0 正常 ， 1 删除 。
	 */
	public void setDeleteflag(Integer deleteflag) {
	    this.deleteflag = deleteflag;
	}

}
