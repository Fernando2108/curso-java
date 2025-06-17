  public class Ejercicio {


    // Tipos de datos primitivos
    // byte, - 1byte - 128 a 127 
    // short, - 2bytes - 32,768 a 32,767
    // int, - 4bytes - 2,147,483,648 a 2,147,483,647
    // long, - 8bytes - 9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
    // float, - decimal 4bytes - 3.40282347E+38F a 1.40239846E-45F
    // double, - decimal 8bytes - 1.7976931348623157E+308 a 4.9406564584124654E-324
    // boolean, char 
  
    
    public static void main(String[] args) {


        byte age; // Declaración
        age = 22; // Asignación
        short birthYear = 1990; // Inicialización = Declaración + Asignación
        int cityPopulation = 4_000_000;
        long countryPopulation = 40_000_000;
        float height = 1.78f;
        double weight = 65.74;
        boolean hasPet = true;
        char type = 'A';
        String name = "Pepe";

        System.out.println("Edad " + age);
        System.out.println("Fecha" + birthYear);
        System.out.println("Población de mi Ciudad" + cityPopulation);
        System.out.println("Población de mi país" + countryPopulation); 
        System.out.println("""
                Altura %s mts
                Peso %s kgs
                ¿Tiene mascotas? %s
                Tipo %s
                Nombre %s
                """.formatted(height, weight,hasPet, type, name));
    }
    
}
