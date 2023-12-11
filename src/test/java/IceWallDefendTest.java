import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IceWallDefendTest {

    /**
     * This class contains test for the IceWallDefend class
     * The tests include scenarios where the Spiked Ice Wall is forced to activate and where it is
     * forced not to activate, testing the corresponding behavior of the IceWallDefend class
     *
     * @author Anthony Framke
     * @version 1.0
     * @since 12/10/2023
     */
    private static class TestableIceWallDefend extends IceWallDefend {
        private final boolean activateSpikedIceWall;
        /**
         * testable version of IceWallDefend class
         * @param activateSpikedIceWall
         */
        public TestableIceWallDefend(boolean activateSpikedIceWall) {
            this.activateSpikedIceWall = activateSpikedIceWall;
        }
    }
    /**
     * Tests the behavior of  IceWallDefend when Spiked Ice Wall
     * is forced to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithSpikedIceWall() {
        // Force activation of Spiked Ice Wall
        IceWallDefend iceWallDefend = new TestableIceWallDefend(true);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = iceWallDefend.defend(currentHealth, opponentAttack);

        // Assert that the defended health is calculated correctly
        assertEquals((currentHealth + 2) - opponentAttack, newHealth);
    }
    /**
     * Tests the behavior of  IceWallDefend when Spiked Ice Wall
     * is forced not to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithoutSpikedIceWall() {
        // Force no activation of Spiked Ice Wall
        IceWallDefend iceWallDefend = new TestableIceWallDefend(false);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = iceWallDefend.defend(currentHealth, opponentAttack);

        // Assert that the defended health is calculated correctly
        assertEquals(currentHealth - opponentAttack, newHealth);
    }
}
