import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class MainMenuViewManagerTest {

    private MainMenuViewManager mainMenu;

    @BeforeEach
    public void setUp() {
        mainMenu = new MainMenuViewManager();
    }

    @Test
    public void testMainMenuInitialization() {
        assertNotNull(mainMenu);
    }

    @Test
    public void testMainPaneIsNotNull() {
        assertNotNull(mainMenu.getMainPane());
    }

    @Test
    public void testMainSceneInitialization() {
        Scene scene = mainMenu.getMainScene();
        assertNotNull(scene);
        assertEquals(1024, scene.getWidth());
        assertEquals(768, scene.getHeight());
    }

    @Test
    public void testShowSubSceneToggle() {
        BlueSubSceneBox subScene = new BlueSubSceneBox();
        mainMenu.showSubScene(subScene);

        // Simulate showing the subscene
        assertNotNull(subScene);
        assertEquals(subScene, mainMenu.getCurrentSubScene());

        // Toggle it off
        mainMenu.showSubScene(subScene);
        assertNull(mainMenu.getCurrentSubScene());
    }

    @Test
    public void testCreatePet() {
        mainMenu.createPet(ANIMAL.CAT);
        Pet pet = mainMenu.getChosenPet();
        assertNotNull(pet);
        assertEquals("CAT", pet.getName());
    }

    @Test
    public void testSettingsPasswordValidation() {
        String defaultPassword = "password";
        TextField passwordInput = new TextField(defaultPassword);

        assertTrue(mainMenu.validatePassword(passwordInput.getText()));
        passwordInput.setText("wrongPassword");
        assertFalse(mainMenu.validatePassword(passwordInput.getText()));
    }


    @Test
    public void testTutorialSubScene() {
        mainMenu.createTutorialSubScene();
        assertNotNull(mainMenu.getTutorialSubScene());
    }
}
