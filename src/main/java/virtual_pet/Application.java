package virtual_pet;

import java.util.Scanner;

public class Application {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the cat shelter! Choose your cat!");
        System.out.println("Name your cat");
        String name = input.nextLine();
    }
}

