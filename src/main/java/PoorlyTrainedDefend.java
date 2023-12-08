import java.util.Random;

public class PoorlyTrainedDefend implements DefendStrategy {

    private Random rand = new Random();
    @Override
    public double defend(int attack) {

        double baseReduction = attack / 10.5;
        boolean quickParry = rand.nextInt(100) < 10; // 10% chance of boulder wall block

        if (quickParry) {
            System.out.println("Stryker miraculously parries the blow!");
            return (baseReduction + 20.0);
        } else {
            System.out.println("Blocking is for the weak.");
            return baseReduction - 10.0;
        }
    }
}
