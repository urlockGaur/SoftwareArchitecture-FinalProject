import java.util.Random;

public class ShimmerSwordAttack implements AttackStrategy {
    private Random rand = new Random();

    @Override
    public int attackDmg() {
        return 16;
    };

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
