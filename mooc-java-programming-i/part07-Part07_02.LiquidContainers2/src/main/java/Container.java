/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glitch
 */
public class Container {
    private int container;
    private int maxValue;

    public Container() {
        this.container = 0;
        this.maxValue = 100;
    }
    public int contains(){
        return this.container;
    }
    public void add(int amount){
        if(amount<0){
        }else if((amount+this.container) > this.maxValue){
            this.container = this.maxValue;
        }else if((amount+this.container) < this.maxValue){
            this.container += amount;
        }
    }
    
     public void remove(int amount){
        if(amount<0){
        }else if((this.container-amount) <= 0){
            this.container = 0;
        }else if((this.container-amount) > 0){
            this.container -= amount;
        }
    }
     public String toString(){
         return this.container + "/" + this.maxValue;
     }
}
