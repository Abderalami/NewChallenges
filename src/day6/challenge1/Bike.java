package day6.challenge1;

public class Bike extends Vehicle{
    private boolean hasGear;

    public Bike(String make, String model, double rentalPrice, boolean hasGear) {
        super(make, model, rentalPrice);
        this.hasGear = hasGear;
    }

    // Getter and setter
    public boolean isHasGear() {
        return hasGear;
    }

    public void setHasGear(boolean hasGear) {
        this.hasGear = hasGear;
    }

    @Override
    public String toString() {
        return super.toString() + ", Has Gear: " + hasGear;
    }
}
