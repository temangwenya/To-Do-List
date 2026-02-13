/** This file contains code for a TaskManagement class.
 * Code to manage individual tasks.
 *      - addTasks() method to add tasks to the list
 *      - viewTasks() method to display tasks in the list
 *      - checkOffTasks() method to remove tasks from the list
 * */

import java.util.ArrayList;

public class TaskManagement {
    // Global Variables & Objects
        // Objects
            static ArrayList<TaskAttributes> taskArrayList = new ArrayList<>();
            static TaskAttributes newTask = new TaskAttributes();
        
        // Variables
            static String yesORno;

// Add Tasks Method
    public static void addTasks() {
        // Local objects & variables
            String taskName;
            String description;
            String status;
            String dueDate;
            String priority;

        // User Input for TaskAttributes
        System.out.print("Enter the task name: ");
        taskName = ToDoList.scanner.nextLine();
        System.out.print("Enter the task description: ");
        description = ToDoList.scanner.nextLine();
        System.out.print("Enter the task status: ");
        status = ToDoList.scanner.nextLine();
        System.out.print("Enter the task due date: ");
        dueDate = ToDoList.scanner.nextLine();
        System.out.print("Enter the task priority: ");
        priority = ToDoList.scanner.nextLine();

        // Create new TaskAttributes object and its attributes
        newTask.taskName = taskName;
        newTask.description = description;
        newTask.status = status;
        newTask.dueDate = dueDate;
        newTask.priority = priority;

        
        taskArrayList.add(newTask); // add the new task to the ArrayList
        
        System.out.println("\nTask added successfully!");
    }

// View Tasks Method
    public static void viewTasks() {
        // loop to display tasks
        if (taskArrayList.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            for (TaskAttributes task : taskArrayList) {
                System.out.println(task.taskName);
                System.out.println("Description: " + task.description);
                System.out.println("Status: " + task.status);
                System.out.println("Due Date: " + task.dueDate);
                System.out.println("Priority: " + task.priority);
                System.out.println("-------------------------");
            }
        }
    }

}