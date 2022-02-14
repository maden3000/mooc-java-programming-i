
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String frase = scanner.nextLine();
            if (frase.isEmpty()) {
                break;
            }
            String[] divisa = frase.split(" ");
            for (int i = 0; i < divisa.length; i++) {
                System.out.println(divisa[i]);
            }

        }

    }
}
