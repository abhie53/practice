package Task_2;
/*6.Any year is input by the user. Write a program to determine whether the year is a leap year or not */
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();

        int leapyear = year % 4;

        if(leapyear == 0){
            System.out.println(year + " is leap year.");
        }else{
            System.out.println(year + " is not leap year.");
        }
        scanner.close();
    }    
}
