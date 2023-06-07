package org.development.models;

import lombok.Data;

import java.util.List;

@Data
public class ParkingSpot {
    private int id;
    private int parkingSpotNumber;
    private Vehicle vehicle;
    private ParkingSpotStatus parkingSpotStatus;
    private List<VehicleType> supportedVehicleType;
}
