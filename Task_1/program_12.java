package Task_1;
public class program_12 {
    public static void main(String[] args) {
        int a = 55;
        int b = 70;

        boolean condition1 = !(a >= 50);
        boolean condition2 = a < b;

        if (condition1 && condition2) {
            System.out.println("Both condition are true");
        } else {
            System.out.println("Atleast one condition false");
        }
    }
}
