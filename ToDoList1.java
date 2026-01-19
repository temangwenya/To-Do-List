import java.util.Scanner;

/**
 * Console-based To-Do List application.
 * Allows users to add tasks or check off tasks using a simple menu.
 * This program is designed for learning basic Java concepts.
 */
public class ToDoList1 {

    /**
     * Entry point of the program.
     * Displays menu and handles user interaction.
     */
    public static void main(String[] args) {

        // Scanner object to take user input from console
        Scanner scanner = new Scanner(System.in);

        // =========================
        // Welcome Message & Menu
        // =========================
        System.out.println("      TO-DO LIST:");
        System.out.println("      ===========");
        System.out.println("_________________________");
        System.out.println("Hi. Whatcha doinnn? (1/2)");
        System.out.println("1. Add Task");
        System.out.println("2. Check off Tasks");

        // Reads user choice (1 or 2)
        int whatchaDoin = scanner.nextInt();
        System.out.println("_________________________");

        // =========================
        // Option 1: Add Task
        // =========================
        if (whatchaDoin == 1) {

            System.out.println("       ADD TASK:");
            System.out.println("       =========");

            // Clear leftover newline after nextInt()
            scanner.nextLine();

            // -------------------------
            // Date Input
            // -------------------------
            System.out.print(" DAY: ");
            String day = scanner.nextLine();

            System.out.print("DATE: ");
            String date = scanner.nextLine();
            System.out.println("-----");

            // -------------------------
            // Task Input
            // -------------------------
            System.out.print("Task: ");
            String task = scanner.nextLine();

            // -------------------------
            // Add Another Task Option
            // -------------------------
            System.out.println("Wanna add another task? (true/false)");
            boolean addTask = scanner.nextBoolean();

            // If user wants to add more tasks
            if (addTask == true) {

                // Clear newline after nextBoolean()
                scanner.nextLine();

                System.out.print("Task: ");
                String anotherTask = scanner.nextLine();

                System.out.println("Wanna add another task? (true/false)");
                // More task logic can be added here later

            } else {

                // Display tasks for the selected date
                System.out.println("_________________________");
                System.out.println("Tasks for " + date + ":");

                // Future loop can be added here to display all saved tasks
            }

        }

        // =========================
        // Option 2: Check Off Tasks
        // =========================
        else if (whatchaDoin == 2) {

            System.out.println("    CHECK OFF TASKS:");
            System.out.println("    ================");

            // -------------------------
            // Date Input (placeholder)
            // -------------------------
            System.out.println(" DAY: ");
            System.out.println("DATE: ");

            // Logic for checking off tasks can be added here later
        }

        // =========================
        // Invalid Input Handling
        // =========================
        else {
            System.out.println("Please input 1 or 2.");
            // Program restart logic can be added here
        }

        // Close scanner to prevent resource leak
        scanner.close();
    }
}
