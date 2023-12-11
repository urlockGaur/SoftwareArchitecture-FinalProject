import java.util.List;
import java.util.Scanner;  // Import the Scanner class
/**
 * The UI class handles user interface interactions for the Ultimate Combat game.
 * It provides methods for displaying messages, presenting fighter lists, and managing user input.
 * This class utilizes the Singleton design pattern to ensure only one instance is created.
 *
 * The UI includes prompts and displays for character selection, combat rounds, round results,
 * and game outcomes.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class UI {
    Scanner keyboard = new Scanner(System.in);
    /**
     * Displays a welcome message at the beginning of the game.
     */
    public void welcomeMessage() {
        System.out.println("Game Loading....");
        System.out.println("Welcome to Ultimate Combat!");
        System.out.println("---------------------------------");
    }
    /**
     * Displays the game title.
     */
    public void displayGameTitle() {
        System.out.println("==== Ultimate Combat ====");
        System.out.println("");
    }

    /**
     * Displays the selected fighters.
     *
     * @param characters The list of selected characters.
     */
    public void displaySelectedFighters(List<Character> characters) {
        System.out.println("Fighters Selected: ");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i + 1) + ". " + characters.get(i).getName());
            characters.get(i).displayStats();
        }
    }

    /**
     * Displays a list of characters available for selection.
     *
     * @param characters The list of characters to display.
     */
    public void displayCharacterList(List<Character> characters) {
        System.out.println("----Fighter Selection Menu----");
        System.out.println("----Select your fighter: ");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println("---------------------\n");
            System.out.println((i + 1) + ". " + characters.get(i).getName());
            characters.get(i).displayStats();
        }
        System.out.println("\n---------------------");

    }

    /**
     * Displays combat information for the current round.
     *
     * @param player        The player character.
     * @param opponent      The opponent character.
     * @param playerAttack  The player's attack damage.
     * @param opponentAttack The opponent's attack damage.
     */
    public void displayCombat(Character player, Character opponent, int playerAttack, int opponentAttack) {
        System.out.println("---------------------------------");
        System.out.println("Player Attack Damage: " + playerAttack);
        System.out.println("Opponent Health: " + opponent.getHealth());
        System.out.println("---------------------------------");
        System.out.println("Opponent Attack Damage: " + playerAttack);
        System.out.println("Player Health: " + player.getHealth());
        System.out.println("---------------------------------");
    }

    /**
     * Presents the user with a list of characters to select from.
     *
     * @param characters The list of characters to display.
     */
    public void selectFighter(List<Character> characters) {
        System.out.println("Select your fighter: ");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i + 1) + ". " + characters.get(i).getName());
            characters.get(i).displayStats();
        }
    }

    /**
     * Displays the winner of the game.
     *
     * @param winner The winning character.
     */
    public void displayWinner(Character winner) {
        System.out.println("\n === Winner ===");
        System.out.println(winner.getName() + "wins Ultimate Combat!");
        System.out.println("---------------------------------");
    }

    /**
     * Displays the results of a round, including the health of both the player and the opponent.
     *
     * @param player   The player character.
     * @param opponent The opponent character.
     */
    public void displayRoundResults(Character player, Character opponent) {
        System.out.println("---------------------------------");
        System.out.println("Round Results: ");
        if (player.getHealth() > 0 && opponent.getHealth() <= 0) {
            System.out.println("Player wins the round!");
        } else if (opponent.getHealth() > 0 && player.getHealth() <=0 ) {
            System.out.println("Opponent wins the round!");
        }
        System.out.println(player.getName() + "'s" + " Health: " + player.getHealth());
        System.out.println(opponent.getName() + "'s" + " Health: " + opponent.getHealth());
    }

    /**
     * Displays the final results of the game, including the number of wins for both the player
     * and the opponent, and declares the overall winner.
     *
     * @param playerWins   The number of wins for the player.
     * @param opponentWins The number of wins for the opponent.
     */
    public void displayGameResults(int playerWins, int opponentWins) {
        System.out.println("---------------------------------");
        System.out.println("Game Results: ");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Opponent Wins: " + opponentWins);

        if (playerWins > opponentWins) {
            System.out.println("Victory is yours!");
        } else if (opponentWins > playerWins) {
            System.out.println("The Opponent has won the game...");
        } else {
            System.out.println("A tie! What a glorious match!");
        }
    }

    /**
     * Displays the start of a new fight round.
     *
     * @param roundNumber The current round number.
     */
    public void startFightRound(int roundNumber) {
        System.out.println("\n--- Round " + roundNumber + "---");
        System.out.println("FIGHT!");
    }


    /**
     * Prompts the user to select a fighter and returns the index of the selected fighter.
     *
     * @param characters The list of available characters.
     * @return The index of the selected fighter.
     */
    public int selectFighterPrompt(List<Character> characters) {
        return getIntInput("Enter the number of the fighter you want to select (1-" + characters.size() + "): ", 1, characters.size()) - 1;
    }

    /**
     * Prompts the user to continue to the next round.
     */
    public void promptContinue() {
        System.out.println("Press 'Enter' to continue fighting!");
        keyboard.nextLine();
    }

    /**
     * Gets integer input from the user within a specified range.
     *
     * @param prompt The prompt to display to the user.
     * @param min    The minimum allowed value.
     * @param max    The maximum allowed value.
     * @return The user's selected integer.
     */
    public int getIntInput(String prompt, int min, int max) {
        int choice;
        do {
            System.out.println(prompt);
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

    /**
     * Prompts the user to play the game again and returns true if the user chooses to continue.
     *
     * @return True if the user wants to play again, false otherwise.
     */
    public boolean playAgain() {
        System.out.println("Do you want to fight again? (y/n): ");
        String choice = keyboard.nextLine().trim().toLowerCase();

        while (!choice.equals("y") && !choice.equals("n")) {
            System.out.println("Invalid input. Please enter 'y' or 'n'...");
            choice = keyboard.nextLine().trim().toLowerCase();
        }
        return choice.equals("y");
    }

}

