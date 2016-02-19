package todo;

import todo.Tehtava;
import java.util.ArrayList;
import java.util.List;

/**
 * Luokka pitÃ¤Ã¤ tehtÃ¤viÃ¤ listassa. Luokka osaa lajitella tehtÃ¤vÃ¤t tehtyihin ja
 * tekemÃ¤ttÃ¶miin. Luokka tarjoaa myÃ¶s vÃ¤lineitÃ¤ erityyppisten listojen
 * palautukselle, jotta monipuoliset toiminnot onnistuvat.
 *
 * @author Tiia
 */
public class ToDoLista {

    private String nimi;
    private ArrayList<Tehtava> tekemattomat;
    private ArrayList<Tehtava> tehdyt;

    /**
     * Alustetaan uusi lista, jonka nimi annetaan konstruktorille parametrina.
     * @param nimi Listan nimi
     */
    public ToDoLista(String nimi) {
        this.nimi = nimi;
        tekemattomat = new ArrayList<>();
        tehdyt = new ArrayList<>();
    }
    /**
     * Metodi muuttaa stringinÃ¤ annetun tehtÃ¤vÃ¤n tilan tehdyksi.
     *
     * @param tehtava TehtÃ¤vÃ¤ joka halutaan muuttaa tehdyksi
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
     * Metodi muuttaa stringinÃ¤ annetun tehtÃ¤vÃ¤n tilan takaisin tekemÃ¤ttÃ¶mÃ¤ksi.
     * Samalla se siirtÃ¤Ã¤ tehtÃ¤vÃ¤n oikeaan listaa.
     *
     * @param tehtava TehtÃ¤vÃ¤ joka halutaan muuttaa tekemÃ¤ttÃ¶mÃ¤ksi
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
     * Metodilla lisÃ¤tÃ¤Ã¤n listaan uusi tehtÃ¤vÃ¤, joka on aluksi tekemÃ¤ttÃ¶missÃ¤
     * tehtÃ¤vissÃ¤.
     *
     * @param tehtava Käyttäjän lisäämä syöte
     */
    public void lisaaTehtava(String tehtava) {
        if (!tehtava.equals("") && !tehtava.isEmpty()) {
            tekemattomat.add(new Tehtava(tehtava));
        }
    }
    /**
     * Metodilla tarkistetaan tekemÃ¤ttÃ¶mien tehtÃ¤vien listasta tehdyt tehtÃ¤vÃ¤t
     * ja siirretÃ¤Ã¤n ne tehtyjen listaan.
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
     * Metodi siirtÃ¤Ã¤ tehtyjen tehtÃ¤vien seasta tekemÃ¤ttÃ¶mÃ¤ksi muutetut tehtÃ¤vÃ¤t
     * tekemÃ¤ttÃ¶mien tehtÃ¤vien listaan.
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
     * Metodi palauttaa sekÃ¤ tekemÃ¤ttÃ¶mÃ¤t ettÃ¤ tehdyt tehtÃ¤vÃ¤t yhdessÃ¤ listassa.
     * 
     * @return Kaikki tÃ¤mÃ¤n todo-listan tehtÃ¤vÃ¤t yhdessÃ¤ listassa
     */
    public List<Tehtava> palautaKaikkiTehtavat() {
        ArrayList<Tehtava> kaikkiTehtavat = new ArrayList<>();
        kaikkiTehtavat.addAll(tekemattomat);
        kaikkiTehtavat.addAll(tehdyt);
        return kaikkiTehtavat;
    }
    /**
     * Metodi palauttaa sekÃ¤ tekemÃ¤ttÃ¶mÃ¤t ettÃ¤ tehdyt tehtÃ¤vÃ¤t listassa string-
     * muodossa. 
     * 
     * @return Kaikki tÃ¤mÃ¤n todo-listan tehtÃ¤vÃ¤t string-muodossa
     */
    public List<String> palautaKaikkiTehtavatStringina() {
        ArrayList<String> kaikkiTehtavat = new ArrayList<>();
        kaikkiTehtavat.addAll(palautaStringListana(tekemattomat));
        kaikkiTehtavat.addAll(palautaStringListana(tehdyt));
        return kaikkiTehtavat;
    }
    /**
     * Metodilla palautetaan parametrina annetun listan sisÃ¤ltÃ¶ muutettuna
     * stringeiksi.
     *
     * @param lista KÃ¤yttÃ¤jÃ¤n antama lista
     * @return listan sisÃ¤ltÃ¶ muutettuna stringeiksi
     */
    public List<String> palautaStringListana(List<Tehtava> lista) {
        ArrayList<String> kaikkiTehtavat = new ArrayList<>();
        for (Tehtava duuni : lista) {
            kaikkiTehtavat.add(duuni.toString());
        }
        return kaikkiTehtavat;
    }
    /**
     * Metodi palauttaa kaikki listan tekemättömät tehtävät listassa.
     * @return Tekemättömien tehtävien lista
     */
    public List<Tehtava> palautaTekemattomat() {
        return tekemattomat;
    }
    /**
     * Metori palauttaa kaikki listan tehdyt tehtävät listana.
     * @return Tehtyjen tehtävien lista
     */
    public List<Tehtava> palautaTehdyt() {
        return tehdyt;
    }
    /**
     * Metodi palauttaa tekemättömien tehtävien määrän.
     * @return Tekemättömien tehtävien määrä
     */
    public int tekemattomiaTehtavia() {
        if (tekemattomat.isEmpty()) {
            return 0;
        }
        return tekemattomat.size();
    }
    /**
     * Metori palauttaa tehtyjen tehtävien määrän.
     * @return Tehtyjen tehtävien määrä.
     */
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
    /**
     * Metodi palauttaa ToDoListan nimen.
     * @return Listan nimi
     */
    public String palautaListanNimi() {
        return nimi;
    }
    /**
     * Metodissa poistetaan parametrina annettu Tehtävä listalta, riippumatta
     * siitä, onko se tehty vai tekemätön.
     * @param muutettava Poistettava tehtävä
     */
    public void poistaTehtava(Tehtava muutettava) {
        if (muutettava == null) {
            return;
        }
        if (muutettava.onkoTehty()) {
            tehdyt.remove(muutettava);
        } else  {
            tekemattomat.remove(muutettava);
        }
    }
}
