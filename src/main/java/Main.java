import java.util.ArrayList;
import java.util.List;
/**
 * The Main class is the entry point for the game. It initializes the user interface, character
 * factory, and game instance. The player can select characters to engage in a series of battles
 * against opponents. The game continues until the player chooses not to play again.
 *
 * The `main` method creates an instance of the `Main` class and invokes the `run` method to
 * start the game.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class Main {
    /**
     * The entry point of the application.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        new Main().run();
    }
    /**
     * Runs the game by initializing necessary components, allowing the player to select
     * characters, and starting the game rounds.
     */
    private void run() {
        UI ui = new UI();
        CharacterFactory characterFactory = new CharacterFactory();
        Game theGame = Game.getInstance();

        ui.welcomeMessage();
        List<Character> characters = CharacterFactory.createCharacters();
        List<Character> selectedCharacters = new ArrayList<>();

        do {
            // Display the list of fighter/character
            ui.displayGameTitle();
            ui.displayCharacterList(characters);

            // Allow the player to select a fighter/character
            int playerChoice = ui.selectFighterPrompt(characters);
            Character player = characters.get(playerChoice);
            selectedCharacters.add(player);

            int opponentChoice = ui.selectFighterPrompt(characters);
            Character opponent = characters.get(opponentChoice);
            selectedCharacters.add(opponent);

            ui.displaySelectedFighters(selectedCharacters);

            theGame.playGame(player, opponent, ui);

            // Debug print statements
//            System.out.println("Player choice index: " + playerChoice);
//            System.out.println("Opponent choice index: " + opponentChoice);

        } while (ui.playAgain());
    }
}

