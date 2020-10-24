package org.pyrih.pattern.observer;

public class Demo {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        YoutubeSubscriber aSubscriber = new YoutubeSubscriber(youtubeChannel);
        YoutubeSubscriber bSubscriber = new YoutubeSubscriber(youtubeChannel);
        YoutubeSubscriber cSubscriber = new YoutubeSubscriber(youtubeChannel);
        YoutubeSubscriber dSubscriber = new YoutubeSubscriber(youtubeChannel);
        YoutubeSubscriber eSubscriber = new YoutubeSubscriber(youtubeChannel);

        youtubeChannel.addObserver(aSubscriber);
        youtubeChannel.addObserver(bSubscriber);
        youtubeChannel.addObserver(cSubscriber);
        youtubeChannel.addObserver(dSubscriber);
        youtubeChannel.addObserver(eSubscriber);

        youtubeChannel.releaseNewVideo("Design Patterns: Singleton");
        youtubeChannel.releaseNewVideo("Design Patterns: Builder");

        youtubeChannel.removeObserver(dSubscriber);
        youtubeChannel.removeObserver(eSubscriber);

        youtubeChannel.releaseNewVideo("Design Patterns: Observer");
    }
}
