package com.apress.prospring5.ch3;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * 声明spring组件!
 *
 *  p:messageProvider-ref 参数
 */
public class DeclareSpringComponents {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();
		MessageRenderer messageRenderer = ctx.getBean("renderer",
				MessageRenderer.class);
		messageRenderer.render();
		ctx.close();
	}
}
