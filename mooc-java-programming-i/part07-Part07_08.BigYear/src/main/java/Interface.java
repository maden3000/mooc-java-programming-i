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
public class Interface {

    private Database databaseHere;
    private Scanner scan;

    public Interface(Database database, Scanner scan) {
        this.databaseHere = database;
        this.scan = scan;
    }

    public void start() {
        read();
    }

    public void read() {
        System.out.println("?");
        String res = this.scan.nextLine();
        while (!res.equals("quit")) {
            if (res.equals("Add")) {
                add();
            } else if (res.equals("Observation")) {
                System.out.println("Bird: ");
                res = this.scan.nextLine();
                if (this.databaseHere.searchExBird(res) == 1) {
                    continue;
                } else {
                    System.out.println("Not a bird!");

                }
            } else if (res.equals("All")) {
                this.databaseHere.printBird();
            } else if (res.equals("One")) {
                System.out.println("Bird: ");
                res = this.scan.nextLine();
                if (this.databaseHere.searchBirdprint(res) == 1) {
                    continue;
                } else {
                    System.out.println("Not a bird!");

                }
            } else if (res.equals("Quit")) {
                break;
            }
            System.out.println("?");
            res = this.scan.nextLine();
        }
    }

    public void add() {
        Bird bird = new Bird();
        System.out.println("Name: ");
        String res = this.scan.nextLine();
        bird.setName(res);

        System.out.println("Name in Latin: ");
        res = this.scan.nextLine();
        bird.setNameLatin(res);
        this.databaseHere.addBird(bird);
    }

}
