package org.magicBoxPair;

import org.collections.Animal;
import org.collections.Bird;
import org.collections.Hare;
import org.collections.Pigeon;
import org.magicBox.MagicBoxGeneric;

public class MagicBoxPairDemo {
    public static void main(String[] args) {
        BoxPair<Integer, String> boxPair = new BoxPair<>(1, "Q W E");
        System.out.printf("First: %d , Second: %s%n", boxPair.getFirst(), boxPair.getSecond());

        MagicBoxGeneric<Bird> magicBoxGeneric1 = new MagicBoxGeneric<>();
        Bird bird = new Bird();
        magicBoxGeneric1.setObject(bird);
        MagicBoxGeneric<Bird> magicBoxGeneric2 = new MagicBoxGeneric<>();
        Bird bird2 = new Bird();
        magicBoxGeneric2.setObject(bird);
        System.out.println(Magician.compare(magicBoxGeneric1, magicBoxGeneric2));

        Hare hare = new Hare();
        MagicBoxGeneric<Hare> magicBoxGeneric3 = new MagicBoxGeneric<>();
        magicBoxGeneric3.setObject(hare);
        Magician.print(magicBoxGeneric3);

    }
}

class BoxPair<S, T> {
    private S first;
    private T second;

    public BoxPair(S first, T second) {
        this.first = first;
        this.second = second;
    }

    public S getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

class Magician {
    public static <T> boolean compare(MagicBoxGeneric<T> box1, MagicBoxGeneric<T> box2) {
        return box1.getObject().equals(box2.getObject());
    }

    //wild card
    public static void print(MagicBoxGeneric<? extends Animal> box) {
        System.out.println(box.getObject().toString());
    }
    public static void print2(MagicBoxGeneric<? super Pigeon> box) {
        System.out.println(box.getObject().toString());
    }
}