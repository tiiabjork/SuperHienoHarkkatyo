package todo;

import java.util.ArrayList;
import java.util.List;

public class Sovellus {

    private ArrayList<ToDoLista> listat;

    public Sovellus() {
        listat = new ArrayList<>();
    }

    public int palautaListojenMaara() {
        if (listat.isEmpty()) {
            return 0;
        }
        return listat.size();
    }

    public void uusiLista(String listanNimi) {
        listat.add(new ToDoLista(listanNimi));
    }

    public List<ToDoLista> palautaListat() {
        return listat;
    }
    
    public ToDoLista palautaLista(Object etsittava) {
        for (ToDoLista lista : listat) {
            if (lista.palautaListanNimi().equals(etsittava)) {
                return lista;
            }
        }
        return null;
    }
    
    public void lisaaLista(ToDoLista lista) {
        listat.add(lista);
    }

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

    public void tulostaKaikkienListojenSisalto() {
        for (ToDoLista lista : listat) {
            tulostaListanSisalto(lista);
        }
    }

    public void tulostaListanSisalto(ToDoLista lista) {
        System.out.println(lista.palautaListanNimi());
        System.out.println("");

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

}
