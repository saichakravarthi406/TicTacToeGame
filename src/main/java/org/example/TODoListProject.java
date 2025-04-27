package org.example;
import java.util.ArrayList;
import java.util.Scanner;

// Task class to represent each to-do item
class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return description + " [Completed: " + isCompleted + "]";
    }
}

public class TODoListProject {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to To-Do List Project!");

        while (running) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            switch (choice) {
                case 1: // Add Task
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    tasks.add(new Task(description));
                    System.out.println("Task added!");
                    break;

                case 2: // View Tasks
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet, bro!");
                    } else {
                        System.out.println("Your Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3: // Delete Task
                    if (tasks.isEmpty()) {
                        System.out.println("Nothing to delete, bro!");
                    } else {
                        System.out.println("Your Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Enter task number to delete: ");
                        int taskNum = scanner.nextInt();
                        if (taskNum > 0 && taskNum <= tasks.size()) {
                            tasks.remove(taskNum - 1);
                            System.out.println("Task deleted!");
                        } else {
                            System.out.println("Invalid number, bro!");
                        }
                    }
                    break;

                case 4: // Exit
                    running = false;
                    System.out.println("Catch you later, bro!");
                    break;

                default:
                    System.out.println("Wrong option, try again!");
            }
        }
        scanner.close();
    }
}
