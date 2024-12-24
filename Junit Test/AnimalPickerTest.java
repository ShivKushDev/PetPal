import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalPickerTest {

    @Test
    public void testSetAnimalTaken() {
        animalPicker picker = new animalPicker(ANIMAL.CAT);

        picker.setAnimalTaken(true);
        assertTrue(picker.getanimalTaken());
    }

    @Test
    public void testGetAnimalImage() {
        animalPicker picker = new animalPicker(ANIMAL.CAT);
        assertNotNull(picker.getAnimalImage());
    }
}
