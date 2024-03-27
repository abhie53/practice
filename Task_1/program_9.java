package Task_1;
import java.util.Scanner;

public class program_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();

        // Extracting individual digits
        int firstDigit = number / 10000;
        int secondLastDigit = (number / 10) % 10;

        // Calculating sum
        int sum = firstDigit + secondLastDigit;

        System.out.println("Sum of the first and second last digit: " + sum);
        scanner.close();
    }
}
