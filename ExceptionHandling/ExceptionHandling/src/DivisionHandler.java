import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionHandler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();


            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter whole numbers only.");

        } finally {
            input.close();
        }
    }
}

