package com.googosoft.pojo;

import java.util.Set;

public class Role {
	private String id;
    private String roleName;
    private Set<Permissions> permissions;//角色对应的权限的集合
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Set<Permissions> getPermissions() {
		return permissions;
	}
	public void setPermissions(Set<Permissions> permissions) {
		this.permissions = permissions;
	}
	public Role(String id, String roleName, Set<Permissions> permissions) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.permissions = permissions;
	}
    
}
