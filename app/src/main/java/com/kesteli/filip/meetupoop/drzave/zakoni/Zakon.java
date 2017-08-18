package com.kesteli.filip.meetupoop.drzave.zakoni;

/**
 * Created by Valemate on 18.8.2017..
 */

public interface Zakon {

    /**
     * INPUT: Koliko novaca ide po nekretnini
     * OUTPUT: Porez
     */
    float zakonOPorezuNaNekretnine(int brojStanova);

    /**
     * INPUT: broj TV-ova u kuci
     * OUTPUT: Napisati dopis za potpisivanje pretplate
     */
    String zakonOTVPretplati(int brojTVovaUKuci, int brojDjeceUKuci);

    /**
     * INPUT: Prihodi, rashodi
     * OUTPUT: Kolika se ocekuje dobit
     */
    float zakonOVanjskojTrgovini(float prihodi, float rashodi);

    /**
     * INPUT: Broj godina radnog staza
     * OUTPUT: Penzija
     */
    float zakonOMirovinama(int brojGodinaRadnogStaza);

}

