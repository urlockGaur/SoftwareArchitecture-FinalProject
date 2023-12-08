import java.util.Random;

public class UnbreakableShieldDefend implements DefendStrategy {
    private Random rand = new Random();

    @Override
    public double defend(int attack) {
        double baseReduction = attack / 3.5;
        boolean activatesUnbreakable = rand.nextInt(100) < 50; // 50% chance of activation

        if (activatesUnbreakable) {
            System.out.println("Unbreakable Shield activated blocking all damage!");
            return 0;
        } else {
            System.out.println("Unbreakable Shield absorbs the hit with incredible ease.");
            return (int) baseReduction;
        }
    }
}
