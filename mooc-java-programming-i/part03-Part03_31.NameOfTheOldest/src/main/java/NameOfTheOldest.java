
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        int count = 0;
        int[] arrayNum = new int[40];
        String[] arrayName = new String[40];
        while (true) {
            String frase = scanner.nextLine();
            if (frase.isEmpty()) {
                break;
            }
            String[] divisa = frase.split(",");
            arrayNum[count] = Integer.parseInt(divisa[1]);
            arrayName[count] = divisa[0];
            count++;
        }
        int primo = arrayNum[0];
        String second = arrayName[0];
        for (int i = 1; i < arrayNum.length; i++) {
            if (primo < arrayNum[i]) {
                primo = arrayNum[i];
                second = arrayName[i];
            }
        }
        System.out.println("Age of the oldest: " + second);

    }
}
