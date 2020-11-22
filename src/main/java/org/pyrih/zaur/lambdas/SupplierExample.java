package org.pyrih.zaur.lambdas;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {
    public static ArrayList<Car> create3Cars(Supplier<Car> supplier) {
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }

    public static void main(String[] args) {
        ArrayList<Car> list = create3Cars(() -> new Car("Nissan", "Black", 1.6));
        System.out.println(list);

        ConsumerExample.changeCar(list.get(0), car -> {
            car.color = "White";
            car.engine = 2.5;
            System.out.println("Car is upgraded: " + car.toString());
        });
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
