package com.example.springbootdemo1.service.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 *
 * @author zhenghuan
 * @date 2022/2/16
 */
public class Tank implements Moveable {

    @Override
    public void move() {
        System.out.println("tank moving");
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        final Moveable m = (Moveable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{ Moveable.class },
                (proxy, method, args1) -> {
                    System.out.println("method " + method.getName() + " start...");
                    final Object o = method.invoke(tank, args);
                    System.out.println("method " + method.getName() + " end...");
                    return o;
                });
        m.move();
    }
}

interface Moveable {
    void move();
}
