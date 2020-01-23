package virtual_pet;

import java.util.ArrayList;
import java.util.HashMap;

public class catShelter {
    private static HashMap<String , Cat> catList = new HashMap<>();
    private Cat testCat;

    public catShelter(Cat testCat) {
        this.testCat = testCat;
        ArrayList<Cat> catNames = new ArrayList<>();

        Cat cat1 = new Cat("Ben");
        Cat cat2 = new Cat("Stuart");
        Cat cat3 = new Cat("Noah");
        Cat cat4 = new Cat("Ernest");
        Cat cat5 = new Cat("Brian");

        catNames.add(cat1);
        catNames.add(cat2);
        catNames.add(cat3);
        catNames.add(cat4);
        catNames.add(cat5);

        System.out.println(catNames);

    }

    public void addCat(Cat testCat) {catList.put(testCat.getName() , testCat);}

    public static ArrayList<Cat> retrievedCatList() { return new ArrayList<>(catList.values()); }

    public void feedAllCats() {
        for (Cat catToBeFed : catList.values()) {
            catToBeFed.receiveFood();
        }
    }




    }



