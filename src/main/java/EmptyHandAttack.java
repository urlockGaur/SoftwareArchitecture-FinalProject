import java.util.Random;

public class EmptyHandAttack implements AttackStrategy {
    private Random rand = new Random();

    @Override
    public int attack() {
        return (rand.nextInt(10) > 5) ? 20 : 0;
    }
}
