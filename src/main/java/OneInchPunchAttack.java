import java.util.Random;

public class OneInchPunchAttack implements AttackStrategy {
    private Random rand = new Random();

    @Override
    public int attack() {

        int baseDamage = 20;

        // does punch crit opponent?
        boolean isCritical = rand.nextInt(10) < 2; //20% chance of crit hit

        if (isCritical) {
            System.out.println("One Inch Punch lands a Critical Hit!");
            return baseDamage * 2;
        } else {
            return baseDamage;
        }
    }

}
