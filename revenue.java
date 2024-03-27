       /*Revenue can be calculated as the selling price of the product times the quantity sold, 
     i.e. revenue = price × quantity. Write a program that asks the user to enter product price and quantity and 
     then calculate the revenue. If the revenue is more than 5000 a discount is 10% offered. 
     Program should display the discount and net revenue.
  */    
  import java.util.Scanner;

  public class revenue {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the product price: ");
          double price = scanner.nextDouble();
  
          System.out.print("Enter the quantity sold: ");
          int quantity = scanner.nextInt();
  
          double revenue = price * quantity;
          if (revenue > 5000) {
              double discount = 0.1 * revenue;
              revenue -= discount;
              System.out.println("Discount offered: " + discount);
          }
  
          System.out.println("Net revenue: " + revenue);
  
          scanner.close();
      }
  }
  