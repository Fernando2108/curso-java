package base;

public class person {

    // Propiedades static o de clase

    public static int countInstances = 0;

    // Métodos static  o de clase

    public static void updateCounter() {
        countInstances++;
    }

    // Propiedades de instancia

   public String name;
   public int age; 

   // Métodos getters y setters

   public String getName() {
       return name;
   }

   public void setName

   public void setAge(int age) {
     if (age < this.age) {
        return;
     }
     this.age = age;
   }

   // Método constructor


   public Person(Sttring name, int age) {
         System.out.println("Se ha instanciado una person");
         

         this.name = name;
         this.age = age;
         countInstances();
       }

      // Método de instancia
         
   public void greeting() {
        System.out.println("Hola soy %s y tengo %s años.\n", name, age);
    }

}
