package com.wyw;

import com.wyw.config.AppConfig;
import com.wyw.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {

	@Test
	public void test() {
		// 获取容器
		ApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);
		// 获取 bean
		User user = (User) ac.getBean("user");
		System.out.println(user.toString());
	}
}
