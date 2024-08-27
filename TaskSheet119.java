import java.util.Scanner;

public class TaskSheet119 {

    
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

   
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error");
            return Double.NaN; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        
        double sum = add(number1, number2);
        double difference = subtract(number1, number2);
        double product = multiply(number1, number2);
        double quotient = divide(number1, number2);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (!Double.isNaN(quotient)) { 
            System.out.println("Quotient: " + quotient);
        }

        scanner.close();
    }
}
