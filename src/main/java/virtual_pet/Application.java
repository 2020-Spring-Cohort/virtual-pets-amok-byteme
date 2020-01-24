package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("test");

        OrganicCat orgCat1 = new OrganicCat("Ben");
        RoboCat roboCat1 = new RoboCat("Stuart");
        OrganicCat orgCat2 = new OrganicCat("Noah");
        RoboCat roboCat2 = new RoboCat("Ernest");
        OrganicCat orgCat3 = new OrganicCat("Brian");
        CatShelter shelter = new CatShelter();
        shelter.addCat(orgCat1);
        shelter.addCat(roboCat1);
        shelter.addCat(orgCat2);
        shelter.addCat(roboCat2);
        shelter.addCat(orgCat3);



        CatShelter shelterList = new CatShelter();
        for (Cat kitty: shelterList.retrievedCatList()){
            System.out.println(kitty);
        }






}
}

