package virtual_pet;

public class Cat {

    protected String name;
    public int boredom;

    public Cat(String name, int boredom) {
        this.name = name;
        this.boredom = boredom;
    }

    public String getName() {
        return name;
    }

    public int boredom (){ return boredom; }

    public void play(){
        boredom -= 2;
    }

    public void tick() {
        this.boredom++;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", boredom=" + boredom +
                '}';
    }
}

