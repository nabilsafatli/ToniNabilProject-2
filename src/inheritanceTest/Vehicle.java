package inheritanceTest;

import java.util.Arrays;

public class Vehicle {

    // Vehicle Information
    public String vehicleType;

    // Vegicle Specification
    double gasTankVolume;
    double mileage;
    int maximumLoad;
    int seats;
    String[] cargo;

    int cargoIndex = 0;

    double gasPerMile;

    public void setGasPerMile(double gasPerMile) {
        this.gasPerMile = gasPerMile;
    }
    public void setMaximumLoad(int maximumLoad){
        this.maximumLoad = maximumLoad;
        this.cargo = new String[maximumLoad];
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;

    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public void setGasTankVolume(double gasTankVolume) {
        this.gasTankVolume = gasTankVolume;
    }

    public void travelDistance(double distance){

        this.mileage = this.mileage + distance;
    }

    public void consumeGas(double gasConsumed){
        this.gasTankVolume = gasTankVolume - gasConsumed;
    }

    public void addCargo(String cargo){

        if (cargoIndex > maximumLoad){
            System.out.println("Vehicle has reached maximum capacity");
        }
        else{
            this.cargo[cargoIndex] = cargo;
            cargoIndex++;
        }
    }

    public void drive(double mileage){

        double gasConsumed = this.gasPerMile * mileage;

        if(gasConsumed > gasTankVolume){
            System.out.println("You dont have enough gas for the whole trip");
        }
        else{
            this.consumeGas(gasConsumed);
            this.travelDistance(mileage);
        }
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", gasTankVolume=" + gasTankVolume +
                ", mileage=" + mileage +
                ", maximumLoad=" + maximumLoad +
                ", seats=" + seats +
                ", cargo=" + Arrays.toString(cargo) +
                ", cargoIndex=" + cargoIndex +
                ", gasPerMile=" + gasPerMile +
                '}';
    }
}
