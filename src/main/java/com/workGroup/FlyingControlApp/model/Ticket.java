package com.workGroup.FlyingControlApp.model;

public class Ticket {
    private boolean isAvailable = true;
    private long ticketId;
    public boolean isAvailable() {
        return isAvailable;
    }

    public Ticket(long ticketId) {
        this.ticketId = ticketId;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
