package Task_1;
import java.util.Scanner;

public class program_11 {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digit number ");   
        int num = scanner.nextInt();

        //Extracting indidual digits
        int firstDigit = num / 100;
        int secondDigit = (num / 10) % 10;
        int thirdDigit = num % 10;

        //add the indidual number in reverse order
        int reverseNum = thirdDigit * 100 + secondDigit * 10 + firstDigit;
        System.out.println("Here is your reversed number : " + reverseNum);
        scanner.close();
    }
}
