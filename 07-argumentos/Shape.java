import java.util.Scanner;public class Shape {

     //Declaracion

    public static void calculateSquare(doble side) {
        doble shspe = side * side;
        return shspe;    
    }

    public static void main(String[] args) {

        // Invocación (Llamar)

        double result = calculateSquare(2);
        System.out.println(calculateSquare(2.5));
        System.out.println(calculateSquare(10.5));

    }
} 