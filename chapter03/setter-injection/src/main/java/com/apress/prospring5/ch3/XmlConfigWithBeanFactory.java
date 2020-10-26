package com.apress.prospring5.ch3;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;


//通过xml.配置  beanFactory得实现
/**
 * 所使用的是 DefuultListableBeanFactory，它是 pring 提供的两个主要 BeanFactory
 * 实现之 并且使用 Xm!BeanDefir tionReader 从邓征 读取 BeanDefinition 信息。一旦创建并配置了 BeanFactory
 * 实现 就可以通过使用 泊位 配置文件中配置的名称 or写出 来检索 oracle an
 */
public class XmlConfigWithBeanFactory {

	public static void main(String... args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
		rdr.loadBeanDefinitions(new
				ClassPathResource("spring/xml-bean-factory-config.xml"));
		Oracle oracle = (Oracle) factory.getBean("oracle");
		System.out.println(oracle.defineMeaningOfLife());
	}
}
