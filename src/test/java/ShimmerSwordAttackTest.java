import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 * This class contains test cases for the {@link OneInchPunchAttack} class.
 *
 * <p>The tests include scenarios for checking the damage, causing deep wounds with a critical attack,
 * and non-critical attack behavior of the {@code ShimmerSwordAttack} class.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class ShimmerSwordAttackTest {

    /**
     * Tests the {@link ShimmerSwordAttack#attackDmg()} method to ensure it returns the expected damage.
     */
    @Test
    public void testAttackDmg() {
        ShimmerSwordAttack shimmerSwordAttack = new ShimmerSwordAttack();
        assertEquals(16, shimmerSwordAttack.attackDmg());
    }
    /**
     * Tests the {@link ShimmerSwordAttack#attack()} method when causing deep wounds with a critical attack.
     */
    @Test
    public void testAttackWithCausesDeepWound() {
        ShimmerSwordAttack shimmerSwordAttack = new ShimmerSwordAttack();
        assertTrue(shimmerSwordAttack.attack() >= 48);
    }
    /**
     * Tests the {@link ShimmerSwordAttack#attack()} method when a non-critical attack is expected.
     */
    @Test
    public void testAttackWithoutCausesDeepWound() {
        ShimmerSwordAttack shimmerSwordAttack = new ShimmerSwordAttack();
        assertTrue(shimmerSwordAttack.attack() == 16);
    }
}
