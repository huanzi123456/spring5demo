package com.apress.prospring5.ch3.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by iuliana.cosmina on 2/23/17.
 *
 * 注解类型: 自动注入!
 * 		注解扫描:
 *			@Component("gopher")
 *
 *         	@Component("johnMayer")
 * 			@DependsOn("gopher")
 */
public class AnnotatedDependsOnDemo {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-02.xml");
		ctx.refresh();

		Singer johnMayer = ctx.getBean("johnMayer", Singer.class);
		johnMayer.sing();

		ctx.close();
	}

}
