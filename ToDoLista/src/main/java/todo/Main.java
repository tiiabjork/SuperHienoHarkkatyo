package todo;

import java.util.Scanner;
import todo.grafiikka.GrafiikkaUI;
import todo.kayttoliittyma.Kayttoliittyma;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Kayttoliittyma kayttis = new Kayttoliittyma(lukija);
        kayttis.kaynnista();
        
//        Sovellus sove = new Sovellus();
//
//        ToDoLista lista1 = new ToDoLista("Seuraavaan halkoon");
//
//        lista1.lisaaTehtava("Teetä avaimia");
//        lista1.lisaaTehtava("Sovi KOPO tapaaminen");
//        lista1.lisaaTehtava("Lähteä esityslista!!!");
//
//        sove.lisaaLista(lista1);
//        GrafiikkaUI ikkuna = new GrafiikkaUI(sove);
//        ikkuna.setVisible(true);
//        
//        ToDoLista lista2 = new ToDoLista("Kotityöt");
//        
//        lista2.lisaaTehtava("Imuroi olkkari");
//        lista2.lisaaTehtava("Osta kaupasta avocadoja");
//        
//        lista1.muutaTehdyksi("Teetä avaimia");
//        

//        sove.lisaaLista(lista2);
//        
//        sove.tulostaKaikkienListojenSisalto();
    }

}
