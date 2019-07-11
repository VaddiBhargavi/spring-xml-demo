package com.stackroute.domain;

public class Movie {

    //Movie "has-A" relation with Actor
    Actor actor;

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
