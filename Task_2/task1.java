package Task_2;
/*1.	Write a program that asks the user to enter a number and
 displays whether entered number is an odd number or even number. */
 import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
         
        if(num % 2 == 0){
            System.out.println(num +" is even number.");
        }else{
            System.out.println(num +" is odd number.");
        }
        scanner.close();
    }
}
