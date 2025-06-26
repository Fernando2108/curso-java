package base;

public class Cat extends ICat {

    public Cat(String name, int age) {
        super(name, age);
    };

    public void eat() {
        super.eat();
        String message = "Como comida para gatos";
        System.out.println();

    }
}
