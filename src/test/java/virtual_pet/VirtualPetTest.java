package virtual_pet;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        Cat underTest = new Cat();
    }

    @Test
    public void shouldHaveAName() {
        Cat underTest = new Cat();
    }

    @Test
    public void petShouldHaveHunger () {
        Cat underTest = new Cat();
        int result = underTest.getHunger ();
    }

}