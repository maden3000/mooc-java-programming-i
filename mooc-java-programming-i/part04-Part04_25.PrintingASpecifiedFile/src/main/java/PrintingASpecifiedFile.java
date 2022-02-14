
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        System.out.println("Which file should have its contents printed?");
        Scanner fileLetto = new Scanner(System.in);
        String fileDato = fileLetto.nextLine();
        try(Scanner scanner = new Scanner(Paths.get(String.valueOf(fileDato)))){
           while(scanner.hasNextLine()){
               String row = scanner.nextLine();
               System.out.println(row);
           } 
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        
    }
}
