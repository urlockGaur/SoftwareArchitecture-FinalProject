import java.util.Random;
/**
 * The class EnergyBlastAttack represents an offensive strategy based on an energy blast attack.
 *
 * This class implements the AttackStrategy interface and provides methods to calculate the
 * damage inflicted by an energy blast attack. The attack has a chance to trigger a massive explosion,
 * dealing additional damage.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class EnergyBlastAttack implements AttackStrategy {


    private Random rand = new Random();
    /**
     * Gets the base damage of the energy blast attack.
     *
     * @return The base damage of the attack.
     */
    @Override
    public int attackDmg() {
        return 18;
    };
    /**
     * Performs the energy blast attack, considering the chance to trigger a massive explosion.
     *
     * @return The total damage inflicted by the attack.
     */
    @Override
    public int attack() {

        int baseDamage = 18;

        // does blast cause explosion?
        boolean causesExplosion = rand.nextInt(100) < 25; //25% chance of explosion

        if (causesExplosion) {
            System.out.println("Energy Blast triggers a massive explosion!");
            return baseDamage + 10;
        } else {
            return baseDamage;
        }
    }
}
