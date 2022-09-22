package hu.petrik.emberek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emberek {
    private List<Ember> emberek;

    public Emberek(Ember[] emberTomb){
        this.emberek = new ArrayList<>();

        this.emberek.addAll(Arrays.asList(emberTomb));
    }


}
