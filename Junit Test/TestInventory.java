import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class InventoryTest {

    @Test
    public void testAddFoodItem() {
        Inventory inventory = new Inventory();
        FoodItem food = new FoodItem("Apple", 10.0);

        inventory.addFoodItem(food);
        assertTrue(inventory.getFoodItems().contains(food));
    }

    @Test
    public void testRemoveFoodItem() {
        Inventory inventory = new Inventory();
        FoodItem food = new FoodItem("Apple", 10.0);

        inventory.addFoodItem(food);
        inventory.useFoodItem(food);
        assertFalse(inventory.getFoodItems().contains(food));
    }
}
