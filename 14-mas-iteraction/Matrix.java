public class Matrix {


    final 


    static void vector() {
        
       int[] vectorNumbers = {3, 4, 5, 23, 54};
       String[] vectorNumbers = new STRING[4]; 

       vectorNumbers[0] = "Pepe";
       vectorNumbers[1] = "Luisa";
       vectorNumbers[3] = "Ramon";

       for (int i = 0; < vectorNumbers.length; i++) {
         System.out.println(vectorNumbers[i]);
       }

       for (String name : vectorNumbers) {
        System.out.println(name);
       }
    }

    static void matrix() {

        String[][] matrixNames = {{"Pepe", "Luisa","Ramon"}, 
        {"Perez","Gomez", "Smith"},{"Ruiz", "Martin", "Walter"}}

        int[][] matrixNumbers = new int [3][3];

        matrixNumbers [0][0] = 22;
        matrixNumbers [0][2] = 44;
        matrixNumbers [0][3] = 50;
        matrixNumbers [1][0] = 25;
        matrixNumbers [1][2] = 46;
        matrixNumbers [1][3] = 57;
        matrixNumbers [2][0] = 13;
        matrixNumbers [2][2] = 5;
        matrixNumbers [2][3] = 0;

        for (int i = 0; i < matrixNumbers.length; i++) {
            for (int i = 0; j < matrixNumbers[0].length; i++){
            System.out.println(matrixNumbers[i][j]);
            // System.out.println(matrixNumbers[i][0]);
            // System.out.println(matrixNumbers[i][1]);
            // System.out.println(matrixNumbers[i][2]);  
            }

            System.out.println("");
           
        }

        for (int[] row: matrixMumbers) {
            for (int item : row) {
                System.out.println(item + " ");
            }
            System.out.println("");
        }

    }


    public static void main(String[] args) {
          vector();
          matrix();
        
    }
    
}
