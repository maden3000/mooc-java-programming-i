/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author glitch
 */
public class UserInterface {

    private Scanner scanner;
    private int num = 0;
    GradeRegister register;

    public UserInterface(Scanner scanner, GradeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        readPoints();
        readAvaragePoints(register.getPoints());
        readAvarageGrades(register.getGrades());
        readPassPerc();
        gradeDis(register.getPoints());
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String read = scanner.nextLine();
            num = Integer.valueOf(read);
            if (num == -1) {
                break;
            } else if ((0 < num) && (num < 100)) {
                register.addPoints(num);
                if (num >= 50) {
                    register.addGrades(num);
                }
            }
        }
    }

    public void readAvaragePoints(ArrayList<Integer> points) {
        int sum = 0;
        for (Integer num : points) {
            sum += num;
        }
        double ava = 1.0 * sum / points.size();
        System.out.println("Point average (all): " + ava);
    }

    public void readAvarageGrades(ArrayList<Integer> grades) {
        double ava = 0;
        if (grades.isEmpty()) {

        } else {
            int sum = 0;
            for (Integer num : grades) {
                sum += num;
            }
            ava = 1.0 * sum / grades.size();
        }
        if (ava < 50) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + ava);
        }
    }

    public void readPassPerc() {
        System.out.println(register.getPointsSize());
        System.out.println(register.getGradesSize());
        int partecipant = register.getPointsSize();
        int pass = register.getGradesSize();

        double passingRatio = (double) pass / partecipant;

       
            double med = 100.00 * passingRatio;
        

        System.out.println("Pass percentage: " + med);
    }

    public void gradeDis(ArrayList<Integer> point) {
        int grade = 5;
        System.out.println("Grade distribution: ");
        while (grade >= 0) {
            System.out.print(grade + ": ");
            for (Integer num : point) {
                if (checkGrade(num) == grade) {
                    System.out.print("*");
                }
            }
            System.out.println("");
            grade--;
        }
    }

    public int checkGrade(int num) {
        int grade = 0;
        if (num < 50) {
            grade = 0;
        } else if (num < 60) {
            grade = 1;
        } else if (num < 70) {
            grade = 2;
        } else if (num < 80) {
            grade = 3;
        } else if (num < 90) {
            grade = 4;
        } else if (90 <= num) {
            grade = 5;
        }
        return grade;
    }

}
