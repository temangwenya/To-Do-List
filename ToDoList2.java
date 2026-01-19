// Refactored: cleaner code structure and improved readability

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList2 {
        // Global 
            //Objects
            static Scanner scanner = new Scanner(System.in);
            static ArrayList<String> tasks = new ArrayList<>();
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
        
        // Final Display
            System.out.println("_________________________");
            System.out.println("Tasks for the day:"); // I want it to be: for <dqy>, <date>. To fetch it from addTask method, I probably need to make it global or return it, or pointers or something/
            for (String t : tasks) {
                System.out.println("- " + t);
            }
        }


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
            String task = " ";
            String yesORno = " ";
                //loop collects inputs and stores them in an ArrayList
            do {
                System.out.print("Task: ");
                task = scanner.nextLine();
                System.out.println(" ");
                tasks.add(task); // Add input to the ArrayList
                
                System.out.println("Wanna add another task? (yes/no)");
                yesORno = scanner.nextLine();
                System.out.println(" ");
                if (yesORno == "no"){
                    scanner.close(); //cosing the scanner is good practice. Not sure why though.
                    break;
                }
            } while (yesORno.equals("yes")); 
    }    

    static void checkOffTasks() {
            System.out.println("    CHECK OFF TASKS:");
            System.out.println("    ================");
        
        // Date
            System.out.println(" DAY: ");
            System.out.println("DATE: ");
        // CHECK OFF TASKS
    }

}
