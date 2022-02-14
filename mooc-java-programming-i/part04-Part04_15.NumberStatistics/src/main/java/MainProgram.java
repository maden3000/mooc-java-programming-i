
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");

        int x = Integer.valueOf(scanner.nextLine());
        while (x != -1) {
            if(x % 2 == 0){
               statistics.addNumber(x);  
               statisticsEven.addNumber(x);
            }else{
            statistics.addNumber(x);
            statisticsOdd.addNumber(x);
            }
            x = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());

    }
}
