package com.apress.prospring5.ch2.decoupled;


//解耦
//组合模式接触耦合:达到最终使用 MessageProvider.getMessage()

public class HelloWorldDecoupled {
    public static void main(String... args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
