import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class contains test for the {@link SeismicBlockDefend} class
 * The tests include scenarios where the Seismic Block enhance is forced to activate and where it is
 * forced not to activate, testing the corresponding behavior of the SeismicBlockDefend class
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class SeismicBlockDefendTest {

    private static class TestableSeismicBlockDefend extends SeismicBlockDefend {
        /**
         * testable version of SeismicBlockDefend class
         * @param activateSeismicBlock
         */
        public TestableSeismicBlockDefend(boolean activateSeismicBlock) {
        }
    }
    /**
     * Tests the behavior of  SeismicBlockDefend when Seismic Block enhance
     * is forced to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithActivation() {
        // Force activation (less than 24)
        SeismicBlockDefend seismicBlockDefend = new TestableSeismicBlockDefend(true);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = seismicBlockDefend.defend(currentHealth, opponentAttack);

        assertEquals((currentHealth + 3) - opponentAttack, newHealth);
    }
    /**
     * Tests the behavior of  SeismicBlockDefend when Seismic Block enhance
     * is forced not to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithoutActivation() {
        // Force no activation (greater than or equal to 24)
        SeismicBlockDefend seismicBlockDefend = new TestableSeismicBlockDefend(false);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = seismicBlockDefend.defend(currentHealth, opponentAttack);

        assertEquals(currentHealth - opponentAttack, newHealth);
    }
}