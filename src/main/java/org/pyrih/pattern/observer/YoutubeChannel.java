package org.pyrih.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void releaseNewVideo(String video) {
        System.out.println("\nRelease new video: " + video);
        notifyObservers();
    }
}
