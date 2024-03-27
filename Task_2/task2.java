package Task_2;
/*2.Write a program that asks the user to enter a number and displays the absolute value of that number. */

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if(num < 0){
            num *= -1;
            System.out.println("absolute value is "+ num);
        }else{
            System.out.println("absolute value is "+ num);
        }
    }
}
