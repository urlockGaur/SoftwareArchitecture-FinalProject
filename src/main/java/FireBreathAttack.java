import java.util.Random;
/**
 * The class FireBreathAttack represents an offensive strategy based on a fire breath attack.
 *
 * This class implements the AttackStrategy interface and provides methods to calculate the
 * damage inflicted by a fire breath attack. The attack has a chance to cause burning, dealing
 * additional damage over time.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class FireBreathAttack implements AttackStrategy {
    private Random rand = new Random();
    /**
     * Gets the base damage of the fire breath attack.
     *
     * @return The base damage of the attack.
     */
    @Override
    public int attackDmg() {
        return 14;
    };
    /**
     * Performs the fire breath attack, considering the chance to cause burning.
     *
     * @return The total damage inflicted by the attack.
     */
    @Override
    public int attack() {

        int baseDamage = 14;

        //determines if fire breath causes burning
        boolean burning = rand.nextInt(100) < 50; //50% chance of burning

        if (burning) {
            System.out.println("Fire Breath burns the opponent. Crispy!");
            return baseDamage + 4;
        } else {
            return baseDamage;
        }
    }
}
