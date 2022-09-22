package hu.petrik.emberek;


import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Ember e1 = new Ember("Gipsz Jakab", "1998-1-12", "Budapest");
        Ember e2 = new Ember("Teszt Elek", "2003-12-5", "Debrecen");
        Ember e3 = new Ember("Kovács István", "1973-9-22", "Pécs");
        Ember e4 = new Ember("Lakatos Jozsef", "1973-9-22", "Veszprém");
        Ember e5 = new Ember("Kovács Flóra", "1973-9-22", "Szeged");
        Ember[]  emberTomb = new Ember[]{e1, e2, e3, e4, e5};
        Emberek ek = new Emberek(emberTomb);

        String fajlNev = "sajt.txt";

        try {
            Emberek ek2 = new Emberek(fajlNev);
            System.out.println(ek);
        } catch (FileNotFoundException e) {
            System.out.printf("A(z) %s nem található", fajlNev);;
        } catch (IOException e){
            System.out.println("Ismeretlen hiba történt");
        }


    }
}
