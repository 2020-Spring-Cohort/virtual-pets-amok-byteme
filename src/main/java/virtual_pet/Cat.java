package virtual_pet;

public class Cat {

    private int hunger;

    public Cat(String ben) {

    }

    public int hunger () {
        int hunger = 10;
        return hunger;
    }

    public String getName() {
        return "Ben";
    }

    public void feed() {
        hunger -= 2;
    }
}
