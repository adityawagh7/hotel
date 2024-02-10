import java.util.Scanner;

class Room {
    private int roomNumber;
    private int floorNumber;

    public Room(int roomNumber, int floorNumber) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}

class CustomerDetails extends Room {
    private String name;
    private String phoneNumber;
    private String dateOfBooking;

    public CustomerDetails(String name, String phoneNumber, String dateOfBooking, int roomNumber, int floorNumber) {
        super(roomNumber, floorNumber);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dateOfBooking = dateOfBooking;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Date of Booking: " + dateOfBooking);
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Floor Number: " + getFloorNumber());
    }
}

public class floor extends hotel {
    private static int roomCounter = 101; 
    private static int floorCounter = 1; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();


        System.out.print("Enter Date of Booking: ");
        String dateOfBooking = scanner.nextLine();

        int roomNumber = assignRoomNumber();
        int floorNumber = assignFloorNumber();

        CustomerDetails customer = new CustomerDetails(name, phoneNumber,  dateOfBooking, roomNumber, floorNumber);

        System.out.println("\nCustomer Booking Record:");
        customer.displayCustomerDetails();
    }

    private static int assignRoomNumber() {
        return roomCounter++;
    }

    private static int assignFloorNumber() {
        if (roomCounter % 100 == 1 && roomCounter != 101) {
            floorCounter++;
        }
        return floorCounter;
    }
}
