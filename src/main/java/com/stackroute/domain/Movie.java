package com.stackroute.domain;

public class Movie {
    //Movie "has-A" relation with Actor
    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void movieDisplayInfo()
    {
        System.out.println("Actor class details");
        actor.actorDisplayInfo();
    }
}
