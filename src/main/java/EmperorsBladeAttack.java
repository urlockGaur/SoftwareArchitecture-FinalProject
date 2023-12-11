import java.util.Random;
/**
 * The class Emperors Blade Attack represents an offensive strategy based on a powerful blade attack.
 *
 * This class implements the AttackStrategy interface and provides methods to calculate the
 * damage inflicted by an Emperor's blade attack. The attack has a chance to cause additional soul bleed damage.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class EmperorsBladeAttack implements AttackStrategy {

    private Random rand = new Random();
    /**
     * Gets the base damage of the Emperor's blade attack.
     *
     * @return The base damage of the attack.
     */
    @Override
    public int attackDmg() {
        return 24;
    };

    /**
     * Performs the Emperor's blade attack, considering the chance to cause soul bleed.
     *
     * @return The total damage inflicted by the attack.
     */
    @Override
    public int attack() {

        int baseDamage = 24;

        // does blade cause soul bleed?
        boolean causesSoulBleed = rand.nextInt(100) < 10 ; //10% chance of soul bleed

        if (causesSoulBleed) {
            System.out.println("The attack slices deep! The opponent's soul bleeds!");
            return (baseDamage * 2) + 5;
        } else {

            return baseDamage + 5;
        }
    }
}
