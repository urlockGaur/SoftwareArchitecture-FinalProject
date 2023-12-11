import java.util.Random;

public class BlastShieldDefend implements DefendStrategy{
    private Random rand = new Random();

    @Override
    public int defend(int currentHealth, int opponentAttack) {
        boolean activateBlastShield = rand.nextInt(100) < 33; // 33% chance of activation

        if (activateBlastShield) {
            System.out.println("Blast Shield activates, absorbing the impact!");
            return  (currentHealth + 10) - opponentAttack;
        } else {
            System.out.println("Blast Shield deployed for standard defense protocol.");
            return currentHealth - opponentAttack;
        }
    }
}
