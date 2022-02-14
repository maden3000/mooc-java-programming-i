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
public class Suitcase {

    private ArrayList<Item> item;
    private int maxWeight;

    public Suitcase(int kg) {
        this.maxWeight = kg;
        this.item = new ArrayList<>();

    }

    public void addItem(Item item) {
        if ((this.totalWeight() + item.getWeight()) <= this.maxWeight) {
            this.item.add(item);
        }

    }

    public String toString() {
        if (this.item.size() < 1) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if (this.item.size() == 1) {
            return this.item.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            return this.item.size() + " items (" + this.totalWeight() + " kg)";
        }
    }

    public void printItems() {
        for (Item it : this.item) {
            System.out.println(it.getName() + " (" + it.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        int tot = 0;
        for (Item it : this.item) {
            tot += it.getWeight();
        }
        return tot;
    }

    public Item heaviestItem() {
        if (this.item.isEmpty()) {
            return null;
        }

        int ref = this.item.get(0).getWeight();
        Item ret = this.item.get(0);
        for (Item it : this.item) {
            if (it.getWeight() > ref) {
                ref = it.getWeight();
                ret = it;
            }
        }
            return ret;
       
       
    }
}
