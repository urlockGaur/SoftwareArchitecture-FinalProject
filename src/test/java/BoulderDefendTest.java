import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class contains test for the {@link BoulderDefend} class
 * The tests include scenarios where the Boulder Wall is forced to activate and where it is
 * forced not to activate, testing the corresponding behavior of the BoulderDefend class
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class BoulderDefendTest {

    private static class TestableBoulderDefend extends BoulderDefend {
        /**
         * testable version of BoulderDefend class
         * @param activateBoulderWall
         */
        public TestableBoulderDefend(boolean activateBoulderWall) {
        }

    }
    /**
     * Tests the behavior of  BoulderDefend when Boulder Wall
     * is forced to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithBoulderWall() {
        // Force activation of Boulder Wall
        BoulderDefend boulderDefend = new TestableBoulderDefend(true);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = boulderDefend.defend(currentHealth, opponentAttack);

        // Assert that the defended health is increased by 15
        assertEquals(currentHealth + 15, newHealth);
    }
    /**
     * Tests the behavior of  BoulderDefend when Boulder Wall
     * is forced not to activate.
     *@param currentHealth
     *@param opponentAttack
     */
    @Test
    public void testDefendWithoutBoulderWall() {
        // Force no activation of Boulder Wall
        BoulderDefend boulderDefend = new TestableBoulderDefend(false);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = boulderDefend.defend(currentHealth, opponentAttack);

        // Assert that the defended health is decreased by opponent's attack * 2
        assertEquals(currentHealth - (opponentAttack * 2), newHealth);
    }
}
