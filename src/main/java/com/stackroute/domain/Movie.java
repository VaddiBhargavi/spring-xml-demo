package com.stackroute.domain;

public class Movie {
    //Movie "has-A" relation with Actor
    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    //Display details of the actor through Movie which have HAS-A relation
    public void movieDisplayInfo()
    {
        System.out.println("Actor class details");
        actor.actorDisplayInfo();
    }
}
