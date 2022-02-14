/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glitch
 */
public class Item {

    private String name;
    private int weight;

    public Item(String name, int kg) {
        this.name = name;
        this.weight = kg;
    }
    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }
    public String toString(){
        return this.name +"("+this.weight+" kg)";
    }
    
}
