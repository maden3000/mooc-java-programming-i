/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glitch
 */
public class Timer {

    private int hundredths;
    private int seconds;

    public Timer() {
        this.hundredths = 0;
        this.seconds = 0;
    }

    public void advance() {
        this.hundredths++;
        if (this.hundredths > 99) {
            this.hundredths = 0;
            this.seconds++;
        }
        if (this.seconds > 59) {
            this.seconds = 0;
        }
    }

    public String toString() {
        if (this.hundredths < 10) {
            if (this.seconds < 10) {
                return "0" + this.seconds + ":" + "0" + this.hundredths;
            } else {
                return this.seconds + ":" + "0" + this.hundredths;
            }
        } else if (this.seconds < 10) {
            return "0" + this.seconds + ":" + this.hundredths;
        } else {
            return this.seconds + ":" + this.hundredths;
        }

    }
}
