/**
 * ============================================================
 * MAIN CLASS - UseCase1HotelBookingApp
 * ============================================================
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Hotel Booking Management System.
 *
 * @author Developer
 * @version 1.0
 */

public class BookMyStayApp {

    /**
     * Application entry point
     * Executes when the program starts
     */
    public static void main(String[] args) {

        String appName = "Book My Stay";
        String version = "1.0";

        System.out.println("=================================");
        System.out.println("Welcome to " + appName + " App");
        System.out.println("Version : " + version);
        System.out.println("Hotel Booking System Started");
        System.out.println("=================================");
    }
}
class room{

    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sq ft");
        System.out.println("Price per night: ₹" + pricePerNight);
    }
}
class SingleRoom extends room {

    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}
class DoubleRoom extends room {

    public DoubleRoom() {
        super(2, 400, 2500.0);
    }

}
class SuiteRoom extends room {

    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}
class UseCase2RoomInitialization {

    public static void main(String[] args) {

        room single = new SingleRoom();
        room doubleRoom = new DoubleRoom();
        room suite = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("=== Single Room ===");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\n=== Double Room ===");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\n=== Suite Room ===");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}