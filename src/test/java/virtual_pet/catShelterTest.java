package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class catShelterTest {

    private catShelter underTest;
    private Cat testCat;


@BeforeEach
void setUp(){
    underTest = new catShelter(testCat);
    testCat = new Cat ("testCat");
    underTest.addCat(testCat);
}

@Test
    public void shouldAddPetToShelter() {
    ArrayList<Cat> retrievedCats = underTest.retrievedCatList();
    assertEquals(1 , retrievedCats.size());

}

@Test
    public void shouldFeedAllPets(){
    underTest.feedAllCats();
    ArrayList<Cat> retrievedCats = underTest.retrievedCatList();
    assertTrue(retrievedCats.get(0).getFeedStatus);
}

    private void assertTrue(Object getFeedStatus) {
    }


}
