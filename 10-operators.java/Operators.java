public class Operators {

    
    // operdores -> expresiones

    // Asignación

    // =

    // aritméticos

    // +=
    // -=
    // *0
    // /=
    // %=

    // Incremento y decremento

    // Comparación -> expression boolean

    // ==
    // !=
    // .equals ()
    // > >=
    // < <=

    // && -> 
    // ||-> OR

    static boolean checkAge(int age) {
        System.out.println("Chequeando la edad" + age);
        return age >25 ? true 
    }

    public static void main(String[] args) {
        int number = 22;
        // number = number + 3;
        number += 3;
        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);
        
    }
        String job = "Developer";
        int age = 22;

        
        if (job == "Developer" && age < 25) {
            System.out.println("Bienvenido a la Hackaton juvenil");

        } else {
            System.out.println("No puedes participar el la Hackaton j");
        }
}
