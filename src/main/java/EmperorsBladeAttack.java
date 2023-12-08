import java.util.Random;

public class EmperorsBladeAttack implements AttackStrategy {
    private Random rand = new Random();

    @Override
    public int attack() {

        int baseDamage = 24;

        // does blade cause soul bleed?
        boolean causesSoulBleed = rand.nextInt(100) < 10 ; //10% chance of soul bleed

        if (causesSoulBleed) {
            System.out.println("The attack slices deep! The opponent's soul bleeds!");
            return (baseDamage * 2) + 5;
        } else {
            return baseDamage;
        }
    }
}
