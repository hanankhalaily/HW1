public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int a = 1;
        int b = 1;
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int numOdd = 2;
        System.out.print("1 1 ");
       for (int i = 2; i<x; i++) { 
            int next = a+ b;
            if (next % 2 != 0) {
             numOdd++;
}
            System.out.print(next +" ");
             a = b;
             b = next;
           
       }

        
       
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " +numOdd);  
    }
}
