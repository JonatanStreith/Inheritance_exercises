package jonst.Models;

public class Car extends Vehicle {
    private int seats;

    public Car(String brand, int licenseId, int seats) {
        super(brand, licenseId);
        this.seats = seats;
    }

    public void Drive(){
        System.out.println("You head down to the store with the kids and buy groceries.");
    }
}
