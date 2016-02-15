package todo;

import todo.Tehtava;
import java.util.ArrayList;
import java.util.List;

/**
 * Luokka pitää tehtäviä listassa. Luokka osaa lajitella tehtävät tehtyihin ja
 * tekemättömiin. Luokka tarjoaa myös välineitä erityyppisten listojen
 * palautukselle, jotta monipuoliset toiminnot onnistuvat.
 *
 * @author Tiia
 */
public class ToDoLista {

    private String nimi;
    private ArrayList<Tehtava> tekemattomat;
    private ArrayList<Tehtava> tehdyt;

    public ToDoLista(String nimi) {
        this.nimi = nimi;
        tekemattomat = new ArrayList<>();
        tehdyt = new ArrayList<>();
    }

    /**
     * Metodi muuttaa stringinä annetun tehtävän tilan tehdyksi.
     *
     * @param tehtava Tehtävä joka halutaan muuttaa tehdyksi
     *
     * @see todo.Tehtava#onkoTehty()
     */
    public void muutaTehdyksi(String tehtava) {
        for (Tehtava duuni : tekemattomat) {
            if (tehtava.equals(duuni.toString())) {
                duuni.merkitaanTehdyksi();
            }
        }
        siirraTehtyTehtavaTehtyihinTehtaviin();
    }

    /**
     * Metodi muuttaa stringinä annetun tehtävän tilan takaisin tekemättömäksi.
     * Samalla se siirtää tehtävän oikeaan listaa.
     *
     * @param tehtava Tehtävä joka halutaan muuttaa tekemättömäksi
     *
     * @see todo.Tehtava#onkoTehty()
     */
    public void muutaTekemattomaksi(String tehtava) {
        for (Tehtava duuni : tehdyt) {
            if (tehtava.equals(duuni.toString())) {
                duuni.merkitaanTekemattomaksi();
            }
        }
        siirraTekematonTekemattomiinTehtaviin();
    }

    /**
     * Metodilla lisätään listaan uusi tehtävä, joka on aluksi tekemättömissä
     * tehtävissä.
     *
     * @param tehtava
     */
    public void lisaaTehtava(String tehtava) {
        if (!tehtava.equals("") && !tehtava.isEmpty()) {
            tekemattomat.add(new Tehtava(tehtava));
        }
    }

    /**
     * Metodilla tarkistetaan tekemättömien tehtävien listasta tehdyt tehtävät
     * ja siirretään ne tehtyjen listaan.
     */
    public void siirraTehtyTehtavaTehtyihinTehtaviin() {
        ArrayList<Tehtava> poistettavat = new ArrayList<>();

        for (Tehtava duuni : tekemattomat) {
            if (duuni.onkoTehty()) {
                poistettavat.add(duuni);
            }
        }
        tekemattomat.removeAll(poistettavat);
        tehdyt.addAll(poistettavat);
    }

    /**
     * Metodi siirtää tehtyjen tehtävien seasta tekemättömäksi muutetut tehtävät
     * tekemättömien tehtävien listaan.
     */
    private void siirraTekematonTekemattomiinTehtaviin() {
        ArrayList<Tehtava> poistettavat = new ArrayList<>();

        for (Tehtava duuni : tehdyt) {
            if (!duuni.onkoTehty()) {
                poistettavat.add(duuni);
            }
        }
        tehdyt.removeAll(poistettavat);
        tekemattomat.addAll(poistettavat);
    }

    /**
     * Metodi palauttaa sekä tekemättömät että tehdyt tehtävät yhdessä listassa.
     * 
     * @return Kaikki tämän todo-listan tehtävät yhdessä listassa
     */
    public List<Tehtava> palautaKaikkiTehtavat() {
        ArrayList<Tehtava> kaikkiTehtavat = new ArrayList<>();
        kaikkiTehtavat.addAll(tekemattomat);
        kaikkiTehtavat.addAll(tehdyt);
        return kaikkiTehtavat;
    }

    /**
     * Metodi palauttaa sekä tekemättömät että tehdyt tehtävät listassa string-
     * muodossa. 
     * 
     * @return Kaikki tämän todo-listan tehtävät string-muodossa
     */
    public List<String> palautaKaikkiTehtavatStringina() {
        ArrayList<String> kaikkiTehtavat = new ArrayList<>();
        kaikkiTehtavat.addAll(palautaStringListana(tekemattomat));
        kaikkiTehtavat.addAll(palautaStringListana(tehdyt));
        return kaikkiTehtavat;
    }

    /**
     * Metodilla palautetaan parametrina annetun listan sisältö muutettuna
     * stringeiksi.
     *
     * @param lista Käyttäjän antama lista
     * @return listan sisältö muutettuna stringeiksi
     */
    public List<String> palautaStringListana(List<Tehtava> lista) {
        ArrayList<String> kaikkiTehtavat = new ArrayList<>();
        for (Tehtava duuni : lista) {
            kaikkiTehtavat.add(duuni.toString());
        }
        return kaikkiTehtavat;
    }

    public List<Tehtava> palautaTekemattomat() {
        return tekemattomat;
    }

    public List<Tehtava> palautaTehdyt() {
        return tehdyt;
    }

    public int tekemattomiaTehtavia() {
        if (tekemattomat.isEmpty()) {
            return 0;
        }
        return tekemattomat.size();
    }

    public int tehtyjaTehtavia() {
        if (tehdyt.isEmpty()) {
            return 0;
        }
        return tehdyt.size();
    }

    @Override
    public String toString() {
        return nimi;
    }
    
    public String palautaListanNimi() {
        return nimi;
    }

    public void poistaTehtava(Tehtava muutettava) {
        if (muutettava.onkoTehty()) {
            tehdyt.remove(muutettava);
        } else  {
            tekemattomat.remove(muutettava);
        }
    }

}
