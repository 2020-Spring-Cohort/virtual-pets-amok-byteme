package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Shelter {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
 ArrayList<String> catNames = new ArrayList<>();
        catNames.add("Ben");
        catNames.add("Stuart");
        catNames.add("Noah");
        catNames.add("Ernest");
        catNames.add("Brian");

        System.out.println("Welcome to shelter. Which cat would you like to adopt? " + catNames + "?");

    Cat [] shelterCats = new Cat [5];
    shelterCats [0] = new Cat ("Ben");
        shelterCats [1] = new Cat("Stuart");
        shelterCats [2] = new Cat("Noah");
        shelterCats [3] = new Cat("Ernest");
        shelterCats [4] = new Cat("Brian");



    }

    }

