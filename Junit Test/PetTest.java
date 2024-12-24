import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PetTest {

    @Test
    public void testFeedPet() {
        Pet pet = new Pet("Buddy");
        FoodItem food = new FoodItem("Apple", 0.5);

        pet.feed(food);
        assertTrue(pet.getHunger() > 50);
    }

    @Test
    public void testPlayWithPet() {
        Pet pet = new Pet("Buddy");

        pet.playWithPet();
        assertTrue(pet.getHappiness() > 50);
    }

    @Test
    public void testSleep() {
        Pet pet = new Pet("Buddy");
        pet.setSleep(50);

        pet.sleep();
        assertEquals(100, pet.getSleep());
    }
}
