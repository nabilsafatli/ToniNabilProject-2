package inheritanceTest;

import java.util.Arrays;

public class Car extends Vehicle{

    public Car() {
        this.setVehicleType("Car");
        this.setMaximumLoad(20);
        this.setSeats(5);
        this.setGasTankVolume(60);

    }


}
