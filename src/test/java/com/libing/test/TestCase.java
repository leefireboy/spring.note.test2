/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.test;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.libing.bean.ExampleBean;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月19日下午3:49:17
 */
public class TestCase {

    @Ignore
    @Test
    public void testSpring() {

        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);

    }

    // @Ignore
    @Test
    public void testSpringNote() {

        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);

        ExampleBean exampleBean1 = ac.getBean("exampleBean", ExampleBean.class);
        ExampleBean exampleBean2 = ac.getBean("exampleBean", ExampleBean.class);
        exampleBean1.execute();
        System.out.println(exampleBean1 == exampleBean2);

        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();

    }

}
