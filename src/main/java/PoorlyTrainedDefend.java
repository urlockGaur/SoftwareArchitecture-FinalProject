import java.util.Random;

public class PoorlyTrainedDefend implements DefendStrategy {

    private Random rand = new Random();
    @Override
    public int defend(int currentHealth, int opponentAttack) {
        boolean quickParry = rand.nextInt(100) < 7; // 7% chance of boulder wall block

        if (quickParry) {
            System.out.println("Stryker miraculously parries the blow!");
            return currentHealth + 20;
        } else {
            System.out.println("Blocking is for the weak.");
            return (currentHealth - opponentAttack) / 2;
        }
    }
}
