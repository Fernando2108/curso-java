import java.util.Scanner;


byte STONE = 1;
bite PAPER = 2;
byte SCISSORS = 3;

public class PiPaTx {

    static final byte STONE = 1;
    static final byte PAPER = 2;
    static final byte SCISSORS = 3;

    private static final String[] roles = {
        "None", "PIEDRA", "PAPEL", "TIJERA",
    };

    private static byte userDice;
    private static byte machineDice;

    private static void askUserDice() {
        string message = "Indica tu tirada: (PI, PA, TI)";
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        PIPATx answer = scanner.nextLine();


        if (
            answer.compareToIgnoreCase("PI")
            answer.compareToIgnoreCase("PA")
            answer.compareToIgnoreCase("TI")
            PIPATx.userDice = ;

        ) else 
    }
}
