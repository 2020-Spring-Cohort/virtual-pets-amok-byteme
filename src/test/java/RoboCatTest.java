import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import virtual_pet.RoboCat;

public class RoboCatTest {
    @Test
    public void shouldHaveDefaultMaintenance() {
        RoboCat underTest = new RoboCat("Ben", 10);
        int result = underTest.getMaintenance();
        Assertions.assertEquals(10, result);
    }

    @Test
    public void shouldHaveDefaultBatteryLife() {
        RoboCat underTest = new RoboCat("Ben", 10);
        int result = underTest.batteryLife();
        Assertions.assertEquals(10, result);
    }

    @Test
    public void repairShouldIncreaseMaintenanceByTwo() {
        RoboCat underTest = new RoboCat("Ben", 10);
        underTest.repair();
        int result = underTest.getMaintenance();
        Assertions.assertEquals(12, result);
    }

    @Test
    public void rechargeShouldIncreaseBatteryLifeByFive () {
        RoboCat underTest = new RoboCat("Ben", 10);
        underTest.recharge();
        int result = underTest.batteryLife();
        Assertions.assertEquals(15, result);
    }

    @Test
    public void laserBeamShouldSayZap () {
        RoboCat underTest = new RoboCat("Ben", 10);
         underTest.laserBeam();
    }
}
