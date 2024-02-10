import java.util.Scanner;

public class hotel {
    private static int roomCounter = 1; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();


        System.out.print("Enter Date of Booking: ");
        String dateOfBooking = scanner.nextLine();

        System.out.print("Enter the number of rooms to assign: ");
        int numberOfRooms = scanner.nextInt();

        int[] roomNumbers = assignRoomNumbers(numberOfRooms);

        System.out.println("\nCustomer Booking Details:");
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Date of Booking: " + dateOfBooking);
        System.out.println("Assigned Room Numbers:");
        for (int i = 0; i < numberOfRooms; i++) {
            System.out.println("Room " + (i + 1) + ": " + roomNumbers[i]);
        }
    }

    private static int[] assignRoomNumbers(int numberOfRooms) {
        int[] roomNumbers = new int[numberOfRooms];
        for (int i = 0; i < numberOfRooms; i++) {
            roomNumbers[i] = roomCounter++;
        }
        return roomNumbers;
    }
}
