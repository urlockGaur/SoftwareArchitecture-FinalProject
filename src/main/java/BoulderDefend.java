import java.util.Random;
/**
 * The class Boulder Defend represents a defensive strategy based on a wall of boulders forming.
 * Part of the Strategy Pattern requirement of project
 *
 * This class implements the DefendStrategy interface and provides a method to defend against an
 * opponent's attack using a boulder wall. The success of the boulder wall activation is determined by a random chance.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class BoulderDefend implements DefendStrategy {

    private Random rand = new Random();

    /**
     * Defends against an opponent's attack using boulder wall .
     *
     * @param currentHealth The current health of the defending entity.
     * @param opponentAttack The attack damage inflicted by the opponent.
     * @return The updated health after defending against the opponent's attack.
     */
    @Override
    public int defend(int currentHealth, int opponentAttack) {

        boolean boulderWall = rand.nextInt(100) < 5; // 5% chance of boulder wall block

        if (boulderWall) {
            System.out.println("Boulder Block is enhanced to Boulder Wall! Nothing is getting through!");
            return (currentHealth + 15);
        } else {
            System.out.println("Boulder Block defends poorly!");
            return currentHealth - (opponentAttack * 2);
        }
    }
}
