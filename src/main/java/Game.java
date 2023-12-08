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

    public void fight(Character player, Character opponent, UI ui) {
        int rounds = 3;
        int playerWins = 0;
        int opponentWins = 0;

        for(int round = 1; round <= rounds; round++) {
            ui.startFightRound(round);

            int playerAttack = player.attack();
            int opponentAttack = opponent.attack();

            player.defend(opponentAttack);
            opponent.defend(playerAttack);

            ui.displayGameTitle();
            ui.selectFighter(List.of(player, opponent));

            System.out.println("----------------------");
            System.out.println("Round " + round + " Results: ");
            System.out.println("Player Attack: " + playerAttack);
            System.out.println("Opponent Attack: " + opponentAttack);
            System.out.println(player);
            System.out.println(opponent);

            ui.promptContinue();

            if (player.getHealth() <= 0) {
                opponentWins++;
            } else if (opponent.getHealth() <=0) {
                playerWins++;
            }
        }

        if (playerWins > opponentWins) {
            ui.displayWinner(player);
        } else if (opponentWins > playerWins) {
            ui.displayWinner(opponent);
        } else {
            ui.displayGameTitle();
            System.out.println("\n=== TIE! What a match! ===");
        }

    }

    public void playGame(Character player, Character opponent, UI ui) {
        int maxRounds = 3;
        int roundsPlayed = 0;

        while (isGameDone(player, opponent, maxRounds)) {
            roundsPlayed++;
            fight(player, opponent, ui);

            if (roundsPlayed >= maxRounds) {
                break;
            }
        }
    }
}
