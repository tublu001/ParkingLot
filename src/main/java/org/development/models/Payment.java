package org.development.models;

import java.security.Timestamp;

public class Payment {
    private int id;
    private PaymentMode paymentMode;
    private int amount;
    private String referenceId;
    private Timestamp timestamp;
    private PaymentStatus paymentStatus;
}
