package todo.kayttoliittyma;

import java.util.Scanner;
import todo.Sovellus;
import todo.Tehtava;
import todo.ToDoLista;

public class Kayttoliittyma {

    private Sovellus sove;
    private Scanner lukija;

    public Kayttoliittyma() {
        sove = new Sovellus();
        lukija = new Scanner(System.in);
    }

    public void kaynnista() {
        System.out.println("Tervetuloa ToDo -Listaan. Valitse toiminto:");
        toiminnot();
    }

    private void toiminnot() {
        int komento = 0;
        while (true) {
            System.out.println("   1. Lisää uusi lista");
            System.out.println("   2. Selaa vanhoja listoja");
            System.out.println("   3. Lopeta");
            System.out.print("Toiminto numero: ");
            try {
                komento = Integer.parseInt(lukija.nextLine());
            } catch (Exception e) {
                System.out.println("Valitse toiminto numeroiden 1 ja 3 väliltä.");
            }

            if (komento == 1) {
                lisaaLista();
            } else if (komento == 2) {
                selaaListoja();
            } else if (komento == 3) {
                System.out.println("");
                System.out.println("Toivottavasti elämä on handlassa taas hetken. Kiitos ja hei!");
                System.out.println("                   *************");
                break;
            }
        }
    }

    private void lisaaLista() {
        System.out.println("");
        System.out.print("Uuden listan nimi: ");
        String listanNimi = lukija.nextLine();
        sove.uusiLista(listanNimi);
        System.out.println("");
        System.out.println("Uusi lista lisätty. Mitä haluat seuraavaksi tehdä?");
        System.out.println("");
    }

    private void selaaListoja() {
        int komento = 0;
        System.out.println("Valitse lista kirjoittamalla sen numero. Jos haluat palata valikkoon, kirjoita 999.");
        int i = 1;
        for (ToDoLista lista : sove.palautaListat()) {
            System.out.println("   " + i + ". " + lista.palautaListanNimi());
            i++;
        }
        System.out.print("Lista numero: ");

        try {
            komento = Integer.parseInt(lukija.nextLine());
        } catch (Exception e) {
            System.out.println("Valitse lista numeroiden 1 ja " + sove.palautaListat().size() + " väliltä.");
        }
        
        
    }

}
