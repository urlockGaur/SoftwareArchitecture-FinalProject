import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class contains test for the {@link BlastShieldDefend} class
 * The tests include scenarios where the Blast Shield is forced to activate and where it is
 * forced not to activate, testing the corresponding behavior of the BlastShieldDefend class
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class BlastShieldDefendTest {

    private static class TestableBlastShieldDefend extends BlastShieldDefend {
        /**
         * testable version of BladeParryDefend class
         * @param activateBlastShield
         */
        public TestableBlastShieldDefend(boolean activateBlastShield) {
        }
    }

    /**
     * Tests the behavior of  BlastShieldDefend when Blast Shield
     * is forced to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithActivation() {
        // Force activation (less than 33)
        BlastShieldDefend blastShieldDefend = new TestableBlastShieldDefend(true);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = blastShieldDefend.defend(currentHealth, opponentAttack);

        assertEquals((currentHealth + 10) - opponentAttack, newHealth);
    }

    /**
     * Tests the behavior of  BlastShieldDefend when Blast Shield
     * is forced not to activate.
     * @param currentHealth
     * @param opponentAttack
     */

    @Test
    public void testDefendWithoutActivation() {
        // Force no activation (greater than or equal to 33)
        BlastShieldDefend blastShieldDefend = new TestableBlastShieldDefend(false);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = blastShieldDefend.defend(currentHealth, opponentAttack);

        assertEquals(currentHealth - opponentAttack, newHealth);
    }
}
