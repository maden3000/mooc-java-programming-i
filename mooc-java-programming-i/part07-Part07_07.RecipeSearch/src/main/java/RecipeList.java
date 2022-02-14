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
public class RecipeList {

    private ArrayList<Recipe> list;

    public RecipeList() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Recipe> getList() {
        return list;
    }

    public void setList(Recipe obj) {
        this.list.add(obj);
    }

    public void searchName(String decision) {
        for (Recipe obj : list) {
            if (obj.getName().contains(decision)) {
                System.out.println(obj);
            }
        }
    }

    public void searchTime(int time) {
        for (Recipe obj : list) {
            if (obj.getTime() <= time) {
                System.out.println(obj);
            }
        }
    }

    public void searchIngre(String decision) {
        for (Recipe obj : list) {
            for (String row : obj.getIngredients()) {
                if (row.equals(decision)) {
                    System.out.println(obj);
                }
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }

}
