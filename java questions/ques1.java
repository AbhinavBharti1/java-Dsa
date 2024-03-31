//simple calculator

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        double number1, number2, result;

        do {
            System.out.print("Enter operator (+, -, *, /) or 'q' to quit: ");
            operator = scanner.next().charAt(0);

            if (operator == 'q' || operator == 'Q') {
                break;
            }

            System.out.print("Enter first number: ");
            number1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            number2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (number2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        result = number1 / number2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please try again.");
            }
        } while (true);

        System.out.println("Calculator is now closed. Thank you!");
        scanner.close();
    }
}

