package com.workGroup.FlyingControlApp.model;

public class Destination {
    private long destinationId;

    public Destination(long destinationId) {
        this.destinationId = destinationId;
    }

    public long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(long destinationId) {
        this.destinationId = destinationId;
    }
}
