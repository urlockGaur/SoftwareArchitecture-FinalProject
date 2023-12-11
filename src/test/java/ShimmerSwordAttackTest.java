import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShimmerSwordAttackTest {


    @Test
    public void testAttackDmg() {
        ShimmerSwordAttack shimmerSwordAttack = new ShimmerSwordAttack();
        assertEquals(16, shimmerSwordAttack.attackDmg());
    }

    @Test
    public void testAttackWithCausesDeepWound() {
        ShimmerSwordAttack shimmerSwordAttack = new ShimmerSwordAttack();
        assertTrue(shimmerSwordAttack.attack() >= 48);
    }

    @Test
    public void testAttackWithoutCausesDeepWound() {
        ShimmerSwordAttack shimmerSwordAttack = new ShimmerSwordAttack();
        assertEquals(16, shimmerSwordAttack.attack());
    }
}
