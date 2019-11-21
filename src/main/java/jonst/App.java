package jonst;

import jonst.Models.*;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static Scanner inputData;

    public static void main(String[] args) {
        inputData = new Scanner(System.in);

/*        Vehicle[] vehicleList = new Vehicle[5];

        vehicleList[0] = new Car("Volvo", 555123, 6);
        vehicleList[1] = new Motorcycle("Kawazaki", 123456, "Dell's Angels", 15);
        vehicleList[2] = new Truck("Kia", 984103, 200);
        vehicleList[3] = new Vehicle("Tank", 873488);
        vehicleList[4] = new Vehicle("Spaceship", 000);

        for (Vehicle vehicle : vehicleList) {
            vehicle.Drive();
        }*/


        /*ChildBook c1 = new ChildBook("Milford Blue", 1975, "child","Harvey the Hamster Goes Quantum Surveying");
        ChildBook c2 = new ChildBook("Mephanie Steyer", 2007, "child","Sparklepoo the Batboy and the Mystery of the Stroppy Teenager");
        ChildBook c3 = new ChildBook("Dana Cross", 1984, "child","Unicorns of Rainbow Valley");

        AdultBook a1 = new AdultBook("Donaldo Smithers", 2013, "adult", "Advanced Geometrics");
        AdultBook a2 = new AdultBook("Ron Ronshirt", 2017, "adult", "Virgins of Wisconsin");
        AdultBook a3 = new AdultBook("Dana Cross Jr.", 2009, "adult", "Lesbian Outlaw Unicorns of the Rainbow Wasteland");*/

/*        Book[] bookArray = ChildBook.showChildBook();

        for (Book book: bookArray) {
            System.out.println(book.getAuthor() + ": " + book.getTitle() + "(" + book.getYear() + ")");
        }

        System.out.println("-------------------------");

        bookArray = AdultBook.showAdultBook();

        for (Book book: bookArray) {
            System.out.println(book.getAuthor() + ": " + book.getTitle() + "(" + book.getYear() + ")");
        }*/

/*        System.out.println(AdultBook.searchAdultBook());

        System.out.println(ChildBook.searchChildBook());*/


/*        IceCream ice1 = new IceCream();
        ice1.description();

        IceCream ice2 = new Chocolate();
        ice2.description();

        IceCream ice3 = new Vanille();
        ice3.description();*/


        inputData.close();

    }
}
