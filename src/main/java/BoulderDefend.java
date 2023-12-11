import java.util.Random;

public class BoulderDefend implements DefendStrategy {

    private Random rand = new Random();
    @Override
    public int defend(int currentHealth, int opponentAttack) {

        boolean boulderWall = rand.nextInt(100) < 5; // 5% chance of boulder wall block

        if (boulderWall) {
            System.out.println("Boulder Block is enhanced to Boulder Wall! Nothing is getting through!");
            return (currentHealth + 15);
        } else {
            System.out.println("Boulder Block defends poorly!");
            return currentHealth - (opponentAttack * 2);
        }
    }
}
