package com.stackroute.domain;

import org.springframework.context.ApplicationContext;


public class Movie {
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

    }

