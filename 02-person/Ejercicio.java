public class Ejercicio {

    


    // Tipos de números
    // byte - 1bytes -128 - 127
    // short 2bytes
    // int - 4bytes
    // long - 8bytes
    // float - decimal 4 bites
    // doble - decimal 8 bytes

public class Ejercicio-Person {
   
        byte age; // Declaración
        age = 22; // Asignación
        short birthyear = 1990; // Inicializaron = Declaración + Asignación + Asignación
        int cityPopulation = 4_000_000;
        long countryPopulation = 40_000_000;
        float height = 1.78f;
        double weight = 65.74;
        boolean hasPet = true;
        char type = 'A';
        String name = "Pepe";


        System.out.println("Edad: " + age);
        System.out.println("Fecha de nacimiento: " + birthyear);
        System.out.println("Población de mi ciudad: " + cityPopulation);
        System.out.println("Población de mi país: " + countryPopulation);
        System.out.printf("""
                Altura: %s mts
                Peso: %s kg
                ¿Tiene mascotas? %s
                Tipo: %s
                Nombre: %s
                """.formatted (height, weight, hasPet, type, name));


    
}
