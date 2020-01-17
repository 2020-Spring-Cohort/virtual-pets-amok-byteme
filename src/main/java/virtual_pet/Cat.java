package virtual_pet;

import java.util.Scanner;

public class Cat {

   // static Scanner input = Scanner(System.in);

    String organicRobotic;
    String sex;
    String color;
    String health;
    String boredom;
    String litterBox;
    String name;

public Cat (String organicRoboticType, String sexType, String colorType, String healthType, String boredomType, String litterBoxType, String nameType) {
    this.organicRobotic = organicRoboticType;
    this.sex = sexType;
    this.color = colorType;
    this.health = healthType;
    this.boredom = boredomType;
    this.litterBox = litterBoxType;
    this.name = nameType;
}

public String getColor () {
    return color
}


//public void name () {
//    System.out.println("Give your new pet a name!");
//    String nameCat = input.nextLine();
//}


}
