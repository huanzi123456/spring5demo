package com.apress.prospring5.ch3;

//容器:获取依赖
public interface Container {
    Object getDependency(String key);
}
