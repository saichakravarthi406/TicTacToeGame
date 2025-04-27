package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> tasks = new ArrayList<>();
            int choice;

            System.out.println("Welcome to To-Do List App!");

            while (true) {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Add Task");
                System.out.println("2. View Tasks");
                System.out.println("3. Remove Task");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1-4): ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer

                switch (choice) {
                    case 1:
                        System.out.print("Enter the task: ");
                        String task = scanner.nextLine();
                        tasks.add(task);
                        System.out.println("Task added successfully!");
                        break;

                    case 2:
                        System.out.println("\nYour Tasks:");
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks yet!");
                        } else {
                            for (int i = 0; i < tasks.size(); i++) {
                                System.out.println((i + 1) + ". " + tasks.get(i));
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter the task number to remove: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid task number!");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using To-Do List App. Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice! Please select");

                }
            }
        }
}
