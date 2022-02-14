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
public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe() {
        this.name = "";
        this.time = 0;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void getIngredientsPrint() {
        for (String row : this.ingredients) {
            System.out.println(row);
        }
    }

    public void addIngredients(String ingre) {
        this.ingredients.add(ingre);
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + time;
    }

}
