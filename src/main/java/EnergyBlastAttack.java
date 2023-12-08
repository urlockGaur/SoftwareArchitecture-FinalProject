import java.util.Random;

public class EnergyBlastAttack implements AttackStrategy {
    private Random rand = new Random();

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
