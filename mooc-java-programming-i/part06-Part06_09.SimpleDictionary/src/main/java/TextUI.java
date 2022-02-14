/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author glitch
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String answer = scanner.nextLine();
            if (answer.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (answer.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if (answer.equals("search")) {
                System.out.println("To be translated:");
                String search = scanner.nextLine();
                String res = this.dictionary.translate(search);
                if (res == null) {
                    System.out.println("Word " + search + " was not found)");
                } else {
                    System.out.println("Translation: " + res);
                }

            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
