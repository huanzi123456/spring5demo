package com.apress.prospring5.ch3;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖查找: 依赖拉取,上下文依赖查找
 */
//##依赖拉取,根据需要从注册表中提取依赖项
public class DependencyPull {
    public static void main(String... args) {
        //ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext
           ("spring/app-context.xml");
        //根据需要从注册表中提取依赖项  ,，它广泛使用jndi查找来获得注册表的依赖项
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
