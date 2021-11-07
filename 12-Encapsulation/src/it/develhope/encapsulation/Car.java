package it.develhope.encapsulation;


import lombok.*;

@Data
@AllArgsConstructor
public class Car {

    private double power;
    private int doors;
    private double weight;
    private CarConsumption carConsumption;

    public void setDoors(int doors) {
        if(this.doors > 5) return;
        this.doors = doors;
    }
    public Car(double power, int doors, double consumption, double weight){
        this(power, doors, weight, new CarConsumption());
        this.carConsumption.setFuel(consumption);
    }


    public double getConsumption(){
        return carConsumption.getFuel();
    }

    public void setConsumption(double consumption){
        carConsumption.setFuel(consumption);
    }
}
