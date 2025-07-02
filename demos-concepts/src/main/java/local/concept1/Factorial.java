package local.concept1;

import java.text.NumberFormat;
import java.util.Locale;

public class Factorial {

    short number;

    Factorial() {}

    Factorial(short number) {
        this.number = number;
    }

    long calculateFactorial() ¨{
        return calculateFactorial(number);
    }

    long calculateFactorial(short number) {
        // if (number < 0) {
        //     number = number * -1;
        // }

        long result = 1;

        for (long i = number; i > 0; i--) {
            result = result * i;
            // result *= i;   
        }
        return result;

    } 

     public static void main(string[] args) {
            Factorial f =new Factorial();
            System.out.println(f.calculateFactorial(num));
        }
        long result = number * recursiveFactorial(number-1);
        return result;
     }    

          NumberFormat nf = namberFormat.getInstance(Locate.GERMANY);
          System.out.println(nf.format(number));

    public static void main(String[] args) {
         Factorial factorial = new Factorial();
         short num = 10;
         num = 0;
         num = 1;
         num = -5;
         num = 21;
         Long result = factorial.calculateFactorial(num);
         showNumber(result);

         try {
         long result = factorial.calculateFactorial(num);
         showNumber(result); 
    }   catch (Exception)


        System.out.println(calculateFactorial(10));
        System.out.println(recursiveFactorial(10));
        
    }
    
}