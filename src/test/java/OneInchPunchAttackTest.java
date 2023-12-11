import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class contains test cases for the {@link OneInchPunchAttack} class.
 *
 * <p>The tests include scenarios for checking the damage, critical attack, and non-critical attack
 * behavior of the {@code OneInchPunchAttack} class.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class OneInchPunchAttackTest {

    /**
     * Tests the {@link OneInchPunchAttack#attackDmg()} method to ensure it returns the expected damage.
     */
    @Test
    public void testAttackDmg() {
        OneInchPunchAttack oneInchPunchAttack = new OneInchPunchAttack();
        assertEquals(25, oneInchPunchAttack.attackDmg());
    }
    /**
     * Tests the {@link OneInchPunchAttack#attack()} method when a critical attack is expected.
     */
    @Test
    public void testAttackWithIsCritical() {
        OneInchPunchAttack oneInchPunchAttack = new OneInchPunchAttack();
        assertTrue(oneInchPunchAttack.attack() >= 50);
    }
    /**
     * Tests the {@link OneInchPunchAttack#attack()} method when a non-critical attack is expected.
     */
    @Test
    public void testAttackWithoutIsCritical() {
        OneInchPunchAttack oneInchPunchAttack = new OneInchPunchAttack();
        int result = oneInchPunchAttack.attack();
        assertTrue(result >= 25 && result <= 50);
    }
}
