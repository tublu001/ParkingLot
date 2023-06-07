package org.development.models;

import java.security.Timestamp;
import java.util.List;

public class Bill {
    private int id;
    private Ticket ticket;
    private Vehicle vehicle;
    private Operator operator;
    private Gate gate;
    private int amount;
    private List<Payment> payments;
    private Timestamp timestamp;
}
