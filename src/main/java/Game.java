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

    public boolean isGameDone(Character a, Character b, int rounds) {
        return a.getHealth() > 0 && b.getHealth() > 0 && rounds > 0;
    }

    public void playGame(Character player, Character opponent, UI ui) {
        int rounds = 3;
        int playerWins = 0;
        int opponentWins = 0;

        for (int round = 1; round <= rounds; round++) {
            ui.startFightRound(round);
            int playerAttack = player.attack();
            int opponentAttack = opponent.attack();

            player.defend(opponentAttack);
            opponent.defend(playerAttack);

            ui.displayGameTitle();
            ui.selectFighter(List.of(player, opponent));

            ui.displayRoundResults(player,  opponent);

            if (player.getHealth() <= 0 || opponent.getHealth() <= 0) {
                break;
            }
            if (round == rounds && player.getHealth() > 0 && opponent.getHealth() > 0) {
                // If it's the last round and there is a tie, play an additional round
                round--;
            }
        }
        // determine winner bnased on number of rounds won
        if (player.getHealth() > opponent.getHealth()) {
            playerWins++;
        } else if (opponent.getHealth() > player.getHealth()) {
            opponentWins++;
        }
        ui.DisplayGameResults(playerWins, opponentWins);
        }
}
