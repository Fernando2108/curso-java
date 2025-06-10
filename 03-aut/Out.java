// Formas de imprimir en pantalla

public class Out {

public static void main(String[] args) {

         String name = "Pepe";
         String surname = "Perez";
         int age = 33;

         // println - expresión
         System.out.println("hola "+ name +" " surname + "\n ¿como estas a tus %i años" + age +" años" ) ?" + age + " años");

            // printf -> expresión, variables...

         System.out.printf("hola %s %s \n¿como estas a tus %s años?", name, surname, age);

         // println - template string

         System.out.println("""
                 Hola %s %s
                 ¿Cómo estás a tus %s años?
                     """.formatted(name, surname, age));
    }

}