package day6.challenge1;
public class VehicleRentalSystem {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Car car1 = new Car("Toyota", "Camry", 400, 5);
        Car car2 = new Car("BMW","Serie 3", 600, 4);

        Bike bike = new Bike("Yamaha", "YZF-R1", 600, true);

        agency.addVehicle(car1);
        agency.addVehicle(car2);
        agency.addVehicle(bike);

        agency.displayAvailableVehicles();

        agency.rentVehicle(car1);

        agency.displayAvailableVehicles();
    }
}


