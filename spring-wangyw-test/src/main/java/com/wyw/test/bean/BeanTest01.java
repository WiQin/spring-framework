package com.wyw.test.bean;

import com.wyw.config.AppConfig;
import com.wyw.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Bean生命周期
 *
 * @author wyw
 * @date 2021/03/24
 */
public class BeanTest01 {


	public static void main(String[] args) {
		// 初始化容器
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// 获取 bean
		User user = (User) context.getBean("user");
		System.out.println(user.toString());

		ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User xmlUser = (User) xmlContext.getBean("user");
		System.out.println(xmlUser.getName());
	}
}
