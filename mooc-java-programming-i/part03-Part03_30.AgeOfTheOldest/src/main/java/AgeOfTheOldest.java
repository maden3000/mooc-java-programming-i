
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        int count = 0;
        int[] arrayNum =  new int[40];
        while (true) {
            String frase = scanner.nextLine();
            if (frase.isEmpty()) {
                break;
            }
            String[] divisa = frase.split(",");
            arrayNum[count] = Integer.parseInt(divisa[1]);
            count++;
        }
        int primo = arrayNum[0];
        for (int i = 1; i < arrayNum.length; i++) {
            if (primo < arrayNum[i]) {
                primo = arrayNum[i];
            }
        }
        System.out.println("Age of the oldest: " + primo);
    }
}
