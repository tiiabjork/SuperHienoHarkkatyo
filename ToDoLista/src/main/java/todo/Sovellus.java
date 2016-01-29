package todo;

import java.util.ArrayList;

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

}
