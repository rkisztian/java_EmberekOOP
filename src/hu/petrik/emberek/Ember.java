package hu.petrik.emberek;

import java.time.LocalDate;

public class Ember {

    private String nev;
    private String szulDatum;
    private String szulHely;


    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }


    public int getSzulEv(){
        return Integer.parseInt(this.szulDatum.substring(0,4));
    }

    public int getSzulHonap(){
        String[] szuletesiAdatok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesiAdatok[1]);

    }public int getSzulNap(){
        String[] szuletesiAdatok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesiAdatok[2]);
    }

    public int getEletkor(){
        return LocalDate.now().getYear() - this.getSzulEv();
    }

    @Override
    public String toString() {
        return String.format("%30s %10s (%3d év) %20s %d",this.nev, this.szulDatum,
                this.getEletkor(),this.szulHely,this.getSzulNap());
    }
}
