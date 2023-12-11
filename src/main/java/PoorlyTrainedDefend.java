import java.util.Random;
/**
 * The class Poorly Trained Defend represents a defensive strategy based on a fighters lack of training his defensive abilities.
 *
 * This class implements the DefendStrategy interface and provides a method to defend against an
 * opponent's attack using a quick parry that is not great a blocking. The success of the quick parry is determined by a random chance and give bonus health if it goes off.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class PoorlyTrainedDefend implements DefendStrategy {



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
        boolean quickParry = rand.nextInt(100) < 7; // 7% chance of boulder wall block


        if (quickParry) {
            System.out.println("Stryker miraculously parries the blow!");
            return currentHealth + 20;
        } else {
            System.out.println("Blocking is for the weak.");
            return (currentHealth - opponentAttack) / 2;
        }
    }
}
