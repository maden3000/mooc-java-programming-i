
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class UserInterface {

    private ArrayList<String> textReaded = new ArrayList<>();
    private String fileToRead;
    private Scanner scanner;
    private RecipeList recipeList;

    public UserInterface(Scanner scanner, RecipeList recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }

    public void start() {
        readFileName();
        openFile();
        commandPrint();

    }

    public void readFileName() {
        System.out.println("File to read: ");
        this.fileToRead = this.scanner.nextLine();
    }

    public void openFile() {
        try (Scanner scanner = new Scanner(Paths.get(this.fileToRead))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                textReaded.add(scanner.nextLine());

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        convertInList(textReaded);
    }

    public void commandPrint() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        System.out.println("Enter command: ");
        String decision = scanner.nextLine();
        while (!decision.equals("stop")) {
            if (decision.equals("list")) {
                System.out.println("Recipes: ");
                list();
            } else if (decision.equals("find name")) {
                System.out.println("Searched word: ");
                decision = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes: ");
                recipeList.searchName(decision);

            } else if (decision.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                decision = scanner.nextLine();
                int time = Integer.valueOf(decision);
                System.out.println("");
                System.out.println("Recipes: ");
                recipeList.searchTime(time);

            }else if (decision.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                decision = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes: ");
                recipeList.searchIngre(decision);

            }
            System.out.println("");
            System.out.println("Enter command: ");
            decision = scanner.nextLine();

        }

    }

    public void printList() {
        for (String row : textReaded) {
            System.out.println(row);
        }
    }

    public void convertInList(ArrayList<String> textReaded) {

        boolean start = false;
        boolean time = false;
        boolean ingred = false;
        Recipe recipe = new Recipe();
        for (String row : textReaded) {
            if (!start) {
                recipe.setName(row);
                start = true;
            } else if (!time) {
                int num = Integer.valueOf(row);
                recipe.setTime(num);
                time = true;
            } else if (!ingred) {
                if (row.isEmpty()) {
                    start = false;
                    time = false;
                    recipeList.setList(recipe);
                    recipe = new Recipe();
                } else {
                    recipe.addIngredients(row);
                }
            }
        }
        recipeList.setList(recipe);

    }

    public void list() {
        System.out.println("");
        for (Recipe obj : recipeList.getList()) {
            System.out.println(obj);
        }
    }
}
