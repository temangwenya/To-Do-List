// ToDoList1.java   INITIAL CODE
// Contains basic structure for a Java To-Do List application
import java.util.Scanner;
public class ToDoList1 {
    public static void main(String[] args){
        //Objects
            Scanner scanner = new Scanner(System.in);
        
        // Greeting
            System.out.println("      TO-DO LIST:");
            System.out.println("      ===========");
            System.out.println("_________________________");
            System.out.println("Hi. Whatcha doinnn? (1/2)");
            System.out.println("1. Add Task");
            System.out.println("2. Check off Tasks");
            int whatchaDoin = scanner.nextInt();
            System.out.println("_________________________");
        
        // Whatcha Doin
            if (whatchaDoin == 1) {
                System.out.println("       ADD TASK:");
                //System.out.println("_________________________");
                System.out.println("       =========");
            
            // Date
                System.out.print(" DAY: ");
                String day_ = scanner.nextLine();
                    scanner.nextLine();                
                System.out.print("DATE: ");
                String date = scanner.nextLine();
                System.out.println("-----");
            
            // Tasks
                System.out.print("Task: ");
                String task_ = scanner.nextLine();
            
            // Add Another Task
                System.out.println("Wanna add another task? (true/false)");
                boolean addTask = scanner.nextBoolean();
                if (addTask == true) {
                    // add task
                    System.out.print("Task: ");
                    String task = scanner.nextLine();
                        scanner.nextLine();
                    System.out.println("Wanna add another task? (true/false)");
                        scanner.nextLine();
                } else {
                System.out.println("_________________________");
                System.out.println("Tasks for " + date + ":");
                //loop to display tasks            
                }           
            } else if (whatchaDoin == 2) {
                System.out.println("    CHECK OFF TASKS:");
                System.out.println("    ================");
            
            // Date
                System.out.println(" DAY: ");
                System.out.println("DATE: ");
            
            // CHECK OFF TASKS
            } else {
                System.out.println("Please input 1 or 2.");
                //restart programme
            }
    }
}
