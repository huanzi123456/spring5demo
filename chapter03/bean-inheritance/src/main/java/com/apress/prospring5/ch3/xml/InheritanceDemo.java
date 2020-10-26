package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by iuliana.cosmina on 2/25/17.
 *
 *
 */
public class InheritanceDemo {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();

		Singer parent = (Singer) ctx.getBean("parent");
		Singer child = (Singer) ctx.getBean("child");

		System.out.println("Parent:\n" + parent);
		System.out.println("Child:\n" + child);
	}
}
//如果不想从applicationContext中查找父bean,设置  abstract="true"
//这个bean是“abstract”，即不是要实例化它本身，而是仅充当具体子bean定义的父对象吗？
// 默认值为“ false”。指定“ true”以告诉Bean工厂无论如何不要尝试实例化该特定的Bean。
