import java.util.Scanner;

public class AppointmentBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Welcome to the Appointment Booking System");
            System.out.println("1. Book an appointment");
            System.out.println("2. View doctor's availability");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookAppointment(scanner);
                    break;
                case 2:
                    viewDoctorAvailability();
                    break;
                case 3:
                    System.out.println("Thank you for using the Appointment Booking System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void bookAppointment(Scanner scanner) {
        scanner.nextLine(); 
        System.out.println("Please enter patient details:");
        System.out.print("Patient Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Doctor's Name: ");
        String doctorName = scanner.nextLine();
        System.out.println("Choose Time booking: 1 - 4 option");
        System.out.println("option 1. 7-11 am monday-thursday");
        System.out.println("option 2. 7-11 am friday-sunday");
        System.out.println("option 3. 1-5 pm monday-thursday");
        System.out.println("option 4. 1-5 pm friday-sunday");

        String timeBook = "";
        int timeBook1 = scanner.nextInt();
         switch (timeBook1) {
            case 1:
                timeBook = "7-11 am monday-thursday";
                break;
            case 2:
                timeBook = "7-11 am friday-sunday";

                break;
            case 3:
                timeBook = "1-5 pm monday-thursday";

                break;
            case 4:
                timeBook = "1-5 pm friday-sunday";

                break;
            default:
                timeBook = "1-5 pm friday-sunday";

        }
        System.out.println("Appointment booked for patient " + patientName + " with Doctor " + doctorName  +  " At " + timeBook );
    }

    private static void viewDoctorAvailability() {
        System.out.println("Doctor's availability:");
        System.out.println("Dr. Piseth => Available on Monday and Thursday at 7-11 am");
        System.out.println("Dr. Vireak => Available on Friday and Sunday at 1-5 pm");
        System.out.println("Dr. Oudom => Available on Monday and Thursday at 7-11 am");
        System.out.println("Dr. Seyha => Available on Friday and Sunday at 1-5 pm");
    }
}