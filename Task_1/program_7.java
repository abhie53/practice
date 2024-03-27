package Task_1;
public class program_7 {
    
        public static void main(String[] args) {
            int a = 6;
            int b = 8;
    
            // Swapping variable without third value.
            a = a + b;
            b = a - b;
            a = a - b;

    
            System.out.println("swapping without third value :");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            //swapping using third nubmer
            int x = 6;
            int y = 8;
            int z =a;
            
            x = y;
            y = z;
            System.out.println("swapping using third value :");
            System.out.println("x = " + y);
            System.out.println("y = " + z);
        }
    
    
}
