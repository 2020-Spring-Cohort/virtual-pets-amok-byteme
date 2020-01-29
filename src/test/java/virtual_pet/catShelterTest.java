package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class catShelterTest {

    private CatShelter underTest;
    private OrganicCat testCat;


@BeforeEach
void setUp(){
    underTest = new CatShelter();
    testCat = new OrganicCat ("testCat",10);
    underTest.addCat(testCat);
}

@Test
    public void shouldAddPetToShelter() {
    underTest.addCat(testCat);
    HashMap<String, Cat> answer = underTest.getCatNames();
    assertEquals(answer.values().size(), 1);



//    HashMap<String, Cat> cat = underTest.addCat(Cat, testCat.getName());
//    assertEquals(1 , retrievedCats.size());

}

@Test
    public void shouldFeedAllCats(){
    underTest.feedAllCats();
    int hunger = testCat.getHunger();
    assertEquals(8, hunger);
}

//@Test
//public void shouldAdoptCat(){
//   underTest.adoptCat(testCat);
//   HashMap<String, Cat> retrievedCatList = underTest.retrievedCatList();
//   assertTrue(retrievedCatList.remove(testCat));

//    @Test
//    public void shouldAdoptCat() {
//        underTest.adoptCat(testCat);
//        HashMap<String, Cat> answer = underTest.getCatNames();
//        assertEquals(answer.values().size(), 1);
//    }
//    private void assertTrue(Object getFeedStatus) {
//    }


}
