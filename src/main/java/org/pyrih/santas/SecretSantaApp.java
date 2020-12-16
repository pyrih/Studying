package org.pyrih.santas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecretSantaApp {
    public static void main(String[] args) {
        List<Pair<Person, Person>> pairs = new ArrayList<>();

        List<Person> senders = new ArrayList<>();
        senders.add(new Person("A"));
        senders.add(new Person("B"));
        senders.add(new Person("C"));
        senders.add(new Person("D"));
        senders.add(new Person("E"));
        senders.add(new Person("F"));
        senders.add(new Person("G"));
        senders.add(new Person("H"));


        List<Pair<Person, Person>> list = setPairs(senders);


        for (int j = 0; j < list.size(); j++)
            System.out.println(j + 1 + " -> " + senders.get(j));

    }

    public static List<Pair<Person, Person>> setPairs(List<Person> people) {

        List<Pair<Person, Person>> result = new ArrayList<>();

        List<String> donor = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        Collections.shuffle(donor);

        List<String> receiver = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        Collections.shuffle(receiver);


        for (String s : donor) {
            Collections.shuffle(receiver);
            int target = 0;
            if (receiver.get(target).equals(s)) {
                target++;
            }
            System.out.println(s + " => " + receiver.get(target));
            receiver.remove(receiver.get(target));
        }

        return result;
    }
}
