import java.util.Random;

public class FireBreathAttack implements AttackStrategy {
    private Random rand = new Random();

    @Override
    public int attackDmg() {
        return 24;
    };

    @Override
    public int attack() {

        int baseDamage = 14;

        //determines if fire breath causes burning
        boolean burning = rand.nextInt(10) < 5; //50% chance of burning

        if (burning) {
            System.out.println("Fire Breath burns the opponent. Crispy!");
            return baseDamage + 4;
        } else {
            return baseDamage;
        }
    }
}
