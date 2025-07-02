package local.concept2_vc;

import java.util.Scanner;

public class CalcView extends Calc {

    private int number1;
    private int number2;

    void menu() {
        String menu = """

        Elige el numero de la opción que quieras
        -----------------------------------------
         1. Dime un numero (%s)
         2. Dime otro numero (%s)
         3. Calcular la suma
         4. Calcula la resta
         5. Calcula la multiplicación 
         6. Calcula la division y el resto
         7. Calcula la division con decimales
         8. Calcula todos los anteriores
         9. Calcula el factorial del primero
         0. Salir""".formatted(number1, number2);

         System.out.println(menu);

    }

     void show() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        while(wantContinue)
            showMenu();
            int answer = scanner.nextInt();
            if (answer == 0) {
              wantContinue = false;
           } else if (answer == 1) {
                number1 = getInterger(message:"dime el primer numero"); {
                ctr
           } else if (answer == 2){
            number2 = getInterger(message:"Dime el segundo numero")
           } else {
              calculate(answer);
           }

            }
        }

        scanner.close();
        System.out.println("Gracias por todo");
    }

}
