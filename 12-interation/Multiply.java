
// Crea una función que imprima por consola la tabla de multiplicar 
// de un número introducido como parámetro.

// Le pedimos al usuario que elija entre la tabla de un número o
// todas las tablas del 1 al 10

  import java.util.Scanner;

public class Multiply {

    public static int LIMIT = 10;

    public static int getDataByScanner() {
        Scaner scanner = new Scanner(System.in);
        System.out.print("Dime la tabla de multiplicar que quieres 1 al 10");
        System.err.println("Escribe 0 si deseas todas las tabas");
        int number = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return number;
    }

    public static void showTable(int number) {
        System.out.println("tabla de %s\n", number);
        for (int i = 0; i <= LIMIT; i++){
            System.out.println("%s x %s\n", number, i, number * i);
        }
        System.out.println("-------------------------\n");
    }

    public static void main(String[] args) {
         for (int i = 1; i <= LIMIT; i++) {
            showTable(i);
        }
    }

    public static void main(String[] args) {
        int num = getDataByScanner();
        if (num != 0) {
            showTable(num);
        } else {
            showAllTables();        
        }
    }
}
