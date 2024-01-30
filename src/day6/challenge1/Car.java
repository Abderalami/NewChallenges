package day6.challenge1;

public class Car extends Vehicle {
    private int seatCapacity;

    public Car(String make, String model, double rentalPrice, int seatCapacity) {
        super(make, model, rentalPrice);
        this.seatCapacity = seatCapacity;
    }

    // Getter and setter
    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seat Capacity: " + seatCapacity;
    }
}
