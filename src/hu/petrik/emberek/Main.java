package hu.petrik.emberek;



public class Main {
    public static void main(String[] args){
        Ember e1 = new Ember("Gipsz Jakab", "1998-1-12", "Budapest");
        Ember e2 = new Ember("Teszt Elek", "2003-12-5", "Debrecen");
        Ember e3 = new Ember("Kovács István", "1973-9-22", "Pécs");

        System.out.println(e1 + "" + e1.getSzulEv());
        System.out.println(e2);
        System.out.println(e3);
    }
}
