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
public class Room {

    private ArrayList<Person> person;

    public Room() {
        this.person = new ArrayList<>();
    }

    public void add(Person person) {
        this.person.add(person);
    }

    public boolean isEmpty() {
        if (this.person.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.person;
    }

    public Person shortest() {
        if (this.person.isEmpty()) {
            return null;
        }
        Person ref = this.person.get(0);

        for (Person pers : person) {
            if (ref.getHeight() > pers.getHeight()) {
                ref = pers;
            }

        }
        return ref;
    }
    public Person take(){
        Person rem = this.shortest();
        this.person.remove(rem);
        return rem;
    }
}
