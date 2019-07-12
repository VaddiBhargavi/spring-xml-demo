package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //BeanLifecycleDemoBean beanLifecycleDemoBean= (BeanLifecycleDemoBean) context.getBean("lifecycle");
       //beanLifecycleDemoBean.customInit();
       context.registerShutdownHook();
    }
}
