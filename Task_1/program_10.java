package Task_1;
import java.util.Scanner;

public class program_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-digit Number ");
        int num = scanner.nextInt();

        //Extracting indidual number.
        int firstDigit = num / 100;
        int secondDigit = (num / 10) % 10;
        int thirdDigit = num % 10;

        //sum of digits
        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.println("Sum of digis is " + sum);
        scanner.close();
    }
}
