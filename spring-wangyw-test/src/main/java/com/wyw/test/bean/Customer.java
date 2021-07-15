package com.wyw.test.bean;

import org.springframework.stereotype.Component;

/**
 * 基础实体类（用户信息）
 *
 * @author wyw
 * @date 2021/03/24
 */
@Component
public class Customer {
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
