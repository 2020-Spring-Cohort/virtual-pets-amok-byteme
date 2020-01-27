package virtual_pet;

import java.util.ArrayList;

public class CatShelter {

    protected static ArrayList<Cat> catNames = new ArrayList<>();
    protected static ArrayList<Cat> adoptedCats = new ArrayList<>();

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
        public ArrayList<Cat> getAdoptedCats(){
        return adoptedCats;
        }
    public void adoptCat(Cat testCat) {
       catNames.remove(testCat);
       adoptedCats.add(testCat);
    }

    public ArrayList<Cat> retrievedCatList() {
    return catNames;
    }

}




