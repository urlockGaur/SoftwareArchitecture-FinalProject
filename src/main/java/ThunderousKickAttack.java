import java.util.Random;
/**
 * The class ThunderousKickAttack represents an offensive strategy involving a powerful kick.
 *
 * This class implements the AttackStrategy interface and provides methods to calculate the
 * damage inflicted by a thunderous kick. The kick has a chance to cause a shockwave, dealing
 * additional damage.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class ThunderousKickAttack implements AttackStrategy {
    private Random rand = new Random();
    /**
     * Gets the base damage of the thunderous kick attack.
     *
     * @return The base damage of the attack.
     */
    @Override
    public int attackDmg() {
        return 19;
    };
    /**
     * Performs the thunderous kick attack, considering the chance to cause a shockwave.
     *
     * @return The total damage inflicted by the attack.
     */
    @Override
    public int attack() {

        int baseDamage = 19;

        // does thunderous kick cause shockwave?
        boolean causesShockwave = rand.nextInt(100) < 22 ; //22% chance of soul bleed

        if (causesShockwave) {
            System.out.println("Thunderous Kick causes a shockwave!");
            return baseDamage + 12;
        } else {
            return baseDamage;
        }
    }
}
