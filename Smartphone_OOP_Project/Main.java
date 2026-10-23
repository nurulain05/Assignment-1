import java.util.Scanner;

/**
 * Main class creates Smartphone objects and demonstrates
 * getters, setters, selection structures, and looping.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an object using the default constructor.
        Smartphone phone1 = new Smartphone();

        // Create an object using the parameterized constructor.
        Smartphone phone2 = new Smartphone(
            "Samsung", "Galaxy A55", 256, 8, 80, 1599.00, true
        );

        // Display details of both objects.
        phone1.displayInfo();
        phone2.displayInfo();

        // Demonstrate setter and getter usage.
        phone2.setBatteryPercent(15);
        System.out.println("\nUpdated Battery: "
                + phone2.getBatteryPercent() + "%");

        // if-else selection checks the battery status.
        System.out.println("Battery Status: "
                + phone2.checkBatteryStatus());

        // The for loop repeats the message three times.
        System.out.println("\n--- Storage Usage ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Storage check number " + i);
        }

        // The switch structure lets the user choose an action.
        System.out.println("\n--- Smartphone Menu ---");
        System.out.println("1. Display smartphone information");
        System.out.println("2. Check battery status");
        System.out.println("3. Calculate remaining storage");
        System.out.print("Choose an option (1-3): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                phone2.displayInfo();
                break;
            case 2:
                System.out.println(phone2.checkBatteryStatus());
                break;
            case 3:
                System.out.print("Enter used storage in GB: ");
                int used = input.nextInt();

                // Validate that the entered storage is not negative.
                if (used < 0) {
                    System.out.println("Invalid storage value.");
                } else {
                    System.out.println("Remaining Storage: "
                            + phone2.calculateRemainingStorage(used)
                            + " GB");
                }
                break;
            default:
                System.out.println("Invalid menu option.");
        }

        input.close();
    }
}
