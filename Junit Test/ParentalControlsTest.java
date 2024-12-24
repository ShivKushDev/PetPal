import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParentalControlsTest {

    @Test
    public void testVerifyLogin() {
        ParentalControls controls = new ParentalControls("password123", -1, 0, 0);
        assertTrue(controls.verifyLogin("password123"));
        assertFalse(controls.verifyLogin("wrongPassword"));
    }

    @Test
    public void testResetStats() {
        ParentalControls controls = new ParentalControls("password123", 60, 120, 2);
        controls.resetStats();
        assertEquals(-1, controls.getPlayTimeLimit());
        assertEquals(0, controls.getTotalPlayTime());
    }
}
