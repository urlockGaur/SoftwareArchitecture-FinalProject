import java.util.ArrayList;
import java.util.List;

public class CharacterFactory {
    private static UI ui = new UI();

    public static List<Character> createCharacters() {
        List<Character> characters = new ArrayList<>();

        //Creating 8 characters, with diff stats to select from

        characters.add(new Character(CharacterName.FREEZE, new FrostPunchAttack(), new IceWallDefend()));
        characters.add(new Character(CharacterName.VULKANO, new FireBreathAttack(), new BoulderDefend()));
        characters.add(new Character(CharacterName.STRYKER,  new OneInchPunchAttack(), new PoorlyTrainedDefend()));
        characters.add(new Character(CharacterName.CYRPTARQ, new EnergyBlastAttack(), new BlastShieldDefend()));
        characters.add(new Character(CharacterName.ROGAL, new EmperorsBladeAttack(), new UnbreakableShieldDefend()));
        characters.add(new Character(CharacterName.TANITH, new HiddenBladeAttack(), new CamoCloakDefend()));
        characters.add(new Character(CharacterName.QUAKE, new ThunderousKickAttack(), new SeismicBlockDefend()));
        characters.add(new Character(CharacterName.VEE, new ShimmerSwordAttack(), new BladeParryDefend()));

        return characters;
    }

    public static int getInitialHealth(CharacterName characterName) {
        // Logic to determine and return the initial health based on the character type
        // For example:
        switch (characterName) {
            case FREEZE:
                return 100;
            case VULKANO:
                return 110;
            case STRYKER:
                return 85;
            case CYRPTARQ:
                return 95;
            case ROGAL:
                return 100;
            case TANITH:
                return 90;
            case QUAKE:
                return 100;
            case VEE:
                return 100;
            default:
                return 100; // Default initial health
        }
    }
}