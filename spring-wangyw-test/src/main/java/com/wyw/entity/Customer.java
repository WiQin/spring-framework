package com.wyw.entity;

import org.springframework.stereotype.Component;

/**
 * 自定义标签实体类
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
