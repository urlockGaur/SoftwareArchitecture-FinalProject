import java.util.Random;

public class ThunderousKickAttack implements AttackStrategy {
    private Random rand = new Random();

    @Override
    public int attackDmg() {
        return 19;
    };

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
