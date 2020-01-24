package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest {
    @Test
    public void shouldHaveDefaultHunger() {
        OrganicCat underTest = new OrganicCat("Ben");
        int result = underTest.hunger();
        assertEquals(10, result);
    }
    @Test
    public void feedingPetShouldDecreaseHungerBy2() {
        OrganicCat underTest = new OrganicCat("Ben");
        underTest.feed();
        int result = underTest.hunger();
        assertEquals( 8, result);
    }
    @Test
    public void petShouldHaveDefaultHealth(){
        OrganicCat underTest = new OrganicCat("Ben");
        int result = underTest.health();
        assertEquals(10, result);
    }
    @Test
    public void vetVisitShouldIncreaseHealthBy5(){
        OrganicCat underTest = new OrganicCat ("Ben");
        underTest.vetVisit();
        int result = underTest.health();
        assertEquals(15, result);
    }
    @Test
    public void petShouldHaveDefaultLitterBox(){
        OrganicCat underTest = new OrganicCat ("Ben");
        int result = underTest.litterBox();
        assertEquals(10, result);
    }
    @Test
    public void cleanLitterBoxShouldDecreaseLitterBoxBy10(){
        OrganicCat underTest = new OrganicCat ("Ben");
        underTest.cleanLitterBox();
        int result = underTest.litterBox();
        assertEquals(0, result);
    }
    @Test
    public void timeShouldEffectHunger() {
        OrganicCat underTest = new OrganicCat ("Ben");
        underTest.tick();
        int result = underTest.hunger();
        assertEquals(11, result);
    }
    @Test
    public void timeShouldEffectLitterBox () {
        OrganicCat underTest = new OrganicCat ("Ben");
        underTest.tick();
        int result = underTest.litterBox();
        assertEquals(11, result);
    }
    @Test
    public void timeShouldEffectHealth() {
        OrganicCat underTest = new OrganicCat ("Ben");
        underTest.tick();
        int result = underTest.health();
        assertEquals(9, result);
    }
}

