Carpet Calculator

Overview

Create a CarpetCalculator that calculates the installation cost of a carpet installation job.  The cost is calculated by determining the area of each room and multiplying it by the price per square foot.  If specified by the constructor, the installation charge is added to the total cost.  If specified, a percent discount is applied to the overall total (total cost of rooms + installation).

The CarpetCalculator must be consumed in the following manner:

public class Main {
public static void main(String[] args) {
var carpetCalculator = new CarpetCalculator(5.00F);
carpetCalculator.addRoom(new Room(10, 20));
carpetCalculator.addRoom(new Room(20, 10));
System.out.println(carpetCalculator.getTotalCost());

        var carpetCalculator2 = new CarpetCalculator(5.00F, 500.00F);
        carpetCalculator2.addRoom(new Room(10, 20));
        carpetCalculator2.addRoom(new Room(20, 10));
        carpetCalculator2.addRoom(new Room(10, 10));
        System.out.println(carpetCalculator2.getTotalCost());

        var carpetCalculator3 = new CarpetCalculator(5.00F, 500.00F);
        carpetCalculator3.addRoom(new Room(10, 10));
        carpetCalculator3.addPercentDiscount(25);
        System.out.println(carpetCalculator3.getTotalCost());
    }
}

The Room class is a simple class that represents the width and length of a room.








The CarpetCalculator must implement the following interface:

public interface Calculatable {

    void addRoom(Room room);

    String getTotalCost();

    void addPercentDiscount(float percentDiscount);
}

The CarpetCalculator has two constructors that accepts:

The price per square foot
The price per square foot and installation charge

Output
The output for the main code above must match this exactly:

$2,000.00
$3,000.00
$750.00
