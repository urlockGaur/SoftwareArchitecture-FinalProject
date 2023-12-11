import java.util.Random;
/**
 * The class ShimmerSwordAttack represents an offensive strategy involving a shimmering sword.
 *
 * This class implements the AttackStrategy interface and provides methods to calculate the
 * damage inflicted by a shimmer sword attack. The attack has a chance to cause a deep wound,
 * dealing triple the base damage.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class ShimmerSwordAttack implements AttackStrategy {
    private Random rand = new Random();

    /**
     * Gets the base damage of the shimmer sword attack.
     *
     * @return The base damage of the attack.
     */
    @Override
    public int attackDmg() {
        return 16;
    };
    /**
     * Performs the shimmer sword attack, considering the chance to cause a deep wound.
     *
     * @return The total damage inflicted by the attack.
     */
    @Override
    public int attack() {

        int baseDamage = 16;

        // does causesDeepWound kick cause shockwave?
        boolean causesDeepWound = rand.nextInt(100) < 20 ; //20% chance of deep wound

        if (causesDeepWound) {
            System.out.println("Shimmer Sword cuts a deep wound!");
            return baseDamage * 3;
        } else {
            return baseDamage;
        }
    }
}
