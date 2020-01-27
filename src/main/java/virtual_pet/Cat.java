package virtual_pet;

public class Cat {

    public Object getFeedStatus;
    protected String name;
    public int boredom;

    public Cat(String name) {
        this.name = name;
        this.boredom = boredom;
    }

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

    public void receiveFood() {
    }
}

