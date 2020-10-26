package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by iuliana.cosmina on 2/19/17.
 *
 * bean命名管理
 */
public class BeanCrazyNaming {


	/**
	 * id: jon
	 *  aliases: [jonathan, jim, johnny]
	 *
	 * id: jon johnny,jonathan;jim
	 *  aliases: []
	 */
	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-03.xml");
		ctx.refresh();
		Map<String, String> beans = ctx.getBeansOfType(String.class);
		beans.entrySet().stream().forEach(b ->
				System.out.println(
						"id: " + b.getKey() + "\n aliases: "
								+ Arrays.toString(ctx.getAliases(b.getKey())) + "\n")
		);
		ctx.close();
	}
}
