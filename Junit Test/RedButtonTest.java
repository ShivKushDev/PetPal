import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RedButtonTest {

    @Test
    public void testButtonText() {
        RedButton button = new RedButton("Click Me");
        assertEquals("Click Me", button.getText());
    }
}
