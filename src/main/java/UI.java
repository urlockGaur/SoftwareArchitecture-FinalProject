import java.util.List;
import java.util.Scanner;  // Import the Scanner class

public class UI {
    Scanner keyboard = new Scanner(System.in);

    public void welcomeMessage() {
        System.out.println("Game Loading....");
        System.out.println("Welcome to Ultimate Combat!");
        System.out.println("---------------------------------");
    }

    public void displayGameTitle() {
        System.out.println("==== Ultimate Combat ====");
    }

    public void selectFighter(List<Character> characters) {
        System.out.println("Select your fighter: ");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i + 1) + ". " + characters.get(i).getName());
            characters.get(i).displayStats();
        }
    }

    public void startFightRound(int roundNumber) {
        System.out.println("\n--- Round " + roundNumber + "---");
        System.out.println("FIGHT!");
    }

    public void displayWinner(Character winner) {
        System.out.println("\n === Winner ===");
        System.out.println(winner.getName() + "wins Ultimate Combat!");
        System.out.println("---------------------------------");
    }

    public int selectFighterPrompt(List<Character> characters) {
        return getIntInput("Enter the number of the fighter you want to select" , 1, characters.size());
    }

    public void promptContinue() {
        System.out.println("Press 'Enter' to conintue to the next round...");
        keyboard.nextLine();
    }

    public int getIntInput(String prompt, int min, int max) {
        int choice;
        do {
            System.out.print(prompt);
            while (!keyboard.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                keyboard.next(); // consume the invalid input
            }
            choice = keyboard.nextInt();

            if (choice < min || choice > max) {
                System.out.println("Invalid choice. Please enter a valid number.");
            }
        } while (choice < min || choice > max);

        return choice;
    }

    public void displayRoundResults(Character player, Character opponent) {

    }

}

