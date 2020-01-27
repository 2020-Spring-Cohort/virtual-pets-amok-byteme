package virtual_pet;

public class OrganicCat extends Cat{
    private int hunger;
    private int health;
    private int litterBox;
    public OrganicCat (String name, int boredom) {
        super(name, boredom);

        this.hunger = 10;
        this.health = 10;
        this.litterBox = 10;

    }
    public int hunger() {return hunger;}
    public int health() {return health;}
    public int litterBox() {return litterBox;}
    public void feed() {
        hunger -= 2;
    }
    public void vetVisit(){
        health += 5;
    }
    public void cleanLitterBox(){
        litterBox -= 10;
    }

    public void receiveFood() {
    }

    @Override
    public String toString() {
        return "name= " + name +
                ", hunger= " + hunger +
                ", boredom= " + boredom +
                ", health= " + health +
                ", litterBox= " + litterBox;
    }


    public void tick() {
        this.hunger++;
        this.health--;
        this.litterBox++;
    }

}
