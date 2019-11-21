package jonst.Models;

public class CarBase {
    private String carName;

    public CarBase(String carName) {
        this.carName = carName;
        System.out.println("This is "+this.carName);
    }
}
