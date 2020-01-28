package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to the cat shelter! We house organic and robotic cats. Would you like to see our cats? (Y/N)");
        Scanner input = new Scanner(System.in);
        String userInput1 = input.nextLine();
        if (userInput1.equals("Y")) {
                System.out.println("Here is a list of our cats:");
                OrganicCat orgCat1 = new OrganicCat("Ben", 10);
                OrganicCat orgCat2 = new OrganicCat("Noah", 10);
                OrganicCat orgCat3 = new OrganicCat("Brian", 10);
                RoboCat roboCat1 = new RoboCat("Stuart", 10);
                RoboCat roboCat2 = new RoboCat("Ernest", 10);

                CatShelter shelter = new CatShelter();
                shelter.addCat(orgCat1);
                shelter.addCat(orgCat2);
                shelter.addCat(orgCat3);
                shelter.addCat(roboCat1);
                shelter.addCat(roboCat2);

                for (int i = 0; i < shelter.getCatNames().size(); i++) {
                    Cat someCatFromTheList = shelter.getCatNames().get(i);
                    System.out.println(someCatFromTheList);
                }
//                System.out.println("Which cat would you like to adopt?");
//                String userInputAdopt = input.nextLine();
//
//                shelter.adoptCat(userInputAdopt);
//                CatShelter adoptedCats = new CatShelter();
//                System.out.println("Here is a list of cats you've adopted:");
//                for(Cat c: adoptedCats.getAdoptedCats()){
//                    System.out.println(c);
//                }
            }else {
            System.out.println("Ok. Goodbye.");
                }

            }
}



