
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
           int number = 0;
           int cube;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String stringa = scanner.nextLine();
            if(stringa.equals("end")){
                break;
            }
             
            number = Integer.valueOf(stringa);
            cube= number*number*number;
            System.out.println(cube);
            
        }
        
        

    }
}
