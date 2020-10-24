package org.pyrih.spclst.event;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    //    public ElectricityConsumer consumer;
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("The switcher has turned on!");
/*        if (listeners != null) {
            listeners.electricityOn();
        }*/

        for (ElectricityConsumer listener : listeners) {
            listener.electricityOn();
        }

    }
}
