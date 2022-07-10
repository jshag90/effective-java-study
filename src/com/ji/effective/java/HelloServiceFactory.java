package com.ji.effective.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class HelloServiceFactory {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> aClass = Class.forName("com.ji.effective.java.ChineseHelloService");
        Constructor<?> constructor = aClass.getConstructor();
        HelloService helloService = (HelloService) constructor.newInstance();
        System.out.println(helloService.hello());

    }
}
