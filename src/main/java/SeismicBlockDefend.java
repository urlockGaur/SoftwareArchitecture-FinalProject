import java.util.Random;
/**
 * The class Seismic Block Defend represents a defensive strategy based on a seismic wave creating debris that can be used to block attacks.
 * Part of the Strategy Pattern requirement of project
 *
 * This class implements the DefendStrategy interface and provides a method to defend against an
 * opponent's attack using a defensive wall of debris. The success of the seismic block is determined by a random chance.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class SeismicBlockDefend implements DefendStrategy {

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
        boolean activatesSuperSiesmicBlock = rand.nextInt(100) < 24; // 24% chance of activation

        if (activatesSuperSiesmicBlock) {
            System.out.println("Quake smashes the ground to create a defensive wall of debris!");
            return (currentHealth + 3) - opponentAttack;
        } else {
            System.out.println("Attack intercepted by Siesmic Block! Debris flies everywhere.");
            return currentHealth - opponentAttack;
        }
    }
}

