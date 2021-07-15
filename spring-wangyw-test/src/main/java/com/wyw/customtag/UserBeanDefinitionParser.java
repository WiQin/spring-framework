package com.wyw.customtag;


import com.wyw.test.bean.Customer;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;


/**
 * 解析xsd文件中的定义和组件定义
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	//Element对应的类
	@Override
	protected Class<?> getBeanClass(Element element) {
		return Customer.class;
	}

	//从element中解析并提取对应元素
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String id = element.getAttribute("id");
		String name = element.getAttribute("name");
		//将提取到的数据放入到BeanDefinitionBuilder中,待到完成所有bean的解析后统一注册到beanFactory中
		if (StringUtils.hasText(id)) {
			builder.addPropertyValue("id",id);
		}
		if (StringUtils.hasText(name)) {
			builder.addPropertyValue("name",name);
		}
	}
}
