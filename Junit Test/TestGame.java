import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {

    @Test
    public void testAddAndUseFoodItem() {
        Inventory inventory = new Inventory();
        FoodItem food = new FoodItem("Apple", 10.0);

        inventory.addFoodItem(food);
        assertTrue(inventory.getFoodItems().contains(food));

        inventory.useFoodItem(food);
        assertFalse(inventory.getFoodItems().contains(food));
    }

    @Test
    public void testAddAndUseGiftItem() {
        Inventory inventory = new Inventory();
        GiftItem gift = new GiftItem("Teddy Bear", 50);

        inventory.addGiftItem(gift);
        assertTrue(inventory.getGiftItems().contains(gift));

        inventory.useGiftItem(gift);
        assertFalse(inventory.getGiftItems().contains(gift));
    }
}
