import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class contains test cases for the {@link EmperorsBladeAttack} class.
 *
 * The tests include scenarios for checking the damage, critical attack, and non-critical attack
 * behavior of the {@code EmperorsBladeAttack} class.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class EmperorsBladeAttackTest {

    /**
     * Tests the {@link EmperorsBladeAttack#attackDmg()} method to ensure it returns the expected damage.
     */
    @Test
    public void testAttackDmg() {
        EmperorsBladeAttack emperorsBladeAttack = new EmperorsBladeAttack();
        assertEquals(24, emperorsBladeAttack.attackDmg());
    }
    /**
     * Tests the {@link EmperorsBladeAttack#attack()} method when an attack is expected to be critical.
     */
    @Test
    public void testAttackWithIsCritical() {
        EmperorsBladeAttack emperorsBladeAttack = new EmperorsBladeAttack();
        assertTrue(emperorsBladeAttack.attack() >= 53);
    }
    /**
     * Tests the {@link EmperorsBladeAttack#attack()} method when an attack is not expected to be critical.
     */
    @Test
    public void testAttackWithoutIsCritical() {
        EmperorsBladeAttack emperorsBladeAttack = new EmperorsBladeAttack();
        assertEquals(29, emperorsBladeAttack.attack());
    }
}
