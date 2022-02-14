/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glitch
 */
public class Bird {
    private String name;
    private String nameLatin;
    private int watched;

    public Bird() {
        this.name = "";
        this.nameLatin = "";
        this.watched = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }

    public int getWatched() {
        return watched;
    }

    public void setWatched() {
        this.watched += 1;
    }

    @Override
    public String toString() {
        return name + " (" + nameLatin + ") : " + watched+" observations";
    }

    
}
