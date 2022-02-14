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
public class Database {
    private ArrayList<Bird> databa;

    public Database() {
        this.databa = new ArrayList<>();
    }

    public ArrayList<Bird> getDatabase() {
        return databa;
    }

    public void addBird(Bird bird) {
        this.databa.add(bird);
    }

    public int searchExBird(String bird) {
        for (Bird birdc : this.databa) {
            if (birdc.getName().equals(bird)) {
                birdc.setWatched();
                return 1;
            }
        }
        return 0;
    }
    public int searchBirdprint(String bird) {
        for (Bird birdc : this.databa) {
            if (birdc.getName().equals(bird)) {
                System.out.println(birdc);
                return 1;
            }
        }
        return 0;
    }

    public void printBird() {
        for (Bird birdc : this.databa) {
            System.out.println(birdc);
        }
      
    }
}
