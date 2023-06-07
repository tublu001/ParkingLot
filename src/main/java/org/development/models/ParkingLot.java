package org.development.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ParkingLot {
    private int id;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private int capacity;

    public ParkingLot(List<ParkingFloor> parkingFloors, List<Gate> gates, int capacity) {
        this.parkingFloors = parkingFloors;
        this.gates = gates;
        this.capacity = capacity;
    }
}
