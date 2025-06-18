import java.util.ArrayList;
import java.util.list;
import java.util.Scanner;

public class Fibonacci {

    private static list<Integer> serie;
    private static int Limit;

    public static void calculateFibonacci(int Limit) {

        int prev = 0, next = 1;
        Fibonacci.serie = new ArrayList<>();
        // serie.add(prev);
        // serie.add(next);
        
        while (prev <= Fibonacci.limit) {
            serie.add(prev);
           // int temp = prev + next;
           // prev = next;
           // next = temp;

            // Otra manera de hacerlo 
            next = next + prev;
            prev = next - prev;
        }
     }  

     public static void showFibonacci() {
        Strnig message = "Sucesión de Fibonacci (hasta %s):";
        System.out.println(message, Fibonacci.limit);
        for (int item : Fibonacci.) {
            System.out.println(item);
        }       
     } 

     private static void askLimit() {
        String message = "Indica el valor limite para tu serie de Fibonacci";
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensage);
        Fibonacci.limit = scanner.nextInt();
        // scanner.close();
     }

     private rivate static void askContinue() {
        String message =
        Scanner
     }
        System.out.println("Fibonacci secuencia hasta " + n + "términos");

        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(first + " ");
            int
        }
        
    
    
}
