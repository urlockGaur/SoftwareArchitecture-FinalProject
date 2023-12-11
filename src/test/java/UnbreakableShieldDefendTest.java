import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class contains test for the {@link UnbreakableShieldDefend} class
 * The tests include scenarios where the Unbreakable Shield is forced to activate and where it is
 * forced not to activate, testing the corresponding behavior of the UnbreakableShieldDefend class
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class UnbreakableShieldDefendTest {

    private static class TestableUnbreakableShieldDefend extends UnbreakableShieldDefend {
        private final boolean activateShield;
        /**
         * testable version of UnbreakableShieldDefend class
         * @param activateShield
         */
        public TestableUnbreakableShieldDefend(boolean activateShield) {
            this.activateShield = activateShield;
        }

    }
    /**
     * Tests the behavior of  UnbreakableShieldDefend when Unbreakable Shield
     * is forced  to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithActivation() {
        UnbreakableShieldDefend shieldDefend = new TestableUnbreakableShieldDefend(true);
        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = shieldDefend.defend(currentHealth, opponentAttack);

        assertEquals(currentHealth, newHealth, "Expected health to remain unchanged due to shield activation");
    }
    /**
     * Tests the behavior of  UnbreakableShieldDefend when  Unbreakable Shield
     * is forced not to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithoutActivation() {
        UnbreakableShieldDefend shieldDefend = new TestableUnbreakableShieldDefend(false);
        int currentHealth = 100;
        int opponentAttack = 20;

        int expectedHealth = currentHealth - opponentAttack + 5;
        int newHealth = shieldDefend.defend(currentHealth, opponentAttack);

        assertEquals(expectedHealth, newHealth, "Expected health to decrease by opponent's attack damage + 5");
    }
}