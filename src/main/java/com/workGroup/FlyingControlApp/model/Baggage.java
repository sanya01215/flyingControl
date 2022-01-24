package com.workGroup.FlyingControlApp.model;

public class Baggage implements BaseFlyingEntity {
    private long id;
    private Destination baggageDestination;

    public Baggage(long id, Destination baggageDestination) {
        this.id = id;
        this.baggageDestination = baggageDestination;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Destination getBaggageDestination() {
        return baggageDestination;
    }

    public void setBaggageDestination(Destination baggageDestination) {
        this.baggageDestination = baggageDestination;
    }
}
