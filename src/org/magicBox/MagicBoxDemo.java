package org.magicBox;

import org.collections.Animal;
import org.collections.Bird;
import org.collections.Hare;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class MagicBoxDemo {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();
        magicBox.setObject(1);
        magicBox.setObject(LocalDateTime.now());
        magicBox.setObject(new ArrayList<String>(Arrays.asList("hocus", "pocus", "spell")));
        System.out.println(magicBox.getObject());

        MagicBoxGeneric<Animal> magicBoxGeneric = new MagicBoxGeneric<>();
        magicBoxGeneric.setObject(new Bird());
        System.out.println(magicBoxGeneric.getObject());

        MagicBoxBounded magicBoxBounded = new MagicBoxBounded();
        magicBoxBounded.setObject(new Bird());
        System.out.println(magicBoxBounded.getObject());

        MagicBoxBounded<Animal> magicBoxBounded1 = new MagicBoxBounded<>();
        magicBoxBounded1.setObject(new Hare());
        System.out.println(magicBoxBounded1.getObject());

    }
}

class MagicBox {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}

class MagicBoxBounded<T extends Animal>{
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}