
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int maxVolume = 100;

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
              
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
             System.out.println("First: " + first + "/" + maxVolume);
            System.out.println("Second: " + second + "/" + maxVolume);
            
            if (command.equals("add")) {
                if (amount < 0) {
                    
                } else if ((amount + first) >= 100) {
                    first = 100;
                } else if ((amount + first) < 100) {
                    first = amount + first;
                }
            } else if (command.equals("move")) {
                if (amount < 0) {
                    
                } else if (amount > first) {
                    if ((first + second) >= maxVolume) {
                        first = 0;
                        second = 100;

                    } else if ((first + second) < maxVolume) {
                        
                        second += first;
                        first = 0;
                    }

                } else if (amount <= first) {
                    if ((amount + second) >= maxVolume) {
                        first -= amount;
                        second = 100;
                    } else if ((amount + second) < maxVolume) {
                        first -= amount;
                        second += amount;
                    }

                }
            } else if (command.equals("remove")) {
                if (amount >= second) {
                    second = 0;
                } else if (amount < second) {
                    second -= amount;
                }
            }

           
        }
       System.out.println("First: " + first + "/" + maxVolume);
            System.out.println("Second: " + second + "/" + maxVolume);
    }

}
