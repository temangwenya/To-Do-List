// Refactored: cleaner code structure and improved readability

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList2 {
        // Global 
            //Objects
            static Scanner scanner = new Scanner(System.in);
            static ArrayList<String> toDoList = new ArrayList<>();
            //Variables
    
    public static void main(String[] args){
        
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
            switch (whatchaDoin) {
                case 1:
                    addTask();
                    break;
                case 2:
                    checkOffTasks();
                    break;
                default:
                    System.out.println("Please input 1 or 2.");
                    //restart programme
            }
        }

// Add Tasks
    static void addTask() {
        
            System.out.println("       ADD TASK:");
            //System.out.println("_________________________");
            System.out.println("       =========");
                scanner.nextLine();
        
        // Date
            System.out.print(" DAY: ");
            String day_ = scanner.nextLine();
            System.out.print("DATE: ");
            String date = scanner.nextLine();
            System.out.println("-----");
        
        // Tasks
            String yesORno = " ";
            
            do {
                System.out.print("Task: ");
                String task = scanner.nextLine();
                System.out.println(" ");
                
                System.out.println("Wanna add another task? (yes/no)");
                yesORno = scanner.nextLine();
                System.out.println(" ");
            } while (!yesORno.equals("no"));
                
                
            System.out.println("_________________________");
            System.out.println("Tasks for " + day_ + ", " + date + ":"); 
            
    }    

    //Check off Tasks
    static void checkOffTasks() {
            System.out.println("    CHECK OFF TASKS:");
            System.out.println("    ================");
        
        // Date
            System.out.println(" DAY: ");
            System.out.println("DATE: ");
        // CHECK OFF TASKS
    }

}
