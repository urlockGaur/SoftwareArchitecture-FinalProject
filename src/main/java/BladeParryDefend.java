import java.util.Random;

public class BladeParryDefend implements DefendStrategy{
    private Random rand = new Random();

    @Override
    public double defend(int attack) {
        double baseReduction = attack / 4.44;
        boolean activatesFuriosBladeParry = rand.nextInt(100) < 13; // 13% chance of activation

        if (activatesFuriosBladeParry) {
            System.out.println("Furious Blade Parry deflects the attack!");
            return 0;
        } else {
            System.out.println("Blade Parry deflects most of the attack.");
            return baseReduction + 2.0 ;
        }
    }
}

