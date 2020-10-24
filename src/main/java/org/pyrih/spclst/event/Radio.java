package org.pyrih.spclst.event;

public class Radio implements ElectricityConsumer {
    public void playMusic() {
        System.out.println("The radio plays!");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
