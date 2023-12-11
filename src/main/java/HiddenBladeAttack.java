import java.util.Random;

public class HiddenBladeAttack implements AttackStrategy {
    private Random rand = new Random();

    @Override
    public int attackDmg() {
        return 24;
    };

    @Override
    public int attack() {

        int baseDamage = 17;

        // does blade cause soul bleed?
        boolean causesPoisoned = rand.nextInt(100) < 66 ; //66% chance of poison

        if (causesPoisoned) {
            System.out.println("Tanith's blades are poisoned! The opponent feels weakened.");
            return baseDamage + 6;
        } else {
            return baseDamage;
        }
    }
}
