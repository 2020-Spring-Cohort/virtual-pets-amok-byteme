package virtual_pet;

import java.util.ArrayList;
import java.util.HashMap;

public class CatShelter {
    private static HashMap<String , Cat> catList = new HashMap<>();
    private static ArrayList<Cat> catNames = new ArrayList<>();

    public CatShelter () {

        OrganicCat orgCat1 = new OrganicCat("Ben");
        RoboCat roboCat1 = new RoboCat("Stuart");
        OrganicCat orgCat2 = new OrganicCat("Noah");
        RoboCat roboCat2 = new RoboCat("Ernest");
        OrganicCat orgCat3 = new OrganicCat("Brian");

        catNames.add(orgCat1);
        catNames.add(roboCat1);
        catNames.add(orgCat2);
        catNames.add(roboCat2);
        catNames.add(orgCat3);

    }

    public void addCat(Cat testCat) {catList.put(testCat.getName() , testCat);}

    public static ArrayList<Cat> retrievedCatList() { return catNames; }

    public void feedAllCats() {
        for (Cat catToBeFed : catList.values()) {
            catToBeFed.receiveFood();
        }
    }




    }



