import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThunderousKickAttackTest {

    @Test
    public void testAttackDmg() {
        ThunderousKickAttack thunderousKick = new ThunderousKickAttack();
        assertEquals(19, thunderousKick.attackDmg());
    }

    @Test
    public void testAttackWithShockwave() {
        ThunderousKickAttack thunderousKick = new ThunderousKickAttack();
        assertTrue(thunderousKick.attack() > 19);
    }

    @Test
    public void testAttackWithoutShockwave() {
        ThunderousKickAttack thunderousKick = new ThunderousKickAttack();
        assertTrue(thunderousKick.attack() == 19);
    }
}

