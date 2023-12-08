import java.util.ArrayList;
import java.util.List;

public class CharacterFactory {
    private static UI ui = new UI();

    public static List<Character> createCharacters() {
        List<Character> characters = new ArrayList<>();

        //Creating 8 characters, with diff stats to select from

        characters.add(new Character("Freeze",100, new FrostPunchAttack(), new IceWallDefend()));
        characters.add(new Character("Vulkano", 110, new FireBreathAttack(), new BoulderDefend()));
        characters.add(new Character("Stryker", 85, new OneInchPunchAttack(), new PoorlyTrainedDefend()));
        characters.add(new Character("Cyrptarq",95 , new EnergyBlastAttack(), new BlastShieldDefend()));
        characters.add(new Character("Rogal", 100, new EmperorsBladeAttack(), new UnbreakableShieldDefend()));
        characters.add(new Character("Tanith", 90, new HiddenBladeAttack(), new CamoCloakDefend()));
        characters.add(new Character("Quake", 100, new ThunderousKickAttack(), new SeismicBlockDefend()));
        characters.add(new Character("Vee", 100, new ShimmerSwordAttack(), new BladeParryDefend()));

        return characters;
    }
}