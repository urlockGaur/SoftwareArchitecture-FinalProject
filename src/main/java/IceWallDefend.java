import java.util.Random;
/**
 * The class Ice Wall Defend represents a defensive strategy based on a ice wall and its ability to enhance to a spiked ice wall.
 *
 * This class implements the DefendStrategy interface and provides a method to defend against an
 * opponent's attack using a ice wall. The success of the ice wall enhance to spiked ice wall is determined by a random chance.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
class IceWallDefend implements DefendStrategy {

    private Random rand = new Random();
    /**
     * Defends against an opponent's attack using an ice wall.
     *
     * @param currentHealth The current health of the defending entity.
     * @param opponentAttack The attack damage inflicted by the opponent.
     * @return The updated health after defending against the opponent's attack.
     */
    @Override
    public int defend(int currentHealth, int opponentAttack) {

        boolean spikedIceWallBlock = rand.nextInt(100) < 25; // 25% chance of spike ice wall block

        if (spikedIceWallBlock) {
            System.out.println("[Freeze] Ice Wall is boosted to Spiked Ice Wall! Extra Defense!");
            return (currentHealth + 2) - opponentAttack;
        } else {
            System.out.println("[Freeze] Ice Wall defends!");
            return currentHealth - opponentAttack;
        }
    }
}
