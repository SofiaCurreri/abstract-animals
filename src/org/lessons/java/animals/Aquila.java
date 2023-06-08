package org.lessons.java.animals;

public class Aquila extends Animale implements Volante{
    @Override
    public void verso() {
        System.out.println("Craaa!");
    }

    @Override
    public void mangia() {
        System.out.println("Piccoli mammiferi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!");
    }
}
