package org.lessons.java.animals;

public abstract class Animale {

    //metodo normale
    public void dormi(){
        System.out.println("Zzzz");
    }

    //metodi astratti
    public abstract void verso();
    public abstract void mangia();
}
