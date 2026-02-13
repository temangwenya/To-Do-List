// Imports
    import java.util.Scanner;
    import java.util.ArrayList;

public class ToDoList {
    // Global Objects & Variables
        // Objects
            static Scanner scanner = new Scanner(System.in);
            static ArrayList<TaskAttributes> taskArrayList = new ArrayList<>();
            static TaskAttributes newTask = new TaskAttributes();
            static TaskManagement taskManagement = new TaskManagement();
        
        // Variables
            static String yesORno;

    public static void main(String[] args) throws Exception {
        // Local Objects & Variables
            int whatchaDoin; // User input for menu selection


        // Ashe le kae
            Greeting(); 

        // Menu Loop    
            while (true) {
            // Display Menu
                System.out.println("\nHi. Whatcha doinnn? (Enter a number to select an option)");
                System.out.println("1. Add a task");
                System.out.println("2. View tasks");
                System.out.println("3. Check off tasks");
                System.out.println("4. Exit");
                whatchaDoin = scanner.nextInt();
                    scanner.nextLine(); // consume  newline character
                // what to do with watchaDoin input
                switch (whatchaDoin) {
                    case 1:
                        System.out.println("Adding a task...");
                        System.out.println("_________________________");
                        addTasks();
                        break;
                    case 2:
                        System.out.println("Viewing tasks...");
                        System.out.println("_________________________");
                        viewTasks();
                        break;
                    case 3:
                        System.out.println("Checking off tasks...");
                        System.out.println("_________________________");
                        checkOffTasks();
                        break;    
                    case 4:
                        System.out.println("\nExiting the program. Goodbye!");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Yeaa. That's not it shawty. Enter a number from 1 to 4.");
                }
            }        
    }


// Greeting Method
    public static void Greeting() {
        System.out.println("      TO-DO LIST:");
        System.out.println("      ===========");
        System.out.println("Welcome to your To-Do List!");
        System.out.println(" _________________________");
    }

// Add Tasks Method 
    public static void addTasks() {
        System.out.println("       ADD TASK:");
        System.out.println("       =========\n");
        // loop to add and store tasks in the ArrayList
        do {
            TaskManagement.addTasks();
            
            System.out.println("\nDo you want to add another task? (yes/no)");
            yesORno = scanner.nextLine();
        } while (yesORno.equalsIgnoreCase("yes"));
        System.out.println("_________________________");
    }

// View Tasks Method
    public static void viewTasks() {        
        System.out.println("       VIEW TASKS:");
        System.out.println("       =========\n");
        TaskManagement.viewTasks(); // display tasks method in TaskManagement class        
    }

// Check Off Tasks Method
    public static void checkOffTasks() {
        // TODO: Code to remove a task from the list



    }

}
