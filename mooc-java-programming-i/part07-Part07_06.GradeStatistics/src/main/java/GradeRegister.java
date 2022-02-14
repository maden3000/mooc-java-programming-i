
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;


    public GradeRegister() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
 
    }

    public void addGrades(int num) {
        this.grades.add(num);
    }

    public void addPoints(int num) {
        this.points.add(num);
    }

    public ArrayList<Integer> getPoints() {
        return this.points;
    }
 public ArrayList<Integer> getGrades() {
        return this.grades;
    }
  public int getPointsSize() {
        return this.points.size();
    }
 public int getGradesSize() {
        return this.grades.size();
    }
}
