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
        Actor act = context.getBean("actor", Actor.class);
        act.actorDisplayInfo();
        //using xmlBeanFactory
        System.out.println("---Using XmlBeanFactory---");
        BeanFactory factory= new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie=(Movie) factory.getBean("movie");
        movie.movieDisplayInfo();
        //Using ApplicationContext
        System.out.println("---Using ApplicationContext---");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context1.getBean("movie", Movie.class);
        movie1.movieDisplayInfo();
        //Using BeanDefinitionRegistry and BeanDefinitionReader
        System.out.println("---Using BeanDefinitionRegistry and BeanDefinitionReader---");
        DefaultListableBeanFactory factory1 = new DefaultListableBeanFactory();
        BeanDefinitionRegistry register = new GenericApplicationContext(factory1);
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(register);
        reader.loadBeanDefinitions("beans.xml");
        Movie picture1 = (Movie) factory.getBean("movie");
        picture1.movieDisplayInfo();
    }
}
