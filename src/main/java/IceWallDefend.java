import java.util.Random;
class IceWallDefend implements DefendStrategy {

    private Random rand = new Random();
    @Override
    public int defend(int attack) {

        int baseReduction = attack / 2;
        boolean spikedIceWallBlock = rand.nextInt(100) < 25; // 25% chance of spike ice wall block

        if (spikedIceWallBlock) {
            System.out.println("Ice Wall is boosted to Spiked Ice Wall! Extra Defense!");
            return baseReduction + 5;
        } else {
            System.out.println("Ice Wall defends!");
            return baseReduction;
        }
    }
}
