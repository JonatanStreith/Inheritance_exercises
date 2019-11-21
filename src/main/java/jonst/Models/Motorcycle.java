package jonst.Models;

public class Motorcycle extends Vehicle {
    private String OwnersGangName;
    private int numberOfDecals;

    public Motorcycle(String brand, int licenseId, String ownersGangName, int numberOfDecals) {
        super(brand, licenseId);
        OwnersGangName = ownersGangName;
        this.numberOfDecals = numberOfDecals;
    }

    public void Drive(){
        System.out.println("You race down the highway at illegal speeds. The girls go crazy!");
    }
}
