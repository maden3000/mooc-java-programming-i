
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String frase = scanner.nextLine();
            if (frase.isEmpty()) {
                break;
            }
            String[] divisa = frase.split(" ");
            for (int i = 0; i < divisa.length; i++) {
                if (divisa[i].contains("av")) {
                    System.out.println(divisa[i]);
                }
            }

        }

    }
}
