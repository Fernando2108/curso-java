public class Equality {

    public static void primitives() {
        System.out.println("Valores primitivos");
        byte num1 = 5;
        byte num2 = 5;
        System.err.println(num1 == num2); // true
        short num3 = 5;
        System.err.println(num1 == num3); // true debido al unboxing
        int num4 = 5;
        System.out.println(num1 == num4); // true debido al unboxing
        float num5 = 5.of;
        System.out.println(num1 == num5);
        char char1 = 'a'; // char es -> short (2 bytes)
        char char2 = 'b';
        System.out.println(char1 == char2);
        System.out.println();
        // boolean bool = false;
        // byte likeBool = 0;
        // System.out.println(bool == likeBool);



    }

    public static void wrappers() {
       System.out.println("Wrappers se valores primitivos");
       Integer num1 = 5;//new Integer(5);
       Integer num2 = 5;//new Integer(5);
       System.out.println(num1 == num2); // false
       System.out.println(num1 + num1);
       System.out.println(num1.toString());
       
    }
    public static void casting() {
        System.out.println("Castings y corrección de valores primitivos");

        int num1 = 23;
        byte num2 = 20;
        byte result = (byte) (num1 + num2);
        System.out.println(result);
        String text = "Resut ";
        //System.out.println(result + text + result);
        System.out.println(result + num1 + num2);
        
    }

    public static void main(string[] args) {
        System.out.println("Aprendiendo acerca de la igualdad en Java");
        Primitives();
        System.out.println("-------------------------");
        wrappers();
        System.out.println("-------------------------");
        casting();
    }

}
