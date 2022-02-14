/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;


/**
 *
 * @author glitch
 */
public class TodoList {

    private ArrayList<String> toDo;

    public TodoList() {
        this.toDo = new ArrayList<>();
    }

    public void add(String task) {
        this.toDo.add(task);

    }

    public void print() {
        int i=1;
        for (String me : this.toDo) {
            System.out.println(i + ": " + me);
            i++;
        }
    }

    public void remove(int number) {
        int nim = 1;
        for (String me : this.toDo) {
            if (nim == number) {
                this.toDo.remove(me);
                break;
            }
            nim++;
        }

    }

}
