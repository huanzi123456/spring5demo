package com.apress.prospring5.ch3;

//组件管理查询
public class ContextualizedDependencyLookup implements ManagedComponent {
    private Dependency dependency;

    @Override
    public void performLookup(Container container) {
        //获取 "myDependency" 特定依赖
        this.dependency = (Dependency) container.getDependency("myDependency"); 
    }

    @Override
    public String toString() {
    	return dependency.toString();
    }
}
