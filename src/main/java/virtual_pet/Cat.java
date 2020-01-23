package virtual_pet;

public class Cat {

    public Object getFeedStatus;
    protected String name;
    protected int boredom;

    public Cat(String name) {
        this.name = name;
        this.boredom = 10;

    }

    public String getName() {
        return name;
    }

    public int boredom (){ return boredom; }


    public void play(){
        boredom -= 2;
    }

    public void receiveFood() {
    }

    public void tick() {
        this.boredom++;
    }

}

