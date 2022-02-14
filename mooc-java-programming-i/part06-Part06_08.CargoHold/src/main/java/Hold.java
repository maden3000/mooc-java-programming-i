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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitc;

    public Hold(int max) {
        this.maxWeight = max;
        suitc = new ArrayList<>();
    }

    public int totalWei() {
        int tot = 0;
        for (Suitcase it : this.suitc) {
            tot += it.totalWeight();
        }
        return tot;
    }

    public void addSuitcase(Suitcase suitcase) {
        int tot = this.totalWei();
        if(tot+ suitcase.totalWeight() <= this.maxWeight) {
           this.suitc.add(suitcase);
        }

    }

    public void printItems() {
        for (Suitcase it : this.suitc) {
            it.printItems();
        }
    }

    public String toString() {
        int tot = 0;
        for (Suitcase it : this.suitc) {
            tot += it.totalWeight();
        }
        return this.suitc.size() + " suitcases (" + tot + " kg)";
    }
}
