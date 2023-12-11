import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class contains test for the {@link CamoCloakDefend} class
 * The tests include scenarios where the Camo Cloak is forced to activate and where it is
 * forced not to activate, testing the corresponding behavior of the CamoCloakDefend class
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class CamoCloakDefendTest {

    private static class TestableCamoCloakDefend extends CamoCloakDefend {
        /**
         * testable version of CamoCloakDefend class
         * @param activateCamoCloak
         */
        public TestableCamoCloakDefend(boolean activateCamoCloak) {
        }
    }
    /**
     * Tests the behavior of  CamoCloakDefend when Camo Cloak
     * is forced to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithCamoCloak() {
        // Force activation of Camo Cloak
        CamoCloakDefend camoCloakDefend = new TestableCamoCloakDefend(true);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = camoCloakDefend.defend(currentHealth, opponentAttack);

        // Assert that the defended health is unchanged
        assertEquals(currentHealth, newHealth);
    }
    /**
     * Tests the behavior of  CamoCloakDefend when Camo Cloak
     * is forced not to activate.
     * @param currentHealth
     * @param opponentAttack
     */
    @Test
    public void testDefendWithoutCamoCloak() {
        // Force no activation of Camo Cloak
        CamoCloakDefend camoCloakDefend = new TestableCamoCloakDefend(false);

        int currentHealth = 100;
        int opponentAttack = 20;

        int newHealth = camoCloakDefend.defend(currentHealth, opponentAttack);

        // Assert that the defended health is decreased by opponent's attack
        assertEquals(currentHealth - opponentAttack, newHealth);
    }
}
