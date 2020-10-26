package com.apress.prospring5.ch2.decoupled;

//消息渲染器
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
