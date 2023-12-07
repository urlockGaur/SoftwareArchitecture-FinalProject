public class Main {


    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Game theGame = Game.getInstance();
        Character player1 = CharacterFactory.getCharacter();
        Character player2 = CharacterFactory.getCharacter();

        while (theGame.isGameDone(player1, player2)) {
            theGame.fight(player1, player2);
        }
    }
}

