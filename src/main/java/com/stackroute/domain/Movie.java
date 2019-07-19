package com.stackroute.domain;

public class Movie {

    //Movie "has-A" relation with Actor
    Actor actor;
    //Default Constructor
    public Movie() {
    }

    //Constructor
    public Movie(Actor actor) {
        this.actor = actor;
    }

    //Display details of the actor
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
