package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to the cat shelter! Would you like to see our cats? (Y/N)");
        Scanner input = new Scanner(System.in);
        String userInput1 = input.nextLine();
        if (userInput1.equals("Y")) {
            System.out.println("We house organic and robotic cats. Which would you like to see? [O/R]");
            String userInput2 = input.nextLine();
            if (userInput2.equals("O")) {
                System.out.println("Here is a list of our organic cats:");
                OrganicCat orgCat1 = new OrganicCat("Ben", 10);
                OrganicCat orgCat2 = new OrganicCat("Noah", 10);
                OrganicCat orgCat3 = new OrganicCat("Brian", 10);
                CatShelter orgShelter = new CatShelter();
                orgShelter.addCat(orgCat1);
                orgShelter.addCat(orgCat2);
                orgShelter.addCat(orgCat3);


                for (int i = 0; i < orgShelter.getCatNames().size(); i++) {
                    Cat someCatFromTheList = orgShelter.getCatNames().get(i);
                    System.out.println(someCatFromTheList);
                }
                System.out.println("Which cat would you like to adopt?");
                String userInputAdopt = input.nextLine();

                orgShelter.adoptCat(userInputAdopt);
                CatShelter adoptedCats = new CatShelter();
                System.out.println("Here is a list of cats you've adopted:");
                for(Cat c: adoptedCats.getAdoptedCats()){
                    System.out.println(c);
                }


            } else if (userInput2.equals("R")) {
                System.out.println("Here is a list of our robotic cats:");
                RoboCat roboCat1 = new RoboCat("Stuart", 10);
                RoboCat roboCat2 = new RoboCat("Ernest", 10);
                CatShelter roboShelter = new CatShelter();
                roboShelter.addCat(roboCat1);
                roboShelter.addCat(roboCat2);

                for (int i = 0; i < roboShelter.getCatNames().size(); i++) {
                    Cat someCatFromTheList = roboShelter.getCatNames().get(i);
                    System.out.println(someCatFromTheList);
                }

            } else {
                System.out.println("Ok. Goodbye.");
            }
        }
    }
}


