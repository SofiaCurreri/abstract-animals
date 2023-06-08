package org.lessons.java.animals;

public class Delfino extends Animale implements Nuotante{
    @Override
    public void verso() {
        System.out.println("Uaa Uaa!");
    }

    @Override
    public void mangia() {
        System.out.println("Piccoli pesci");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!");
    }
}
