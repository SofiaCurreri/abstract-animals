package org.lessons.java.animals;

public class Passerotto extends Animale implements Volante{
    @Override
    public void verso() {
        System.out.println("Cip Cip!");
    }

    @Override
    public void mangia() {
        System.out.println("Vermi, frutta e semi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!");
    }
}
