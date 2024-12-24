import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodPickerTest {

    @Test
    public void testGetFood() {
        FOODS apple = FOODS.APPLE;
        foodPicker picker = new foodPicker(apple);

        assertEquals(apple, picker.getFood());
    }

    @Test
    public void testSetFoodSelected() {
        FOODS apple = FOODS.APPLE;
        foodPicker picker = new foodPicker(apple);

        picker.setFoodSelected(true);
        assertTrue(picker.getFoodSelected());
    }

    @Test
    public void testUpdateAmount() {
        FOODS apple = FOODS.APPLE;
        apple.setAmount(5);

        foodPicker picker = new foodPicker(apple);
        picker.updateAmount();

        assertEquals("5", picker.getFood().getAmount() + "");
    }
}
