import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 * This class contains test cases for the {@link ThunderousKickAttack} class.
 *
 * <p>The tests include scenarios for checking the damage, generating a shockwave with a critical attack,
 * and non-critical attack behavior of the {@code ThunderousKickAttack} class.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class ThunderousKickAttackTest {
    /**
     * Tests the {@link ThunderousKickAttack#attackDmg()} method to ensure it returns the expected damage.
     */
    @Test
    public void testAttackDmg() {
        ThunderousKickAttack thunderousKick = new ThunderousKickAttack();
        assertEquals(19, thunderousKick.attackDmg());
    }
    /**
     * Tests the {@link ThunderousKickAttack#attack()} method when generating a shockwave with a critical attack.
     */
    @Test
    public void testAttackWithShockwave() {
        ThunderousKickAttack thunderousKick = new ThunderousKickAttack();
        assertTrue(thunderousKick.attack() > 19);
    }
    /**
     * Tests the {@link ThunderousKickAttack#attack()} method when a non-critical attack is expected.
     */
    @Test
    public void testAttackWithoutShockwave() {
        ThunderousKickAttack thunderousKick = new ThunderousKickAttack();
        assertTrue(thunderousKick.attack() == 19);
    }
}

