
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        int count = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner scan = new Scanner(Paths.get(String.valueOf(file)))) {
            while (scan.hasNextLine()) {
                lista.add(Integer.valueOf(scan.nextLine()));
            }
            for (Integer num : lista) {
                if ((lowerBound <= num) && (upperBound >= num)) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

}
