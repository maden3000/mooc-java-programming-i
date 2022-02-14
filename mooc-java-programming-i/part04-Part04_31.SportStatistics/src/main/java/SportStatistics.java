
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String nameFile = scan.nextLine();
        System.out.println("Team: ");
        String teamFile = scan.nextLine();
        int countGames = 0;
        int gamesWin = 0;
        int gamesLost = 0;

        try (Scanner fileConve = new Scanner(Paths.get(String.valueOf(nameFile)))) {

            while (fileConve.hasNextLine()) {
                String line = fileConve.nextLine();

                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int team1score = Integer.valueOf(parts[2]);
                int team2score = Integer.valueOf(parts[3]);
                if (team1.contains(teamFile)) {
                    countGames++;
                    if (team1score > team2score) {
                        gamesWin++;
                    } else {
                        gamesLost++;
                    }
                } else if (team2.contains(teamFile)) {
                    countGames++;
                    if (team1score < team2score) {
                        gamesWin++;
                    } else {
                        gamesLost++;
                    }
                }

            }
            System.out.println("Games: " + countGames);
            System.out.println("Wins: " + gamesWin);
            System.out.println("Losses: " + gamesLost);
        } catch (Exception e) {
            System.out.println("Error: ");
        }

    }

}
