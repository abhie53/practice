package Task_2;
/*3.Revenue can be calculated as the selling price of the product times the quantity sold,
i.e. revenue = price × quantity. Write a program that asks the user to enter product price 
and quantity and then calculate the revenue. If the revenue is more than 5000 a discount is 10% offered. 
Program should display the discount and net revenue. */
import java.util.Scanner;
public class task3 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the selling price of product: ");
    double sellingPrice = scanner.nextDouble();

    System.out.print("Enter the quantity of product sold: ");
    int productSold = scanner .nextInt();

    double revenue = sellingPrice * productSold;
    double discount = revenue * 10/100;
    double netRevenue = revenue - discount;


    if(revenue >= 5000){
        System.out.println("10% discount on product is "+ discount);
        System.out.println("Net revenue is "+ netRevenue);
    }else{
        System.out.println("0% discount Applies");
        System.out.println("Net revenue is "+ netRevenue);
    }
   } 
}
