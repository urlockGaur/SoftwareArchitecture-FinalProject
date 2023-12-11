import java.util.Random;
/**
 * The class OneInchPunchAttack represents an offensive strategy based on a powerful one-inch punch.
 *
 * This class implements the AttackStrategy interface and provides methods to calculate the
 * damage inflicted by a one-inch punch attack. The attack has a chance to land a critical hit,
 * dealing double the base damage.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class OneInchPunchAttack implements AttackStrategy {
    private Random rand = new Random();
    /**
     * Gets the base damage of the one-inch punch attack.
     *
     * @return The base damage of the attack.
     */
    @Override
    public int attackDmg() {
        return 25;
    };
    /**
     * Performs the one-inch punch attack, considering the chance to land a critical hit.
     *
     * @return The total damage inflicted by the attack.
     */
    @Override
    public int attack() {

        int baseDamage = 25;

        // does punch crit opponent?
        boolean isCritical = rand.nextInt(10) < 2; //20% chance of crit hit

        if (isCritical) {
            System.out.println("One Inch Punch lands a Critical Hit!");
            return baseDamage * 2;
        } else {
            return baseDamage;
        }
    }

}
