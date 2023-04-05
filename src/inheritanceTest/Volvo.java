package inheritanceTest;

import java.util.Arrays;

public class Volvo extends Car{

    public Volvo(){
        this.setMileage(0);
        this.setGasPerMile(1.2);
    }



    public static void main(String[] args){

        Volvo volvo = new Volvo();

        System.out.println(volvo.toString());

        volvo.addCargo("Banana");
        volvo.addCargo("Backpack");

        volvo.drive(4);

        System.out.println(volvo.toString());
        volvo.drive(1);

        System.out.println(volvo.toString());

    }


}
