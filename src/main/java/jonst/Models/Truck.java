package jonst.Models;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck(String brand, int licenseId, double tonnage) {
        super(brand, licenseId);
        this.tonnage = tonnage;
    }

    public void Drive(){
        System.out.println("You deliver a load of gravel to a nearby construction site. Along the way, you send two isekai protagonists to their destined heroics.");
    }
}
