import java.util.Scanner;

public class Main {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return 0.0; 
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculations = true;
         System.out.println("----------Calculator-----------");
        while (continueCalculations) {
            
            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            
            int choice = scanner.nextInt();  

            if (choice == 5) {
                System.out.println("Exiting the program...");
                continueCalculations = false;  
            } else if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;
                
                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        break;
                }

                
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                    System.out.println("");
                }
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();  
    }
}

