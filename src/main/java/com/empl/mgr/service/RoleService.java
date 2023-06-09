package com.empl.mgr.service;

import com.empl.mgr.support.JSONReturn;

public abstract interface RoleService {

	/**
	 * @author 123
	 * @param page
	 * @param searchVal
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn findRoleList(int page, String searchVal, String acctName);

	/**
	 * @author 123
	 * @param page
	 * @param searchVal
	 * @return
	 */
	public abstract JSONReturn findRolePage(int page, String searchVal);

	/**
	 * @author 123
	 * @param roleName
	 * @param desc
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn addRole(String roleName, String desc, String acctName);

	/**
	 * @author 123
	 * @param id
	 * @param roleName
	 * @param desc
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn modifyRole(long id, String roleName, String desc, String acctName);

	/**
	 * @author 123
	 * @param id
	 * @param acctName
	 * @return
	 */
	public abstract JSONReturn deleteRole(long id, String acctName);

	/**
	 * @author 123
	 * @param id
	 * @return
	 */
	public abstract JSONReturn findRoleById(long id);

}
