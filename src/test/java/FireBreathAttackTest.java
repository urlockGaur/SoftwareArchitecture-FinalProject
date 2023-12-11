import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class contains test cases for the {@link FireBreathAttack} class.
 *
 * The tests include scenarios for checking the damage, burning attack, and non-burning attack
 * behavior of the {@code FireBreathAttack} class.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class FireBreathAttackTest {

    /**
     * Tests the {@link FireBreathAttack#attackDmg()} method to ensure it returns the expected damage.
     */
    @Test
    public void testAttackDmg() {
        FireBreathAttack fireBreathAttack = new FireBreathAttack();
        assertEquals(14, fireBreathAttack.attackDmg());
    }
    /**
     * Tests the {@link FireBreathAttack#attack()} method when an attack is expected to cause burning.
     */
    @Test
    public void testAttackWithBurning() {
        FireBreathAttack fireBreathAttack = new FireBreathAttack();
        assertTrue(fireBreathAttack.attack() >= 14);
    }
    /**
     * Tests the {@link FireBreathAttack#attack()} method when an attack is not expected to cause burning.
     */
    @Test
    public void testAttackWithoutBurning() {
        FireBreathAttack fireBreathAttack = new FireBreathAttack();
        int result = fireBreathAttack.attack();
        System.out.println("Actual Result: " + result);
        assertEquals(14, result);
    }
}
