import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BlueSubSceneBoxTest {

    @Test
    public void testMoveSubScene() {
        BlueSubSceneBox subScene = new BlueSubSceneBox();

        subScene.moveSubScene();
        assertFalse(subScene.getPane().isVisible());

        subScene.moveSubScene();
        assertTrue(subScene.getPane().isVisible());
    }
}
