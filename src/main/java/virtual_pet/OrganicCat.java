package virtual_pet;

public class OrganicCat extends Cat{
    private int hunger;
    private int health;
    private int litterBox;
    public OrganicCat (String name) {
        super(name);


        this.hunger = 10;
        this.health = 10;
        this.litterBox = 10;

    }
    public void feed() {
        hunger -= 2;
    }
    public void vetVisit(){
        health += 5;
    }


    public void cleanLitterBox(){
        litterBox -= 10;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hunger=" + hunger +
                ", name='" + name + '\'' +
                ", boredom=" + boredom +
                ", health=" + health +
                ", litterBox=" + litterBox +
                '}';
    }


    public void tick() {
        this.hunger++;
        this.health--;
        this.litterBox++;
    }

    }
