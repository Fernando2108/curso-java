import java.util.Scanner;

public class shop {

    static final double PACKET_PRICE = 20;
 
    static int getDataByScanner() {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Vendemos paquetes de pantalones y camisetas a %s EU" , PACKET_PRICE);
    System.out.println("Dime el numero de paquetes de pantalones");
    int packets = scanner.nextInt();
    System.out.println("");
    scanner.close();
    return packets; 
    } 
    
    public static void main(String[] args) {
       int numPackets = getDataByScanner();
       System.out.println(numPackets);
       double discount = 0.15; 
       int shippingByPacket = 0;

       if (numPackets < 5) {
           System.out.println("Numero de paquetes insuficiente");
            return;

       } else if (numPackets < 10) {
          discount = 0.05;
          shippingByPacket = 10 ;

       } else if (numPackets < 20) {
          discount = 0.1;
          shippingByPacket = 5;
       }

       // Validos para los casos 2, 3 y 4

        double total = numPackets * PACKET_PRICE; // 100
        double finalDiscount = total * discount; // 10% -> 10
        double totalShipping = numPackets * shippingByPacket;
        double finalPrice = total - finalDiscount + totalShipping;

        System.out.println("""
                Numero de paquetes         %d
                Precio total del producto  %.2f EU
                Descuento aplicado         %.2f EU
                Gastos de envió            %.2f EU
                ----------------------------------
                TOTAL                     %.2f EU
                """.formatted(numPackets, total, finalDiscount, totalShipping, finalPrice));
                
       
             
    }

}            