import java.util.Random;
public class HandDefend implements DefendStrategy {
    private Random rand = new Random();
    @Override
    public int defend(int attack) {
        return (rand.nextInt(2) > 0)?(attack/3):attack;
    }
}