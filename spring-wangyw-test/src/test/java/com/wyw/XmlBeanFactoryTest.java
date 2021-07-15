package com.wyw;

import com.wyw.entity.User;
import com.wyw.entity.Customer;
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
		ApplicationContext context = new ClassPathXmlApplicationContext("custom-tag.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer.getId()+":"+customer.getName());

	}

	//ps:你是从FactoryBean源码看过来的吗,不是的话过去看看,有惊喜
	@Test
	public void testFactoryBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//这里返回User
		// spring通过反射机制发现实现了FactoryBean接口,此时Spring容器调用FactoryBean.getObject返回
		Object userFactoryBean = context.getBean("userFactoryBean");
		System.out.println(userFactoryBean.toString());
		//这里返回FactoryBean
		//FactoryBean是我的生产工厂,要获取,得加钱(&)
		Object factoryBean = context.getBean("&userFactoryBean");
		System.out.println(factoryBean.toString());
		//怎么实现的？ emmm...还没看
	}
}
