package jonst.Models;

public class Vehicle {
    private String brand;
    private int licenseId;

    public Vehicle(String brand, int licenseId) {
        this.brand = brand;
        this.licenseId = licenseId;
    }


    public void Drive(){
        System.out.println("You drive your vehicle around town.");
    }
}
