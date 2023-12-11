import java.util.Random;

public class UnbreakableShieldDefend implements DefendStrategy {
    private Random rand = new Random();

    @Override
    public int defend(int currentHealth, int opponentAttack) {
        boolean activatesUnbreakable = rand.nextInt(100) < 50; // 50% chance of activation

        if (activatesUnbreakable) {
            System.out.println("Unbreakable Shield activated blocking all damage!");
            return currentHealth;
        } else {
            System.out.println("Unbreakable Shield absorbs the hit with incredible ease.");
            return currentHealth - opponentAttack + 5;
        }
    }
}

