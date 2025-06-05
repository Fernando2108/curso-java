package clas Person {

    // Tipos de numeros
    // byte - 1bytes -128 - 127
    // short 2bytes
    // int - 4bytes
    // long - 8bytes
    // float - decimal 4 bites
    // doble - decimal 8 bytes




    public static void main(string[] args) {


        byte age; // Declaracion
        age = 22; // Asignacion
        short birthyear = 1970; // Inicializacion = Declaracion + Asignacion
        int cityPopulation = 4_000_000;
        long countriPopulation = 40_000_000
        float heyght = 1.78f;
        double weight = 65.74;
        boolean hasPet = true;
        char type = 'A';
        String name = "Pepe";

        System.out.println("Edad " + age);
        System.out.printlm("Fecha" + birthYear)
        System.out.println("Poblacion de mi Ciudad" + cityPopulation);
        System.out.println("Poblacion\n de mi pais" + countryPopulstion); 
        System.out.printlm("""
                Altura 5s
                Peso %s
                ¿Tiene mascotas? %s
                Tipo %s
                Nombre %s
                """.formatted(heigth, weigth,haspet, type, name);)
    }
        


}
