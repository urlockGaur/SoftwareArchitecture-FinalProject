import java.util.List;

public class Game {
    private static Game instance;

    private Game() {

    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void playGame(Character player, Character opponent, UI ui) {
        int playerWins = 0;
        int opponentWins = 0;

        ui.displayGameTitle();
        // Play three rounds
        for (int round = 1; round <= 3; round++) {
            ui.startFightRound(round);

            // Continue the round until one player's health is zero
            while (player.getHealth() > 0 && opponent.getHealth() > 0) {

                System.out.println("------fighting noises intensify------");
                // Player attacks and defends
                int playerAttack = player.attack();
                player.defend(opponent);

                // Opponent attacks and defends
                int opponentAttack = opponent.attack();
                opponent.defend(player);

                // Print round results
                ui.displayCombat(player, opponent, playerAttack, opponentAttack);

                ui.promptContinue();
            }

            // Determine the winner of the round based on health remaining

            if (player.getHealth() <= 0) {
                opponentWins++;
            } else if (opponent.getHealth() <= 0) {
                playerWins++;
            }
            ui.displayRoundResults(player, opponent);

            // Reset stats for the next round
            player.setHealth(CharacterFactory.getInitialHealth(player.getName()));
            opponent.setHealth(CharacterFactory.getInitialHealth(opponent.getName()));
        }

        // Determine the overall winner based on rounds won
        ui.displayGameResults(playerWins, opponentWins);
    }
}
