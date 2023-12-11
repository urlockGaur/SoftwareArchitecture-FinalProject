import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class contains test for the {@link BladeParryDefend} class
 * The tests include scenarios where the Blade Parry is forced to activate and where it is
 * forced not to activate, testing the corresponding behavior of the BladeParryDefend} class
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class BladeParryDefendTest {

    /**
     * testable version of BladeParryDefend class
     * @param activatesFuriosBladeParry
     */
    private static class TestableBladeParryDefend extends BladeParryDefend {

        public TestableBladeParryDefend(boolean activatesFuriousBladeParry) {
        }
    }

    /**
     * Tests the behavior of  BladeParryDefend when Furious Blade Parry
     * is forced to activate.
     */
    @Test
    public void testDefendWithActivation() {
        // Force activation (less than 13)
        BladeParryDefend bladeParryDefend = new TestableBladeParryDefend(true);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = bladeParryDefend.defend(currentHealth, opponentAttack);

        assertEquals(currentHealth, newHealth);
    }

    /**
     * Tests the behavior of  BladeParryDefend when Furious Blade Parry
     * is forced not to activate.
     */
    @Test
    public void testDefendWithoutActivation() {
        // Force no activation (greater than or equal to 13)
        BladeParryDefend bladeParryDefend = new TestableBladeParryDefend(false);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = bladeParryDefend.defend(currentHealth, opponentAttack);

        assertEquals((currentHealth + 2) - opponentAttack, newHealth);
    }
}