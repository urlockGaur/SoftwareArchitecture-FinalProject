import java.util.Random;

public class CamoCloakDefend implements DefendStrategy {
    private Random rand = new Random();

        @Override
        public double defend(int attack) {
            double baseReduction = attack / 2.0;
            boolean activatesCamoCloak = rand.nextInt(100) < 15; // 50% chance of activation

            if (activatesCamoCloak) {
                System.out.println("Camo Cloak activates, blending Tanith into the environment. Impossible to see.");
                return 0;
            } else {
                System.out.println("Camo cloak shifts colors, causing a glancing blow.");
                return baseReduction;
            }
        }
}
