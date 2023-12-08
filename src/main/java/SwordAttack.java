import java.util.Random;


public class SwordAttack implements AttackStrategy {
    private Random rand = new Random();

    @Override
    public int attack() {
        return rand.nextInt(8) + 3;
    }

}