package virtual_pet;

import java.util.ArrayList;
import java.util.HashMap;

public class CatShelter {

    protected static ArrayList<Cat> catNames = new ArrayList<>();

    public CatShelter() {

    }

    public void addCat(Cat testCat) {
        catNames.add(testCat);
    }

    public static ArrayList<Cat> getCatNames() {
        return catNames;
    }

    public void feedAllCats() {
        for (Cat catToBeFed : catNames) {
            catToBeFed.receiveFood();
        }
    }
}




