import java.util.Random;
/**
 * The class Blade Parry Defend represents a defensive strategy based on blade parrying.
 * Part of the Strategy Pattern requirement of project
 *
 * This class implements the DefendStrategy interface and provides a method to defend against an
 * opponent's attack using a blade parry. The success of the parry is determined by a random chance.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class BladeParryDefend implements DefendStrategy{
    private Random rand = new Random();

    /**
     * Defends against an opponent's attack using blade parry.
     *
     * @param currentHealth The current health of the defending entity.
     * @param opponentAttack The attack damage inflicted by the opponent.
     * @return The updated health after defending against the opponent's attack.
     */

    @Override
    public int defend(int currentHealth, int opponentAttack) {
        boolean activatesFuriosBladeParry = rand.nextInt(100) < 13; // 13% chance of activation

        if (activatesFuriosBladeParry) {
            System.out.println("[VEE] Furious Blade Parry deflects the attack!");
            return currentHealth;
        } else {
            System.out.println("[VEE] Blade Parry deflects most of the attack.");
            return (currentHealth + 2) - opponentAttack;
        }
    }
}

