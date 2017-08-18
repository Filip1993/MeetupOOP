package com.kesteli.filip.meetupoop.drzave;

import com.kesteli.filip.meetupoop.drzave.zakoni.Zakon;

import java.util.ArrayList;

/**
 * Created by Valemate on 17.8.2017..
 */

public abstract class Drzava implements Zakon {

    private int brojLjudi;
    private int brojTuristaNaMoru;
    private float cijenaPoTuristu;
    private String jezik;
    private ArrayList<String> drzaveList;

    public Drzava() {

    }

    public Drzava(int brojLjudi, int brojTuristaNaMoru, String jezik) {
        this.brojLjudi = brojLjudi;
        this.brojTuristaNaMoru = brojTuristaNaMoru;
        this.jezik = jezik;
    }

    /**
     * INPUT: broj ljudi, prihodi, rashodi
     * OUTPUT: BDP - Za razlicite kontinente se razlicito racuna
     */
    public abstract float BDP(int brojLjudi, float prihodi, float rashodi);

    private float prihodiIzMorskogTurizma(int brojTurista, float cijenaPoTuristuNaMoru) {
        return brojTurista * cijenaPoTuristuNaMoru;
    }
}


