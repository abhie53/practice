package Task_2;
/*5.Write a program that prompts the user to input a number. 
The program should then output the number and a message saying whether the number is positive, negative, or zero. */
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");       
        int num = scanner.nextInt();

        if(num == 0){
            System.out.println("Number is zero.");
        }else if(num > 0){
            System.out.println("Number is Positive.");
        }else{
            System.out.println("Number is negative.");
        }
        scanner.close();
    }
}
