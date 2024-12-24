import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javafx.stage.Stage;

public class GameViewManagerTest {

    @Test
    public void testCreateNewGame() {
        GameViewManager manager = new GameViewManager();
        Stage stage = new Stage();
        manager.createNewGame(stage, ANIMAL.CAT, new Pet("Fluffy"), 50, 30);

        assertNotNull(manager);
    }
}
