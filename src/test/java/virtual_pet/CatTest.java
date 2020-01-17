package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
@Test
    public void shouldHaveDefaultHunger() {
    Cat underTest = new Cat("Ben");
    
    int result = underTest.hunger ();
    
    assertEquals(10, result);
}

    @Test
    public void petShouldHaveName() {
    Cat underTest = new Cat("Ben");

    String result = underTest.getName();
    assertEquals("Ben", result);

    }
    @Test
    public void feedingPetShouldDecreaseHungerBy2() {
    Cat underTest = new Cat("Ben");
    underTest.feed();
    int result = underTest.hunger();
    assertEquals( 8, result);

    }
}
