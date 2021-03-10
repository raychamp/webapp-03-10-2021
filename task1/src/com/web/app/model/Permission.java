package com.web.app.model;

import java.io.Serializable;

//@Entity
//@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "permission" }) })
public class Permission implements Serializable {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String permission;

	Permission() {
		// Form ORM
	}

	public Permission(String permission) {
		this.permission = permission;
	}

	public Long getId() {
		return id;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
}

