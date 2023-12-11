import java.util.Random;
/**
 * The class Blast Shield Defend represents a defensive strategy based on Blast Shield activating.
 * Part of the Strategy Pattern requirement of project
 *
 * This class implements the DefendStrategy interface and provides a method to defend against an
 * opponent's attack using a blast shield. The success of the blast shield enhanced activation is determined by a random chance.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class BlastShieldDefend implements DefendStrategy{
    private Random rand = new Random();

    /**
     * Defends against an opponent's attack using blast shield.
     *
     * @param currentHealth The current health of the defending entity.
     * @param opponentAttack The attack damage inflicted by the opponent.
     * @return The updated health after defending against the opponent's attack.
     */
    @Override
    public int defend(int currentHealth, int opponentAttack) {
        boolean activateBlastShield = rand.nextInt(100) < 33; // 33% chance of activation

        if (activateBlastShield) {
            System.out.println("[CYRPTARQ] Blast Shield activates, absorbing the impact!");
            return  (currentHealth + 10) - opponentAttack;
        } else {
            System.out.println("[CYRPTARQ] Blast Shield deployed for standard defense protocol.");
            return currentHealth - opponentAttack;
        }
    }
}
