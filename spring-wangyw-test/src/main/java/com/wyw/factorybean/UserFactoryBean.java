package com.wyw.factorybean;

import com.wyw.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Descroption: FactoryBean
 * @Author: wangyw
 * @Date: 2021/7/15 18:59
 */
public class UserFactoryBean implements FactoryBean<User> {

	private String userStr;

	@Override
	public User getObject() throws Exception {
		String[] strArray = userStr.split(",");
		User user = new User();
		user.setId(Long.valueOf(strArray[0]));
		user.setName(strArray[1]);

		return user;
	}

	@Override
	public Class<User> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public String getUserStr() {
		return userStr;
	}

	public UserFactoryBean setUserStr(String userStr) {
		this.userStr = userStr;
		return this;
	}
}
