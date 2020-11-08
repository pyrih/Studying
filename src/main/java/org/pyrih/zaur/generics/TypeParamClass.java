package org.pyrih.zaur.generics;

public class TypeParamClass {
    public static void main(String[] args) {
        Info<String> inf1 = new Info<>("Hello");
        String s = inf1.getValue();

        Info<Integer> inf2 = new Info<>(27);
        Integer i = inf2.getValue();

        System.out.println(inf1);
        System.out.println(inf2);

        Box<String, Integer> box = new Box<>("Hi!", 27);
        Bucket<String> bucket = new Bucket<>("One", "Two");

    }
}

class Info <T> {
    private T value; // it can not be static

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public String toString() {
        return "[### " + value + " ###]";
    }
}

class Box <V1, V2> {
    private V1 v1;
    private V2 v2;

    public Box(V1 v1, V2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public V1 getV1() {
        return v1;
    }

    public void setV1(V1 v1) {
        this.v1 = v1;
    }

    public V2 getV2() {
        return v2;
    }

    public void setV2(V2 v2) {
        this.v2 = v2;
    }
}

class Bucket <V> {
    private V v1;
    private V v2;

    public Bucket(V v1, V v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public V abc(V v) { // можно не прописывать <V> перед возвращаемым значением. <V> объявлено в названии класса.
        return v;
    }

    public V getV1() {
        return v1;
    }

    public void setV1(V v1) {
        this.v1 = v1;
    }

    public V getV2() {
        return v2;
    }

    public void setV2(V v2) {
        this.v2 = v2;
    }
}
