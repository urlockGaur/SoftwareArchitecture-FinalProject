import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        new Main().run();
    }

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
            System.out.println("Player choice index: " + playerChoice);
            System.out.println("Opponent choice index: " + opponentChoice);

        } while (ui.playAgain());
    }
}

