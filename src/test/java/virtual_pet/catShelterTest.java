package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class catShelterTest {

    private CatShelter underTest;
    private OrganicCat testCat;
    private RoboCat testCat2;


@BeforeEach
void setUp(){
    underTest = new CatShelter();
    testCat = new OrganicCat ("testCat",10);
    testCat2 = new RoboCat("testCat2", 10);
    underTest.addCat(testCat);
    underTest.addCat(testCat2);
}

@Test
    public void shouldAddPetToShelter() {
    underTest.addCat(testCat);
    underTest.addCat(testCat2);
    HashMap<String, Cat> answer = underTest.getCatNames();
    assertEquals(2, answer.values().size());

}

@Test
    public void shouldFeedAllCats(){
    underTest.feedAllCats();
    int hunger = testCat.hunger();
    assertEquals(8, hunger);
}

@Test
    public void shouldPlayWithAllCats(){
    underTest.playWithAllCats();
    int boredom = testCat.boredom();
    assertEquals(8, boredom);
}
    @Test
    public void shouldTakeAllCatsToVet(){
        underTest.takeAllCatsToVet();
        int health = testCat.health();
        assertEquals(15, health);
    }
    @Test
    public void shouldCleanAllLitterBoxes(){
        underTest.cleanAllLitterBoxes();
        int litterBox = testCat.litterBox();
        assertEquals(0, litterBox);
    }
    @Test
    public void shouldRepairAllRoboCats(){
    underTest.repairAllRoboCats();
    int result = testCat2.getMaintenance();
    assertEquals(12, result);
    }
    @Test
    public void shouldRechargeAllRoboCats(){
    underTest.rechargeAllRoboCats();
    int result = testCat2.batteryLife();
    assertEquals(15, result);
    }
    @Test
    public void shouldShootAllLaserBeams(){
    String result = underTest.shootAllLaserBeams();
    assertEquals("Zap!", result);
    }
    @Test
    public void shouldAdoptCat(){
    underTest.adoptCat("testCat");
    underTest.adoptCat("testCat2");
    HashMap<String, Cat> answer = underTest.getCatNames();
    assertEquals(0, answer.values().size());
    }

}
