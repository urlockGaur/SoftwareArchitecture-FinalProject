import java.util.Random;
class IceWallDefend implements DefendStrategy {

    private Random rand = new Random();
    @Override
    public int defend(int currentHealth, int opponentAttack) {

        boolean spikedIceWallBlock = rand.nextInt(100) < 25; // 25% chance of spike ice wall block

        if (spikedIceWallBlock) {
            System.out.println("[Freeze] Ice Wall is boosted to Spiked Ice Wall! Extra Defense!");
            return (currentHealth + 2) - opponentAttack;
        } else {
            System.out.println("[Freeze] Ice Wall defends!");
            return currentHealth - opponentAttack;
        }
    }
}
