package todo;

import java.util.ArrayList;
import java.util.List;

/**
 * Sovellus-luokka mahdollistaa monien todo-listojen käytön ja hallinnoinnin
 * yhtäaikaisesti. Luokassa voi tulostaa listojen sisältöä ja hallinnoida
 * listojen luontia.
 *
 * @author Tiia
 */
public class Sovellus {

    private ArrayList<ToDoLista> listat;

    /**
     * Alustetaan uusi sovellus, johon luodaan uusi tyhjä ArrayList.
     */
    public Sovellus() {
        listat = new ArrayList<>();
    }

    /**
     * Metodilla palautetaan luotujen todo-listojen tämän hetkinen määrä.
     * @return listojen määrä
     */
    public int palautaListojenMaara() {
        if (listat.isEmpty()) {
            return 0;
        }
        return listat.size();
    }

    /**
     * Metodilla luodaan uusi lista ja annetaan sille nimi.
     *
     * @param listanNimi Käyttäjä antaa uuden listan nimen
     */
    public void uusiLista(String listanNimi) {
        listat.add(new ToDoLista(listanNimi));
    }

    /**
     * Metodi palauttaa Listan tämän hetkisistä ToDolistoista.
     * @return ToDoListoja
     */
    public List<ToDoLista> palautaListat() {
        return listat;
    }

    /**
     * Metodilla halutaan etsiä se lista-olio, jonka nimi annetaan parametrina.
     *
     * @param etsittava Käyttäjä syöttää listan objectina
     * @return Etsittävä lista palautuu
     */
    public ToDoLista palautaLista(Object etsittava) {
        String listuli = (String) etsittava;
        return palautaLista(listuli);
    }
    
    /**
     * Metodille annetaan ToDoLista olio, ja metodi etsii tämän listan olemassa
     * olevista listoista.
     * @param etsittava Käyttäjä syöttää ToDoListan jonka haluaa etsiä
     * @return  Etsittävä lista palautuu
     */
    public ToDoLista palautaLista(ToDoLista etsittava) {
        String listuli = etsittava.toString();
        return palautaLista(listuli);
    }

    /**
     * Metodilla etsitään ToDoListaa sen string-nimen avulla.
     * @param etsittava Käyttäjän etsimä lista
     * @return Etsittävä lista palautuu
     */
    public ToDoLista palautaLista(String etsittava) {
        for (ToDoLista lista : listat) {
            if (lista.palautaListanNimi().equals(etsittava)) {
                return lista;
            }
        }
        return null;
    }
 /**
  * Metodilla voi lisätä uuden listan.
  * @param lista ToDoLista olio joka halutaan lisätä listaan
  */
    public void lisaaLista(ToDoLista lista) {
        listat.add(lista);
    }

    /**
     * Metodi poistaa sen listan, jonka nimi annetaan parametrina.
     *
     * @param listanNimi Käyttäjä syöttää poistettavan listan nimen
     */
    public void poistaLista(String listanNimi) {
        ToDoLista poistettava = null;

        if (listat.isEmpty()) {
            System.out.println("Ei ole mitään poistettavaa");
        } else {
            for (ToDoLista lista : listat) {
                if (lista.palautaListanNimi().equals(listanNimi)) {
                    poistettava = lista;
                }
            }
            if (poistettava != null) {
                listat.remove(poistettava);
            }
        }
    }

    /**
     * Metodi tulostaa kaikkien listojen sisällön kutsumalla saman luokan
     * sisällä olevaa metodia jokaiselle listalle.
     */
    public void tulostaKaikkienListojenSisalto() {
        for (ToDoLista lista : listat) {
            tulostaListanSisalto(lista);
        }
    }

    /**
     * Metodi tulostaa parametrina annetun listan sisällön tyylitellysti.
     *
     * @param lista ToDoLista-olio, joka halutaan tulostaa
     *
     * @see todo.ToDoLista#palautaListanNimi()
     * @see todo.ToDoLista#palautaTekemattomat()
     * @see todo.ToDoLista#palautaTehdyt()
     */
    public void tulostaListanSisalto(ToDoLista lista) {
        System.out.println(lista.palautaListanNimi() + "\n");

        if (lista.palautaTekemattomat().isEmpty()) {
            System.out.println("Sinulla ei ole tekemättömiä tehtäviä!");

        } else {
            System.out.println("Tekemättömät tehtävät:");
            for (Tehtava duuni : lista.palautaTekemattomat()) {
                System.out.println("   " + duuni.toString());
            }
        }
        System.out.println("");

        if (lista.palautaTehdyt().isEmpty()) {
            System.out.println("Sinulla ei ole tehtyjä tehtäviä!");

        } else {
            System.out.println("Tehdyt tehtävät:");
            for (Tehtava duuni : lista.palautaTehdyt()) {
                System.out.println("   " + duuni.toString());
            }
        }
        System.out.println("");
    }

    /**
     * Metodi poistaa parametrina annetun lista-olion ArrayListista.
     * @param lista Käyttäjän poistama ToDoLista
     */
    public void poistaLista(ToDoLista lista) {
        if (listat.isEmpty()) {
            return;
        } else {
            listat.remove(lista);
        }
    }

}
