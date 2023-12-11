import java.util.Random;

public class FrostPunchAttack implements AttackStrategy {
    private Random rand = new Random();

    @Override
    public int attackDmg() {
        return 24;
    };

    @Override
    public int attack() {

        int baseDamage = 10;

        // does punch freeze opponent?
        boolean freezes = rand.nextInt(10) < 3; //30% chance of freeze

        if (freezes) {
            System.out.println("Frost Punch freezes the opponent!");
            return baseDamage + 5;
        } else {
            return baseDamage;
        }
    }

}
