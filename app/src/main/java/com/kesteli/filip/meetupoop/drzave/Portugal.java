package com.kesteli.filip.meetupoop.drzave;

import com.kesteli.filip.meetupoop.drzave.zakoni.ZakonOMorskomTrgovanju;
import com.kesteli.filip.meetupoop.drzave.zakoni.ZakonOTemeljnomZivotnomDohotku;

/**
 * Created by Valemate on 18.8.2017..
 */

public class Portugal extends EuropskaDrzava implements ZakonOMorskomTrgovanju, ZakonOTemeljnomZivotnomDohotku {

    @Override
    public float zakonOBrojuBrodova(int brojStanovnika) {
        return 0;
    }

    @Override
    public float zakonOPrijevozuRobe(int brojRobe, int brojPutnika) {
        return 0;
    }

    @Override
    public float zakonOMinimalnomPrimanjuDohotka() {
        return 0;
    }

    @Override
    public float zakonOMaksimalnomPrimanjuDohotka() {
        return 0;
    }

    @Override
    public float zakonOPorezuNaNekretnine(int brojStanova) {
        return 0;
    }

    @Override
    public String zakonOTVPretplati(int brojTVovaUKuci, int brojDjeceUKuci) {
        return null;
    }

    @Override
    public float zakonOVanjskojTrgovini(float prihodi, float rashodi) {
        return 0;
    }

    @Override
    public float zakonOMirovinama(int brojGodinaRadnogStaza) {
        return 0;
    }

    @Override
    public float BDP(int brojLjudi, float prihodi, float rashodi) {
        return prihodi-rashodi;
    }
}
