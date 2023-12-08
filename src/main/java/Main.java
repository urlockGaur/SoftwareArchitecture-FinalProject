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

        ui.displayGameTitle();
        int playerChoice = ui.selectFighterPrompt(characters);
        Character player = characters.get(playerChoice - 1);

        characters.remove(player); // ensures opponent selects different fighter
        int opponentChoice = ui.selectFighterPrompt(characters);
        Character opponent = characters.get(opponentChoice - 1);

        ui.displayGameTitle();
        ui.selectFighter(List.of(player, opponent));

        theGame.playGame(player, opponent, ui);


    }
}

