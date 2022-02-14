
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String frase = scanner.nextLine();
            if (frase.isEmpty()) {
                break;
            }
            String[] divisa = frase.split(" ");
            System.out.println(divisa[0]);

        }

    }
}
