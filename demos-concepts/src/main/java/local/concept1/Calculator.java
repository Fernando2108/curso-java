package local.concept1;

import java.util.Scanner;

public class Calculator {

    private int num1;
    private int num2;

   public void setNum1(String[] args) {
    
   }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    int add(){
        int result = num1 + num2;
          return result;
    }
    
    int subtract () {
        int result = num1 - num2;
        return result;
    }
    
    int multiply () {
        int result = num1 * num2;
        return result;
    }
    
    int intDivide () {
        int result = num1 / num2;
        return result;
    }

    int restDivision () {
        int result = num1 % num2;
        return result;
    }

    void showResult(String operation,int result) {
        System.out.printf("El resultado de la %s es %s", operation, result);
        System.out.println("");
    }

    void showAllResults() {
System.out.printf("Operaciones con %s y %s\n", num1, num2);
        calc.showResult("suma", calc.add(num1, num2));
        calc.showResult("resta", calc.subtract(num1,num2));
        calc.showResult("producto", calc.multiply(num1, num2));
        calc.showResult("división", calc.intDivide(num1, num2));
        calc.showResult("resto", calc.restDivision(num1, num2));

    }

    int getInteger (String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int num = scanner.nextInt();
        // scanner.close();
        return num;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();


        calc.getInteger("Dime un número entero");
        calc.getInteger("Dime otro número entero");
        // Los argumentos son los valores que llegarán a los parámetros
        
    }
}