package com.wyw;

import com.wyw.entity.User;
import com.wyw.test.bean.Customer;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Descroption: XmlBeanFactory测试类
 * 该类在企业级应用中已经不再使用，转用ApplicationContext
 * 仅作学习用
 * @Author: wangyw
 * @Date: 2021/6/22 16:31
 */
public class XmlBeanFactoryTest {
	@Test
	public void test() {
		//1.通过ClassPathResource封装配置文件  new ClassPathResource("applicationContext.xml")
		//2.调用XmlBeanFactory构造器
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		////这里是根据bean属性的id查对应的bean信息的
		User user = (User) xmlBeanFactory.getBean("user");
		System.out.println(user.getId()+":"+user.getName());
	}

	@Test
	public void testCustom() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:custom-tag.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer.getId()+":"+customer.getName());

	}
}
