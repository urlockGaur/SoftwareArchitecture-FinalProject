import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class OneInchPunchAttackTest {


    @Test
    public void testAttackDmg() {
        OneInchPunchAttack oneInchPunchAttack = new OneInchPunchAttack();
        assertEquals(25, oneInchPunchAttack.attackDmg());
    }

    @Test
    public void testAttackWithIsCritical() {
        OneInchPunchAttack oneInchPunchAttack = new OneInchPunchAttack();
        assertTrue(oneInchPunchAttack.attack() >= 50);
    }

    @Test
    public void testAttackWithoutIsCritical() {
        OneInchPunchAttack oneInchPunchAttack = new OneInchPunchAttack();
        assertEquals(25, oneInchPunchAttack.attack());
    }
}
