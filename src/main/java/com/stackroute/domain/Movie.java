package com.stackroute.domain;

public class Movie {
    public Movie(Actor actor) {
        this.actor = actor;
    }

    //Movie "has-A" relation with Actor
    Actor actor;
    public void movieDisplayInfo()
    {
        System.out.println("Actor class details");
        actor.actorDisplayInfo();
    }
}
