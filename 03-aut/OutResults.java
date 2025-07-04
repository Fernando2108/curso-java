// Formas de imprimir en pantalla dia 4
// guardándolo previamente en una variable

public class OutResults {

    public static void main(String[] args) {

            String name = "Pepe";
            String surname = "Perez";
            int age = 33;

            // println -> expresión
            String result = "hola " + name + " " + surname + "\n¿como estas a tus " + age +" años?";
            System.out.println(result);

            // println -> expresión, variables...
            result = "hola %s %s\n¿como estas a tus %s años?\n";
            System.out.printf(result, name, surname, age);

            // println - template string

            result ="""
              Hola %s %s
              ¿como estás a tus %s años?      
                """;
        System.out.println(result.formatted( name, surname, age));

    }

}


