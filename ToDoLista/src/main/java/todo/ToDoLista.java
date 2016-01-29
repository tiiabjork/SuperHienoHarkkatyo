package todo;

import todo.Tehtava;
import java.util.ArrayList;
import java.util.List;

public class ToDoLista {

    private String nimi;
    private ArrayList<Tehtava> tekemattomat;
    private ArrayList<Tehtava> tehdyt;


    public ToDoLista(String nimi) {
        this.nimi = nimi;
        tekemattomat = new ArrayList<>();
        tehdyt = new ArrayList<>();
    }
    
    public void muutaTehdyksi(String tehtava) {
        for (Tehtava duuni : tekemattomat) {
            if (tehtava.equals(duuni.toString())) {
                duuni.merkitaanTehdyksi();
            }
        }
        siirraTehtyTehtavaTehtyihinTehtaviin();
    }

    public void lisaaTehtava(String tehtava) {
        tekemattomat.add(new Tehtava(tehtava));
    }

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

    public List<Tehtava> palautaKaikkiTehtavat() {
        ArrayList<Tehtava> kaikkiTehtavat = new ArrayList<>();
        kaikkiTehtavat.addAll(tekemattomat);
        kaikkiTehtavat.addAll(tehdyt);
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

    
    public String palautaListanNimi() {
        return nimi;
    }

}
