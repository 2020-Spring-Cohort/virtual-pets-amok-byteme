package virtual_pet;

public class RoboCat extends Cat {
    private int maintenance;
    private int batteryLife;

    public RoboCat(String name, int boredom) {
        super(name, boredom);

        this.maintenance = 10;
        this.batteryLife = 10;
    }

    public void repair() {maintenance += 2;}
    public void recharge() {batteryLife += 5;}

    @Override
    public String toString() {
        return "name= " + name +
                ", boredom= " + boredom +
                ", maintenance= " + maintenance +
                ", batteryLife= " + batteryLife;
    }

    public void tick () {
        this.maintenance--;
        this.batteryLife--;
    }
}
