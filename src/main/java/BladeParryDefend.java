import java.util.Random;

public class BladeParryDefend implements DefendStrategy{
    private Random rand = new Random();

    @Override
    public int defend(int currentHealth, int opponentAttack) {
        boolean activatesFuriosBladeParry = rand.nextInt(100) < 13; // 13% chance of activation

        if (activatesFuriosBladeParry) {
            System.out.println("Furious Blade Parry deflects the attack!");
            return currentHealth;
        } else {
            System.out.println("Blade Parry deflects most of the attack.");
            return (currentHealth + 2) - opponentAttack;
        }
    }
}

