import java.util.Random;

public class SeismicBlockDefend implements DefendStrategy {
    private Random rand = new Random();

    @Override
    public double defend(int attack) {
        double baseReduction = attack / 5.75;
        boolean activatesSuperSiesmicBlock = rand.nextInt(100) < 24; // 24% chance of activation

        if (activatesSuperSiesmicBlock) {
            System.out.println("Quake smashes the ground to create a defensive wall of debris!");
            return baseReduction / 3.25 ;
        } else {
            System.out.println("Attack intercepted by Siesmic Block! Debris flies everywhere.");
            return baseReduction;
        }
    }
}
