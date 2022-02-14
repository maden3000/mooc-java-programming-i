
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name: ");
            String nome = scanner.nextLine();
            if (nome.isEmpty()) {
                break;
            } else {
                System.out.println("Last name: ");
                String cognome;
                cognome = scanner.nextLine();
                 System.out.println("Identification number: ");
                String numeroIdentifi;
                numeroIdentifi = scanner.nextLine();
             
                infoCollection.add(new PersonalInformation(nome, cognome, numeroIdentifi));
            }
            for (PersonalInformation utente : infoCollection) {
                System.out.println(utente.getFirstName() + " " + utente.getLastName());
            }
        }

    }
}
