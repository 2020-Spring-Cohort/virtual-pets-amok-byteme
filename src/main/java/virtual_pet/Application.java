package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
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
}

