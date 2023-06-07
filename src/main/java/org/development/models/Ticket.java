package org.development.models;

import java.security.Timestamp;

public class Ticket {
    private int id;
    private int ticketNumber;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Operator operator;
    private Gate gate;
    private Timestamp timestamp;
}
