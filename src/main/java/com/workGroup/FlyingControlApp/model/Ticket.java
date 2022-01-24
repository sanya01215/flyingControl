package com.workGroup.FlyingControlApp.model;

public class Ticket implements BaseFlyingEntity{
    private boolean isAvailable = true;
    private long id;
    public boolean isAvailable() {
        return isAvailable;
    }

    public Ticket(long id) {
        this.id = id;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
