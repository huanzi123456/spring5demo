package com.apress.prospring5.ch3;


/**
 * 依赖注入: 构造函数注入
 */
public class ConstructorInjection {

	private Dependency dependency;

	public ConstructorInjection(Dependency dependency) {
		this.dependency = dependency;
	}

	@Override
	public String toString() {
		return dependency.toString();
	}
}
