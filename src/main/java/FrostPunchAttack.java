import java.util.Random;
/**
 * The class FrostPunchAttack represents an offensive strategy based on a frost punch attack.
 *
 * This class implements the AttackStrategy interface and provides methods to calculate the
 * damage inflicted by a frost punch attack. The attack has a chance to freeze the opponent,
 * dealing additional damage.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class FrostPunchAttack implements AttackStrategy {
    private Random rand = new Random();
    /**
     * Gets the base damage of the frost punch attack.
     *
     * @return The base damage of the attack.
     */
    @Override
    public int attackDmg() {
        return 10;
    };
    /**
     * Performs the frost punch attack, considering the chance to freeze the opponent.
     *
     * @return The total damage inflicted by the attack.
     */
    @Override
    public int attack() {

        int baseDamage = 10;

        // does punch freeze opponent?
        boolean freezes = rand.nextInt(10) < 3; //30% chance of freeze

        if (freezes) {
            System.out.println("[Freeze] Frost Punch freezes the opponent!");
            return baseDamage + 5;
        } else {
            System.out.println("[Freeze] Frost Punch lands cold blows!");
            return baseDamage;
        }
    }

}
