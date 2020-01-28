package virtual_pet;

import java.util.ArrayList;
import java.util.HashMap;

public class CatShelter {

private HashMap<String, Cat> catNames = new HashMap<>();


    public CatShelter() {

    }

    public void addCat(Cat testCat) {
        catNames.put(testCat.getName(), testCat);
    }

    public HashMap<String, Cat> getCatNames() {
        return catNames;
    }

    public void feedAllCats() {
        for (Cat catToBeFed : catNames.values()) {
            if(catToBeFed instanceof OrganicCat){
                ((OrganicCat) catToBeFed).feed();
            }
        }
    }

    public void adoptCat(Cat testCat) {
        catNames.remove(testCat);
        System.out.println(testCat + " found a new home.");
    }

    public HashMap<String, Cat> retrievedCatList() {
    return (HashMap<String, Cat>) catNames.values();
    }

}




