import java.util.Random;

public class BoulderDefend implements DefendStrategy {

    private Random rand = new Random();
    @Override
    public double defend(int attack) {

        double baseReduction = attack / 8.5;
        boolean boulderWall = rand.nextInt(100) < 5; // 5% chance of boulder wall block

        if (boulderWall) {
            System.out.println("Boulder Block is enhanced to Boulder Wall! Nothing is getting through!");
            return (baseReduction + 50.0);
        } else {
            System.out.println("Boulder Block defends!");
            return baseReduction;
        }
    }
}
