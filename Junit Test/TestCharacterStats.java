import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterStatsTest {

    @Test
    public void testCharacterStatsInitialization() {
        CharacterStats stats = new CharacterStats("Hero", 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140);
        assertEquals("Hero", stats.getValue1());
        assertEquals(10, stats.getValue2());
        assertEquals(20, stats.getValue3());
    }

    @Test
    public void testSetters() {
        CharacterStats stats = new CharacterStats("Hero", 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140);
        stats.setValue1("Villain");
        stats.setValue2(999);
        assertEquals("Villain", stats.getValue1());
        assertEquals(999, stats.getValue2());
    }
}
