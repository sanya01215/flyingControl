package com.workGroup.FlyingControlApp.model;

public class Destination implements BaseFlyingEntity{
    private long id;

    public Destination(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
