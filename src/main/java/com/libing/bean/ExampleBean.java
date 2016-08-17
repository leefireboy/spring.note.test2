/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <P>
 * Description:TODO
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月19日下午3:52:56
 */
@Component
//@Scope("prototype")// 原型的 Bean Spring不支持销毁
public class ExampleBean {

    public ExampleBean() {
        super();
        System.out.println("实例化 ExampleBean");
    }

    @PostConstruct// 初始化注解
    public void init() {
        System.out.println("初始化 ExampleBean 对象");
    }

    @PreDestroy// 销毁注解
    public void destroy() {
        System.out.println("销毁 ExampleBean 对象");
    }

    public void execute() {
        System.out.println("执行 ExampleBean 处理");
    }

}

