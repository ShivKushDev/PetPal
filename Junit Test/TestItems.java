import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void testFoodItemUsage() {
        FoodItem food = new FoodItem("Apple", 15.0);
        assertEquals(15.0, food.useItem());
    }

    @Test
    public void testGiftItemUsage() {
        GiftItem gift = new GiftItem("Teddy Bear", 100);
        assertEquals(100, gift.useItem());
    }
}
