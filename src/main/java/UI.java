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
        System.out.println("");
    }

    public void selectFighter(List<Character> characters) {
        System.out.println("Select your fighter: ");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i + 1) + ". " + characters.get(i).getName());
            characters.get(i).displayStats();
        }
    }

    public void displaySelectedFighters(List<Character> characters) {
        System.out.println("Fighters Selected: ");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i + 1) + ". " + characters.get(i).getName());
            characters.get(i).displayStats();
        }
    }

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

    public void displayCombat(Character player, Character opponent, int playerAttack, int opponentAttack) {
        System.out.println("---------------------------------");
        System.out.println("Player Attack Damage: " + playerAttack);
        System.out.println("Opponent Health: " + opponent.getHealth());
        System.out.println("---------------------------------");
        System.out.println("Opponent Attack Damage: " + playerAttack);
        System.out.println("Player Health: " + player.getHealth());
        System.out.println("---------------------------------");
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
        return getIntInput("Enter the number of the fighter you want to select (1-" + characters.size() + "): ", 1, characters.size()) - 1;
    }

    public void promptContinue() {
        System.out.println("Press 'Enter' to continue fighting!");
        keyboard.nextLine();
    }

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

