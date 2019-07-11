package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    //Movie "has-A" relation with Actor
    Actor actor;
    private ApplicationContext context= null;

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void movieDisplayInfo()
    {
        System.out.println("Actor class details");
        actor.actorDisplayInfo();
    }

    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("setter class");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanfactory is=" +beanFactory);
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("beanname is=" +beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        System.out.println("Applicationcontext =" +context);
    }
}
