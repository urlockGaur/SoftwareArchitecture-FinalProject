import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * This class contains test for the {@link PoorlyTrainedDefend} class
 * The tests include scenarios where the Quick Parry is forced to activate and where it is
 * forced not to activate, testing the corresponding behavior of the PoorlyTrainedDefend class
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class PoorlyTrainedDefendTest {

    private static class TestablePoorlyTrainedDefend extends PoorlyTrainedDefend {
        /**
         * testable version of PoorlyTrainedDefend class
         * @param quickParry
         */
        public TestablePoorlyTrainedDefend(boolean quickParry) {
        }
    }
    /**
     * Tests the behavior of  PoorlyTrainedDefend when quickParry
     * is forced to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithQuickParry() {
        // Force quick parry (less than 7)
        PoorlyTrainedDefend poorlyTrainedDefend = new TestablePoorlyTrainedDefend(true);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = poorlyTrainedDefend.defend(currentHealth, opponentAttack);

        assertEquals(currentHealth + 20, newHealth);
    }
    /**
     * Tests the behavior of  PoorlyTrainedDefend when quickParry
     * is forced not to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithoutQuickParry() {
        // Force no quick parry (greater than or equal to 7)
        PoorlyTrainedDefend poorlyTrainedDefend = new TestablePoorlyTrainedDefend(false);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = poorlyTrainedDefend.defend(currentHealth, opponentAttack);

        assertEquals((currentHealth - opponentAttack) / 2, newHealth);
    }
}
