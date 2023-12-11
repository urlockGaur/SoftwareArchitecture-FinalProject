import java.util.Random;
/**
 * The class Camo Cloak Defend represents a defensive strategy based on a camo cloak that blends the wearer into the immediate environment.
 * * Part of the Strategy Pattern requirement of project
 *
 * This class implements the DefendStrategy interface and provides a method to defend against an
 * opponent's attack using a camo cloak. The success of the camo cloak activation is determined by a random chance.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class CamoCloakDefend implements DefendStrategy {
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
            boolean activatesCamoCloak = rand.nextInt(100) < 15; // 50% chance of activation

            if (activatesCamoCloak) {
                System.out.println("[TANITH] Camo Cloak activates, blending Tanith into the environment. Impossible to see.");
                return currentHealth;
            } else {
                System.out.println("[TANITH] Camo cloak shifts colors, causing a glancing blow.");
                return currentHealth - opponentAttack;
            }
        }
}
