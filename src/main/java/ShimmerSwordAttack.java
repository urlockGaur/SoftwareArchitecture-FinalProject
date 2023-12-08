import java.util.Random;

public class ShimmerSwordAttack implements AttackStrategy {
    private Random rand = new Random();

    @Override
    public int attack() {

        int baseDamage = 16;

        // does thunderous kick cause shockwave?
        boolean causesDeepWound = rand.nextInt(100) < 35 ; //35% chance of deep wound

        if (causesDeepWound) {
            System.out.println("Shimmer Sword cuts a deep wound!");
            return baseDamage * 3;
        } else {
            return baseDamage;
        }
    }
}
