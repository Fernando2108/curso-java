package 09-conditions;

public class School {
    
    
    static int getAgeByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int age = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return age;

}
          
    public static void main(String[] args) {

      String[] mensajes = {
        "Kinder (de 6 años inclusive): Lunes y Miércoles de 16 a 17 1stYear"
        "(de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30 2ndYear"
        "(de 9 a IO años inclusive): Martes y Jueves de 17:30 a 19 3rdYear"
        "(de ll a 13 años inclusive): Lunes y Miércoles de 17 a 18:30"
        "No tenemos cases para mayorres de 13 años"

};
    int studentAge - getAgeByScanner(); 
    int index;  

     if (studentAge <= 6) {
        index = 0;
     } else if (studentAge <= 8){
        index = 1;
     } else if (studentAge <= 10){
        index = 2;
     } else if (studentAge <= 13){
        index = 3;
     }
      
