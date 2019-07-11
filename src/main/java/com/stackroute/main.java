package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    Movie mov1= context.getBean("movie1", Movie.class);
    mov1.movieDisplayInfo();
    Movie mov2= context.getBean("movie2", Movie.class);
    mov2.movieDisplayInfo();
        System.out.println(mov1==mov2);
        System.out.println("------------------------------------");
    Movie mov3=context.getBean("movie3", Movie.class);
    mov3.movieDisplayInfo();
    Movie mov4=context.getBean("movie4",Movie.class);
    mov4.movieDisplayInfo();
    }
}
