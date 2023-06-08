package org.lessons.java.animals;

public class Cane extends Animale implements Nuotante{
    @Override
    public void verso() {
        System.out.println("Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("Croccantini");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!");
    }
}
