package org.example.OOP.lesson2.tast2;

public class Human {
    private Car lastCar;
    private Bicycle bicycle;

    public void drive(Car car) {
        if (lastCar == null) {
            car.run();
            lastCar = car;
        }else {
            System.out.println("еду");
        }
    }

    public void stop(Car car) {
        if (lastCar != null) {
            car.stop();
            lastCar = null;
        }else {
            System.out.println("уже стою");
        }
    }
}