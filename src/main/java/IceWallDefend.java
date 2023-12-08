import java.util.Random;
class IceWallDefend implements DefendStrategy {

    private Random rand = new Random();
    @Override
    public double defend(int attack) {

        double baseReduction = attack / 7.5;
        boolean spikedIceWallBlock = rand.nextInt(100) < 25; // 25% chance of spike ice wall block

        if (spikedIceWallBlock) {
            System.out.println("Ice Wall is boosted to Spiked Ice Wall! Extra Defense!");
            return (baseReduction + 5.0);
        } else {
            System.out.println("Ice Wall defends!");
            return baseReduction;
        }
    }
}
