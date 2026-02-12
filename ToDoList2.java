// Refactored: cleaner code structure and improved readability

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList2 {
        // Global 
            //Objects
            static Scanner scanner = new Scanner(System.in);
            static ArrayList<String> taskArrayList = new ArrayList<>();
            //Variables
    
    public static void main(String[] args){
        
        // Greeting
            System.out.println("      TO-DO LIST:");
            System.out.println("      ===========");

            int whatchaDoin;
            do {
                System.out.println("_________________________");
                System.out.println("Hi. Whatcha doinnn? (1, 2, or 3)");
                System.out.println("1. Add Task");
                System.out.println("2. Check Off Tasks");
                System.out.println("3. Exit"); 
                whatchaDoin = scanner.nextInt();
                System.out.println("_________________________");
                
            // Whatcha Doin
                switch (whatchaDoin) {
                    case 1:
                        addTask();
                        displayTasks(); // Final Display
                        break;
                    case 2:
                        checkOffTasks();
                        displayTasks(); // Final Display
                        break;
                    case 3: 
                        System.out.println("Exiting program. Goodbye!");
                        break;
                    default:
                        System.out.println("Please input 1, 2, or 3.");
                        //restart programme
                }
                
                
            } while (whatchaDoin != 3); // Infinite loop to keep the program running until manually exited
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
                taskArrayList.add(task); // Add input to the ArrayList
                
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
            scanner.nextLine();
        
        // Date
            System.out.print(" DAY: ");
                String day_ = scanner.nextLine();
            System.out.print("DATE: ");
                String date = scanner.nextLine();
            System.out.println("-----");
        
        // CHECK OFF TASKS
        System.out.println("_________________________");
        System.out.println("Tasks for the day:"); // I want it to be: for <dqy>, <date>. To fetch it from addTask method, I probably need to make it global or return it, or pointers or something/
        for (String t : taskArrayList) {
            System.out.println("- " + t);
            }
            int task;
            String yesORno = " ";

                //loop removes inputs from the taskArraylist
            do {
                    System.out.print("Enter task number: ");
                    task = scanner.nextInt();
                    System.out.println(" ");
                    taskArrayList.remove(task); // Add input to the ArrayList
                    
                    System.out.println("Wanna check off another task? (yes/no)");
                    yesORno = scanner.nextLine();
                    //System.out.println(" ");
                    if (yesORno == "no"){
                        scanner.close(); //cosing the scanner is good practice. Not sure why though.
                        break;
                    }
            } while (yesORno.equals("yes")); 

    }

    static void displayTasks() {
        System.out.println("_________________________");
        System.out.println("Tasks for the day:"); // I want it to be: for <dqy>, <date>. To fetch it from addTask method, I probably need to make it global or return it, or pointers or something/
        for (String t : taskArrayList) {
            System.out.println("- " + t);
        }
        System.out.println("_________________________");
    }
    

}
