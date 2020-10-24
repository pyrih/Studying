package org.pyrih.spclst.event;

/**
 * https://youtu.be/DNC6Lknn2AE
 */
public class Demo {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // event subscribe action
        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);
        switcher.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn() {
                System.out.println("Fire in the hall!");
            }
        });
        switcher.addElectricityListener(() -> System.out.println("Lambda!"));

        switcher.switchOn();
    }
}
