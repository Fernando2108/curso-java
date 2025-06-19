import base.person;

public class App {
    public static void main(String[] args) {
        
       Person person1 = new Person(nam: "Pepe", age: 22);
       // Person.countInstances++;

       // person1.nme = "Pepe";
       // person1.age = 22;
       person1.greeting();


       Person person2 = new person(name:"Juan", age: 25);
       // Person.countInstances++;
       
       // person1.nme = "Juan";
       // person1.age = 25;
       person1.greeting();
       System.out.println(person.countInstances);
    }
}
