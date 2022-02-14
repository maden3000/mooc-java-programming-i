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
public class UserInterface {

    private Scanner scanner;
    private TodoList lista;

    public UserInterface(TodoList lista, Scanner scanner) {
        this.scanner = scanner;
        this.lista = lista;
    }

    public void start() {
        
        while (true) {
            System.out.println("Command:");
            String ans=this.scanner.nextLine();
            if (ans.equals("add")) {
                System.out.println("To add:");
                this.lista.add(scanner.nextLine());
            } else if(ans.equals("stop")){
                break;
            }else if(ans.equals("list")){
                 this.lista.print();
            }else if(ans.equals("remove")){
                System.out.println("Which one is removed?");
                 this.lista.remove(scanner.nextInt());
            }
        }
    }
}
