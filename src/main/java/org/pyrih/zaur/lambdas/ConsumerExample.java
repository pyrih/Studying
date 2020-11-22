package org.pyrih.zaur.lambdas;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    // Uses in SupplierExample.java
}
