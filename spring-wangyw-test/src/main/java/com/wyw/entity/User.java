package com.wyw.entity;

import org.springframework.stereotype.Component;

/**
 * 基础实体类（用户信息）
 *
 * @author wyw
 * @date 2021/03/24
 */
@Component
public class User {
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
