package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    public void petShouldHaveName() {
    Cat underTest = new Cat("Ben", 10);

    String result = underTest.getName();
    assertEquals("Ben", result);
    }


    @Test
    public void petShouldHaveDefaultBoredom(){
    Cat underTest = new Cat ("Ben", 10);
    int result = underTest.boredom();
    assertEquals(10, result);
    }
    @Test
    public void playShouldDecreaseBoredomBy2(){
    Cat underTest = new Cat ("Ben", 10);
    underTest.play();
    int result = underTest.boredom();
    assertEquals(8, result);
    }

@Test
    public void timeShouldEffectBoredom() {
    Cat underTest = new Cat ("Ben", 10);
    underTest.tick();
    int result = underTest.boredom();
    assertEquals(11, result);
}


}
