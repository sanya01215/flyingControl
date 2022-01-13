package com.workGroup.FlyingControlApp.model;

public class Baggage {
    private long baggageId;
    private Destination baggageDestination;

    public Baggage(long baggageId, Destination baggageDestination) {
        this.baggageId = baggageId;
        this.baggageDestination = baggageDestination;
    }

    public long getBaggageId() {
        return baggageId;
    }

    public void setBaggageId(long baggageId) {
        this.baggageId = baggageId;
    }

    public Destination getBaggageDestination() {
        return baggageDestination;
    }

    public void setBaggageDestination(Destination baggageDestination) {
        this.baggageDestination = baggageDestination;
    }
}
