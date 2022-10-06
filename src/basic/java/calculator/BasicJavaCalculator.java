
package basic.java.calculator;

import java.util.Scanner;

public class BasicJavaCalculator {

    public static void main(String[] args) {
        // Stores two numbers
        double num1, num2;
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        // take the inputs
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Enter the operator (+,-,*,/)");
        char operator = scanner.next().charAt(0);
        double output = 0;
        
        switch (operator) {
            // add two numbers
            case '+' -> output = num1 + num2;
            //subtract two numbers
            case '-' -> output = num1 - num2;
            //multiply two numbers
            case '*' -> output = num1 * num2;
            //divide two numbers
            case '/' -> output = num1 / num2;
            default -> System.out.println("You entered wrong input");
        }
   
        System.out.println("The final result:");
        System.out.println();
        // print the final result
        System.out.println(num1 + " " + operator + " " + num2
                           + " = " + output);
        
    }
    
}
