import java.util.Scanner;

public class Fibbonacci {
public static void main(String[] args) {
        
        int n1 = 0, n2 = 1, next;
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many elements you want to print in a Fibonacci series");
        int n = in.nextInt();
        
        System.out.println("Fibonacci series");
        System.out.print(n1 + " "+ n2 + " ");
        for(int i = 2; i < n; i++) {
            next = n1 + n2;  
            System.out.print(next + " ");
            n1 = n2;
            n2 = next;
        }
        
    }
    
}