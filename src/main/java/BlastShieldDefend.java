import java.util.Random;

public class BlastShieldDefend implements DefendStrategy{
    private Random rand = new Random();

    @Override
    public double defend(int attack) {
        double baseReduction = attack / 5.5;
        boolean activateBlastShield = rand.nextInt(100) < 33; // 33% chance of activation

        if (activateBlastShield) {
            System.out.println("Blast Shield activates, absorbing the impact!");
            return  (baseReduction + 10);
        } else {
            System.out.println("Blast Shield deployed for standard defense protocol.");
            return baseReduction;
        }
    }
}
