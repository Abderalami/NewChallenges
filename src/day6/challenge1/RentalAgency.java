package day6.challenge1;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void rentVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        System.out.println("day6.challenge1.Vehicle rented: " + vehicle);
    }

    public void displayAvailableVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No available vehicles.");
        } else {
            System.out.println("Available vehicles:");
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }
}
