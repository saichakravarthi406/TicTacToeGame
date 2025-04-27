package org.example;
import java.util.Scanner;

public class SimpleCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double num1, num2;
            char operator;
            double result = 0;

            System.out.println("Welcome to Simple Calculator!");

            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        scanner.close();
                        return;
                    }
                    break;

                default:
                    System.out.println("Error: Invalid operator!");
                    scanner.close();
                    return;
            }

            System.out.println("Result: " + result);
            scanner.close();
        }
    }


