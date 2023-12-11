import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 * This class contains test cases for the {@link EnergyBlastAttack} class.
 *
 * The tests include scenarios for checking the damage, critical attack, and non-critical attack
 * behavior of the {@code EnergyBlastAttack} class.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class EnergyBlastAttackTest {
    /**
     * Tests the {@link EnergyBlastAttack#attackDmg()} method to ensure it returns the expected damage.
     */
    @Test
    public void testAttackDmg() {
        EnergyBlastAttack energyBlastAttack = new EnergyBlastAttack();
        assertEquals(18, energyBlastAttack.attackDmg());
    }
    /**
     * Tests the {@link EnergyBlastAttack#attack()} method when an attack is expected to be critical.
     */
    @Test
    public void testAttackWithIsCritical() {
        EnergyBlastAttack energyBlastAttack = new EnergyBlastAttack();
        assertTrue(energyBlastAttack.attack() >= 28);
    }
    /**
     * Tests the {@link EnergyBlastAttack#attack()} method when an attack is not expected to be critical.
     */
    @Test
    public void testAttackWithoutIsCritical() {
        EnergyBlastAttack energyBlastAttack = new EnergyBlastAttack();
        assertEquals(18, energyBlastAttack.attack());
    }
}
