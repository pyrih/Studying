package org.pyrih.spclst.event;

public class Lamp implements ElectricityConsumer {
    public void lightOn() {
        System.out.println("The lamp is on!");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
