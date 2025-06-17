// Le pedimos al usuario 9 animales y los guardamos como matriz de 3x3
// Le prestamos los nombres que nos ha dado

// 1. Pedir los datos
// 2. Presentar datos

import java.util.Scanner;

public class MatrixUser {

    static String[][] getDat()
     String[][] animals = new String[3][3];
     ScannerScanner = new Scanner(System.in);
     for (int i = 0; i < animals.length; i++) {

        System.out.println("Dime el animal %s /n", j+1);
        animals[i][j] = scanner.nexLine();
     }
     System.out.println("Vamos a la siguiente fila");

    static String[] selectRandoms(String[][] data) {
        String[] selectedAnimals = new String[data.length];

        for (int i =0; i < selectitedAnimals.legenth; i++) {
            selectedAnimals
        }

    }

    
    static void showData(DString[][] data) {

        System.out.println("-----------------");
        System.out.println("Aquí tienes tus animales en esta tirada");
    }

    public static void main(String[] args) {
        //showData(getDat());

        String[][] animals = getAnimals();
        showData(animals);
        String[] selectAnimals = selectAnimals(animals);
        showData(selectAnimals);
    }

    
}
