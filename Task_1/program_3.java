package Task_1;
public class program_3 {
    public static void main(String[] args) {
        int number = 2345;

        number += 8;

        int quotient = number / 3;

        int remainder = quotient % 5;
        int finalResult = remainder * 5;
        System.out.println("Final result: " + finalResult);
    }
}
