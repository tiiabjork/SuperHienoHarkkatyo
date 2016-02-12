package todo.kayttoliittyma;

import java.util.Scanner;
import todo.Sovellus;
import todo.Tehtava;
import todo.ToDoLista;

public class Kayttoliittyma {

    private Sovellus sove;
    private Scanner lukija;

    public Kayttoliittyma(Scanner lukija) {
        sove = new Sovellus();
        this.lukija = lukija;
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
                if (komento > 3) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\n" + "Valitse toiminto numeroiden 1 ja 3 väliltä.");
            }

            if (komento == 1) {
                lisaaLista();
            } else if (komento == 2) {
                selaaListoja();
            } else if (komento == 3) {
                System.out.println("\n" + "Toivottavasti elämä on handlassa taas hetken. Kiitos ja hei!");
                System.out.println("                   *************");
                break;
            }
        }
    }

    private void lisaaLista() {
        System.out.print("\n" + "Uuden listan nimi: ");
        String listanNimi = lukija.nextLine();
        sove.uusiLista(listanNimi);
        System.out.println("\n" + "Uusi lista lisätty. Mitä haluat seuraavaksi tehdä?" + "\n");
    }

    private void selaaListoja() {
        int komento = 0;
        while (komento != 999) {
            if (sove.palautaListat().size() > 0) {
                System.out.println("\n" + "Valitse lista kirjoittamalla sen numero. Jos haluat palata valikkoon, kirjoita 999.");
                int i = 1;
                for (ToDoLista lista : sove.palautaListat()) {
                    System.out.println("   " + i + ". " + lista.palautaListanNimi());
                    i++;
                }
            } else {
                System.out.println("Ei listoja.");
                return;
            }

            System.out.print("Lista numero: ");
            try {
                komento = Integer.parseInt(lukija.nextLine());
                if (komento > sove.palautaListat().size()) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Valitse lista numeroiden 1 ja " + sove.palautaListat().size() + " väliltä.");
            }
        }
        if (komento != 999) {
            avaaLista(komento);
        }
    }

    private void avaaLista(int komento) {
        System.out.println("\n" + "          **********");
        System.out.println(sove.palautaListat().get(komento - 1).palautaListanNimi());

        int i = 1;
        if (!sove.palautaListat().get(komento - 1).palautaTekemattomat().isEmpty()) {
            System.out.println("\n" + "Tekemättömät tehtävät:");
            for (Tehtava duuni : sove.palautaListat().get(komento - 1).palautaTekemattomat()) {
                System.out.println("   " + i + ". " + duuni.toString());
                i++;
            }
        } else {
            System.out.println("Sinulla ei ole tekemättömiä tehtäviä!");
        }
        if (!sove.palautaListat().get(komento - 1).palautaTehdyt().isEmpty()) {
            System.out.println("\n" + "Tehdyt tehtävät:");
            for (Tehtava duuni : sove.palautaListat().get(komento - 1).palautaTehdyt()) {
                System.out.println("   " + i + ". " + duuni.toString());
                i++;
            }
        } else {
            System.out.println("Sinulla ei ole tehtyjä tehtäviä.");
        }
        System.out.println("          **********" + "\n");
        muutaListaa(sove.palautaListat().get(komento - 1), komento);
    }

    private void muutaListaa(ToDoLista muutettavaLista, int indeksi) {
        int komento = 0;
        System.out.println("   1. Lisää uusi tehtävä");
        System.out.println("   2. Muuta tehtävä tehdyksi");
        System.out.println("   3. Muuta tehtävä tekemättömäksi");
        System.out.println("   4. Palaa takaisin päävalikkoon");
//        System.out.println("   5. Poista tehtävä listalta kokonaan"); ei vielä toteutettu koodiin
        System.out.print("\n" + "Valitse toiminto: ");
        try {
            komento = Integer.parseInt(lukija.nextLine());
        } catch (Exception e) {
            System.out.println("\n" + "Valitse toiminto numeroiden 1 ja 4 väliltä.");
        }
        if (komento == 1) {
            lisaaListaanTehtava(muutettavaLista);
        } else if (komento == 2) {
            muutaTehtavaTehdyksi(muutettavaLista);
        } else if (komento == 3) {
            muutaTehtavaTekemattomaksi(muutettavaLista);
        } else if (komento == 4) {
            return;
        }
        avaaLista(indeksi);
    }

    private void lisaaListaanTehtava(ToDoLista muutettavaLista) {
        String tehtava = "";
        System.out.print("Lisättävä tehtävä: ");
        try {
            tehtava = lukija.nextLine();
        } catch (Exception e) {
            System.out.println("\n" + "Kirjoita tehtävä.");
        }
        muutettavaLista.lisaaTehtava(tehtava);
    }

    private void muutaTehtavaTehdyksi(ToDoLista muutettavaLista) {
        int komento = 0;
        System.out.println("Kirjoita tehtävän numero, jonka haluat tehdyksi: ");
        try {
            komento = Integer.parseInt(lukija.nextLine());
        } catch (Exception e) {
            System.out.println("\n" + "Valitse muutettava tehtävä listasta.");
        }

        muutettavaLista.muutaTehdyksi(muutettavaLista.palautaKaikkiTehtavatStringina().get(komento - 1));
    }

    private void muutaTehtavaTekemattomaksi(ToDoLista muutettavaLista) {
        int komento = 0;
        System.out.println("Kirjoita tehtävän numero, jonka haluat tekemättömäksi: ");
        try {
            komento = Integer.parseInt(lukija.nextLine());
        } catch (Exception e) {
            System.out.println("\n" + "Valitse muutettava tehtävä listasta.");
        }
        muutettavaLista.muutaTekemattomaksi(muutettavaLista.palautaKaikkiTehtavatStringina().get(komento - 1));
    }

}
