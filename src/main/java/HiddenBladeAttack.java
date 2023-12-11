import java.util.Random;
/**
 * The class HiddenBladeAttack represents an offensive strategy based on a hidden blade attack.
 *
 * This class implements the AttackStrategy interface and provides methods to calculate the
 * damage inflicted by a hidden blade attack. The attack has a chance to cause the opponent to be
 * poisoned, dealing additional damage over time.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class HiddenBladeAttack implements AttackStrategy {
    private Random rand = new Random();
    /**
     * Gets the base damage of the hidden blade attack.
     *
     * @return The base damage of the attack.
     */
    @Override
    public int attackDmg() {
        return 17;
    };
    /**
     * Performs the hidden blade attack, considering the chance to cause the opponent to be poisoned.
     *
     * @return The total damage inflicted by the attack.
     */
    @Override
    public int attack() {

        int baseDamage = 17;

        // does blade cause soul bleed?
        boolean causesPoisoned = rand.nextInt(100) < 66 ; //66% chance of poison

        if (causesPoisoned) {
            System.out.println("[TANITH] These blades are poisoned! The opponent feels weakened.");
            return baseDamage + 6;
        } else {
            System.out.println("[TANITH] Hidden Blades flash momentarily and strike!");
            return baseDamage;
        }
    }
}
