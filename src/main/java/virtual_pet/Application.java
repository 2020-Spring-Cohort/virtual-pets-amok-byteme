package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("test");
        CatShelter shelterList = new CatShelter();
        for (Cat kitty: shelterList.retrievedCatList()){
            System.out.println(kitty);
        }




}
}

