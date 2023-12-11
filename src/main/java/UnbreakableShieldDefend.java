import java.util.Random;
/**
 * The class Unbreakable Shield Defend represents a defensive strategy based on a powerful shield that deflects most damage.
 * Part of the Strategy Pattern requirement of project
 *
 * This class implements the DefendStrategy interface and provides a method to defend against an
 * opponent's attack using an unbreakable shield. The success of the block is determined by a random chance with the ability to deflect all damage.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class UnbreakableShieldDefend implements DefendStrategy {
    private Random rand = new Random();
    /**
     * Defends against an opponent's attack using a camo cloak .
     *
     * @param currentHealth The current health of the defending entity.
     * @param opponentAttack The attack damage inflicted by the opponent.
     * @return The updated health after defending against the opponent's attack.
     */
    @Override
    public int defend(int currentHealth, int opponentAttack) {
        boolean activatesUnbreakable = rand.nextInt(100) < 50; // 50% chance of activation

        if (activatesUnbreakable) {
            System.out.println("Unbreakable Shield activated blocking all damage!");
            return currentHealth;
        } else {
            System.out.println("Unbreakable Shield absorbs the hit with incredible ease.");
            return currentHealth - opponentAttack + 5;
        }
    }
}

