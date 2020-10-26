package com.apress.prospring5.ch3;

/**
 * 单例模型
 */
public class Singleton {
    private static Singleton instance;

    static {
        instance = new Singleton(); 
    }

    public static Singleton getInstance() {
        return instance; 
    }

    private Singleton(){
        // needed so developers cannot instantiate this class directly
    }
}
