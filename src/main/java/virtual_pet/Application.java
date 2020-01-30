package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int x = 1;
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

            printCatStatus(shelter);
            while (x == 1) {
                System.out.println("Would you like to interact with all cats or a single cat?[A/S]");
                String userInput2 = input.nextLine();
                if (userInput2.equals("A")) {
                    System.out.println("What action would you like to take?");
                    System.out.println("[play with all cats, feed all cats, take cats to vet, clean litter boxes, repair all robotic cats, recharge all robotic cats, shoot all laser beams]");
                    String userInputAction = input.nextLine();
                    if (userInputAction.equals("feed all cats")) {
                        shelter.feedAllCats();
                        printCatStatus(shelter);
                    } else if (userInputAction.equals("play with all cats")) {
                        shelter.playWithAllCats();
                        printCatStatus(shelter);
                    } else if (userInputAction.equals("take cats to vet")) {
                        shelter.takeAllCatsToVet();
                        printCatStatus(shelter);
                    } else if (userInputAction.equals("clean litter boxes")) {
                        shelter.cleanAllLitterBoxes();
                        printCatStatus(shelter);
                    } else if (userInputAction.equals("repair all robotic cats")) {
                        shelter.repairAllRoboCats();
                        printCatStatus(shelter);
                    } else if (userInputAction.equals("recharge all robotic cats")) {
                        shelter.rechargeAllRoboCats();
                        printCatStatus(shelter);
                    } else if (userInputAction.equals("shoot all laser beams")) {
                        shelter.shootAllLaserBeams();
                    }
                    tickAllCats(shelter);
                }

                else if (userInput2.equals("S")) {
                    System.out.println("Which cat would you like to interact with?");
                    String userInputCat = input.nextLine();
                     interactOneCat(userInputCat, shelter);
                    }else if(userInput2.equals("exit")){ System.out.println("Thanks for visiting. Please come back!"); break; }
                }
            } else{
                System.out.println("Ok. Goodbye.");
            }
        }

    private static void interactOneCat(String userInputCat, CatShelter shelter) {
        Scanner input = new Scanner(System.in);
        Cat aCat = shelter.getCatNames().get(userInputCat);
        if (aCat instanceof OrganicCat) {
            System.out.println("What action would you like to take? [play, feed, take cat to vet, clean litter box, adopt this cat]");
            String userInputAction = input.nextLine();
            if (userInputAction.equals("feed")) {
                ((OrganicCat) aCat).feed();
                System.out.println(aCat);
            } else if (userInputAction.equals("play")) {
                aCat.play();
                System.out.println(aCat);
            } else if (userInputAction.equals("take cat to vet")) {
                ((OrganicCat) aCat).vetVisit();
                System.out.println(aCat);
            } else if (userInputAction.equals("clean litter box")) {
                ((OrganicCat) aCat).cleanLitterBox();
                System.out.println(aCat);
            } else if (userInputAction.equals("adopt this cat")) {
                shelter.adoptCat(userInputCat);
                System.out.println("Congratulations on adopting your cat. Here is a list of cats still in the shelter:");
                printCatStatus(shelter);
            }
            tickAllCats(shelter);
        } else {

            System.out.println("What action would you like to take? [play, repair, recharge, laser beam, adopt this cat]");
            String userInputAction = input.nextLine();
            if (userInputAction.equals("play")) {
                aCat.play();
                System.out.println(aCat);
            } else if (userInputAction.equals("repair")) {
                ((RoboCat) aCat).repair();
                System.out.println(aCat);
            } else if (userInputAction.equals("recharge")) {
                ((RoboCat) aCat).recharge();
                System.out.println(aCat);
            } else if (userInputAction.equals("laser beam")) {
                ((RoboCat) aCat).laserBeam();
            } else if (userInputAction.equals("adopt this cat")) {
                shelter.adoptCat(userInputCat);
                System.out.println("Congratulations on adopting your cat. Here is a list of cats still in the shelter:");
                printCatStatus(shelter);
                tickAllCats(shelter);
            }

        }
    }







    private static void tickAllCats(CatShelter shelter) {
        for (String name : shelter.getCatNames().keySet()) {
            Cat someCatFromTheList = shelter.getCatNames().get(name);
            someCatFromTheList.tick();
        }
    }

    private static void printCatStatus(CatShelter shelter) {
        for (String name : shelter.getCatNames().keySet()) {
            Cat someCatFromTheList = shelter.getCatNames().get(name);
            System.out.println(someCatFromTheList);
        }
    }
}



