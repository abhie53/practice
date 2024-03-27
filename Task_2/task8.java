package Task_2;
/* 8.Telephone Bill
Write a program to calculate the monthly telephone bills as per the following rule: 
Minimum Rs. 200 for up to 100 calls. 
Plus Rs. 0.60 per call for next 50 calls. 
Plus Rs. 0.50 per call for next 50 calls. 
Plus Rs. 0.40 per call for any call beyond 200 calls.
 */
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the total number of calls : ");
      int calls = scanner.nextInt();
        double miniBalance = 200;
        
      if(calls <= 100){
        System.out.println("Monthly bill of calls is : "+ miniBalance);
      }else if( calls <= 150){
        double totalPrice = miniBalance + (calls - 100) * .60;
        System.out.println("Monthly bill of calls is : "+ totalPrice); 
      }else if(calls <= 200){
        double totalPrice = miniBalance + 50 * .60 + (calls - 150)* .50;
        System.out.println("Monthly bill of calls is : "+ totalPrice);
      }else{
        double totalPrice = miniBalance + 50 * .60 + 50* .50 + (calls - 200) * .40;
        System.out.println("Monthly bill of calls is : "+ totalPrice);
      }
      scanner.close();
    }
    
}
