package org.lessons.java.animals;

public class Zoo {
    public static void faiVolare(Volante Animale){
        Animale.vola();
    }

    public static void faiNuotare(Nuotante Animale){
        Animale.nuota();
    }
    public static void main(String[] args) {
        Animale[] zoo = new Animale[4];

        zoo[0] = new Cane();
        zoo[1] = new Passerotto();
        zoo[2] = new Aquila();
        zoo[3] = new Delfino();

        //stampo tutti gli elementi di zoo[] e i rispettivi metodi
        for (int i = 0; i < zoo.length ; i++) {
            System.out.println("\nAnimale: " + zoo[i].getClass().getSimpleName());
            System.out.println("Verso: ");
            zoo[i].verso();
            System.out.println("Mangia: ");
            zoo[i].mangia();
            System.out.println("Dorme: ");
            zoo[i].dormi();
            System.out.println("Cosa stai facendo? ");

            //funzione per volante/nuotante
            if(zoo[i] instanceof Volante){
                faiVolare((Volante) zoo[i]);
            } else if(zoo[i] instanceof Nuotante) {
                faiNuotare((Nuotante) zoo[i]);
            }
        }

    }
}
