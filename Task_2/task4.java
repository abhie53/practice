package Task_2;
/*4.Write a program that asks the user to enter a numbers in three variables and then displays the largest number. */
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a 3 digit number ");
       int num = scanner.nextInt();
       
       int firstDigit = num / 100;
       int secontDigit = (num / 10) % 10;
       int thirdDigit = num % 10;

       if(firstDigit == secontDigit && firstDigit== thirdDigit){
        System.out.println("All digit are same");
       }else if(firstDigit >secontDigit && firstDigit > thirdDigit){
        System.out.println("First digit is greater");
       }else if(secontDigit > thirdDigit){
        System.out.println("Second digit is greater");
       }else{
        System.out.println("Third digit is greater");

       }
       scanner.close();

    }
}
