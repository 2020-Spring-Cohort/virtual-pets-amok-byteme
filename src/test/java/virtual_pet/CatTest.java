package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
@Test
    public void shouldHaveDefaultHunger() {
    OrganicCat underTest = new OrganicCat("Ben");
    
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
    @Test
    public void petShouldHaveDefaultHealth(){
    Cat underTest = new Cat("Ben");
    int result = underTest.health();
    assertEquals(10, result);
    }
    @Test
    public void vetVisitShouldIncreaseHealthBy5(){
    Cat underTest = new Cat ("Ben");
    underTest.vetVisit();
    int result = underTest.health();
    assertEquals(15, result);
    }
    @Test
    public void petShouldHaveDefaultBoredom(){
    Cat underTest = new Cat ("Ben");
    int result = underTest.boredom();
    assertEquals(10, result);
    }
    @Test
    public void playShouldDecreaseBoredomBy2(){
    Cat underTest = new Cat ("Ben");
    underTest.play();
    int result = underTest.boredom();
    assertEquals(8, result);
    }
    @Test
    public void petShouldHaveDefaultLitterBox(){
    Cat underTest = new Cat ("Ben");
    int result = underTest.litterBox();
    assertEquals(10, result);
    }
    @Test
    public void cleanLitterBoxShouldDecreaseLitterBoxBy10(){
    Cat underTest = new Cat ("Ben");
    underTest.cleanLitterBox();
    int result = underTest.litterBox();
    assertEquals(0, result);
}
@Test
    public void timeShouldEffectHunger() {
    Cat underTest = new Cat ("Ben");
    underTest.tick();
    int result = underTest.hunger();
    assertEquals(11, result);
}
@Test
    public void timeShouldEffectBoredom() {
    Cat underTest = new Cat ("Ben");
    underTest.tick();
    int result = underTest.boredom();
    assertEquals(11, result);
}
@Test
    public void timeShouldEffectHealth() {
    Cat underTest = new Cat ("Ben");
    underTest.tick();
    int result = underTest.health();
    assertEquals(9, result);
}
@Test
    public void timeShouldEffectLitterBox () {
    Cat underTest = new Cat ("Ben");
    underTest.tick();
    int result = underTest.litterBox();
    assertEquals(11, result);
}
}
