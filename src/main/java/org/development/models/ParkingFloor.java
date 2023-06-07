package org.development.models;

import lombok.Data;

import java.util.List;

@Data
public class ParkingFloor {
    private int id;
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor(int floorNumber, List<ParkingSpot> parkingSpots) {
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
    }
}
