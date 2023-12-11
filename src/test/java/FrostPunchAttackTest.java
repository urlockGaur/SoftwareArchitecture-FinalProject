import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 * This class contains test cases for the {@link FrostPunchAttack} class.
 *
 * The tests include scenarios for checking the damage, freezing attack, and non-freezing attack
 * behavior of the {@code FrostPunchAttack} class.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class FrostPunchAttackTest {
    /**
     * Tests the {@link FrostPunchAttack#attackDmg()} method to ensure it returns the expected damage.
     */
    @Test
    public void testAttackDmg() {
        FrostPunchAttack frostPunchAttack = new FrostPunchAttack();
        assertEquals(10, frostPunchAttack.attackDmg());
    }
    /**
     * Tests the {@link FrostPunchAttack#attack()} method when an attack is expected to cause freezing.
     */
    @Test
    public void testAttackWithFreeze() {
        FrostPunchAttack frostPunchAttack = new FrostPunchAttack();
        assertTrue(frostPunchAttack.attack() >= 15);
    }
    /**
     * Tests the {@link FrostPunchAttack#attack()} method when an attack is not expected to cause freezing.
     */
    @Test
    public void testAttackWithoutFreeze() {
        FrostPunchAttack frostPunchAttack = new FrostPunchAttack();
        assertEquals(10, frostPunchAttack.attack());
    }
}
