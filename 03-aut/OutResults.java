// Formas de imprimir en pantalla dia 4
// guardandolo previamente en una variable

public class OutResults {

    public static void main(String[] args) {

            String name = "Pepe";
            String surname = "Perez";
            int age = 33;

            // println -> expresion
            String result = "hola " + name + " " + surname + "\n¿como estas a tus " + age +" años?";
            System.out.println(result);
            // prinlf -> expresion, variables...
            result ="hola %s %s\n¿como estas a tus %s años?"
            System.out.printlf
            System.out.printf(result, name, surname, age);

            // println - template string

            System.out.println("""
                    Hola %
                    """;);
        
    }

}


