import java.util.Scanner;

public class AskUser {


     static woid ask() {
    
     }

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        while (wantContinue) {

            // cualquier función

            
            System.out.println("¿Quieres continuar (S/N)");
            String answer = scanner.nextLine();
            if(answer.toLowerCase().equals("N")) {
                wantContinue = false;
            }           
        }

        scanner.close();
        System.out.println("Gracias por todo");
        
    }

    
}
