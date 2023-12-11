import java.util.List;
/**
 * The Game class represents the main game logic and flow.
 *
 * It follows the Singleton pattern, ensuring that only one instance of the game exists.
 * The game consists of three rounds where two characters engage in combat. The outcome of each
 * round is determined based on the health of the characters. The overall winner is decided by the
 * number of rounds won by each player.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class Game {
    private static Game instance;
    /**
     * Private constructor to enforce the Singleton pattern.
     */
    private Game() {

    }
    /**
     * Gets the instance of the Game class. If an instance does not exist, a new one is created.
     *
     * @return The singleton instance of the Game class.
     */
    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
    /**
     * Plays the game for a given player and opponent, displaying the results through the UI.
     *
     * @param player   The player character.
     * @param opponent The opponent character.
     * @param ui       The user interface for displaying game information.
     */
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
