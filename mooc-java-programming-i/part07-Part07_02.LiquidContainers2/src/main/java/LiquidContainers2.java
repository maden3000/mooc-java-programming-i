
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1 = new Container();
        Container cont2 = new Container();

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {

                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println("First: "+cont1);
            System.out.println("Second: "+cont2);

            if (command.equals("add")) {
                cont1.add(amount);
            } else if (command.equals("move")) {
                if(amount> cont1.contains()){
                    int diff = cont1.contains();
                    cont1.remove(amount);
                cont2.add(diff);
                }else{
                cont1.remove(amount);
                cont2.add(amount);
                }
            } else if (command.equals("remove")) {
                cont2.remove(amount);
            }

        }
       System.out.println("First: "+cont1);
            System.out.println("Second: "+cont2);

    }

}
