import java.util.Random;

public class SeismicBlockDefend implements DefendStrategy {
    private Random rand = new Random();

    @Override
    public int defend(int currentHealth, int opponentAttack) {
        boolean activatesSuperSiesmicBlock = rand.nextInt(100) < 24; // 24% chance of activation

        if (activatesSuperSiesmicBlock) {
            System.out.println("Quake smashes the ground to create a defensive wall of debris!");
            return (currentHealth + 3) - opponentAttack;
        } else {
            System.out.println("Attack intercepted by Siesmic Block! Debris flies everywhere.");
            return currentHealth - opponentAttack;
        }
    }
}

