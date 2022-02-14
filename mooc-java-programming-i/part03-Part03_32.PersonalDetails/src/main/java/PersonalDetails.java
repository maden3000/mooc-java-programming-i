
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

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
        int nameLong = arrayName[0].length();
        String longest = arrayName[0];
        for (int u = 1; u < count; u++) {
            if (nameLong < arrayName[u].length()) {
                longest = arrayName[u];
                nameLong = arrayName[u].length();
            }
        }

        double avg = 0;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arrayNum[i];
        }
        avg = (1.0 * ((double)sum /(double) count));
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + avg);

    }
}
