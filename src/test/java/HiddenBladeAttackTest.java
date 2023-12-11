import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class contains test cases for the {@link HiddenBladeAttack} class.
 *
 * The tests include scenarios for checking the damage, poisoned attack, and non-poisoned attack
 * behavior of the {@code HiddenBladeAttack} class.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class HiddenBladeAttackTest {

    /**
     * Tests the {@link HiddenBladeAttack#attackDmg()} method to ensure it returns the expected damage.
     */
    @Test
    public void testAttackDmg() {
        HiddenBladeAttack hiddenBladeAttack = new HiddenBladeAttack();
        assertEquals(17, hiddenBladeAttack.attackDmg());
    }
    /**
     * Tests the {@link HiddenBladeAttack#attack()} method when an attack is expected to cause poisoning.
     */
    @Test
    public void testAttackWithCausesPoisoned() {
        HiddenBladeAttack hiddenBladeAttack = new HiddenBladeAttack();
        assertTrue(hiddenBladeAttack.attack() >= 23);
    }
    /**
     * Tests the {@link HiddenBladeAttack#attack()} method when an attack is not expected to cause poisoning.
     */
    @Test
    public void testAttackWithoutCausesPoisoned() {
        HiddenBladeAttack hiddenBladeAttack = new HiddenBladeAttack();
        int result = hiddenBladeAttack.attack();
        assertTrue(result >= 17 && result <= 23);
    }
}
