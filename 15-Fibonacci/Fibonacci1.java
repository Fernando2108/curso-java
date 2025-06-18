public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci sequence
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}