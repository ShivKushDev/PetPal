import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodsTest {

    @Test
    public void testIncrementAmount() {
        FOODS apple = FOODS.APPLE;
        apple.setAmount(0);
        apple.incrementAmount();

        assertEquals(1, apple.getAmount());
    }

    @Test
    public void testDecrementAmount() {
        FOODS apple = FOODS.APPLE;
        apple.setAmount(1);
        apple.decrementAmount();

        assertEquals(0, apple.getAmount());
    }

    @Test
    public void testGetURL() {
        assertEquals("view/resources/Food/apple.png", FOODS.APPLE.getURL());
    }
}
