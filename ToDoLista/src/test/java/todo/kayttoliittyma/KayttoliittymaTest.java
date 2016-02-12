package todo.kayttoliittyma;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import todo.kayttoliittyma.Kayttoliittyma;

public class KayttoliittymaTest {

    ByteArrayOutputStream tulosvirta;

    @Before
    public void setUp() {
        tulosvirta = new ByteArrayOutputStream();
        System.setOut(new PrintStream(tulosvirta));
    }

    @Test
    public void kaynnistaessaOhjeetTulostuvat() {
        String syote = muodosta("3");
        Kayttoliittyma kt = new Kayttoliittyma(new Scanner(syote));
        kt.kaynnista();
        String tulos = tulosvirta.toString();
        System.out.println(tulos);
        assertTrue(tulos.contains("Tervetuloa ToDo -Listaan. Valitse toiminto:"));
        assertTrue(tulos.contains("   1. Lisää uusi lista"));
        assertTrue(tulos.contains("   2. Selaa vanhoja listoja"));
        assertTrue(tulos.contains("   3. Lopeta"));
        assertTrue(tulos.contains("Toiminto numero: "));
        assertTrue(tulos.contains("Toivottavasti elämä on handlassa taas hetken. Kiitos ja hei!"));
        assertTrue(tulos.contains("                   *************"));
    }

    @Test
    public void uudenListanLisays() {
        String syote = muodosta("1", "a", "3");

        Kayttoliittyma kt = new Kayttoliittyma(new Scanner(syote));
        kt.kaynnista();

        String tulos = tulosvirta.toString();

        assertTrue(tulos.contains("Uuden listan nimi: "));
        assertTrue(tulos.contains("Uusi lista lisätty. Mitä haluat seuraavaksi tehdä?"));
    }

    @Test
    public void kahdenListanLisays() {
        String syote = muodosta("1", "Avaimet", "1", "Kukkaset", "2", "999", "3");

        Kayttoliittyma kt = new Kayttoliittyma(new Scanner(syote));
        kt.kaynnista();

        String tulos = tulosvirta.toString();

        assertTrue(tulos.contains("Uusi lista lisätty."));
        assertTrue(tulos.contains("   1. Avaimet"));
        assertTrue(tulos.contains("   2. Kukkaset"));       
    }
    
    @Test
    public void listaanYhdenTehtavanLisays() {
        String syote = muodosta("1", "Avaimet", "2", "1", "1", "Teetä lisää avaimia", "4", "3");

        Kayttoliittyma kt = new Kayttoliittyma(new Scanner(syote));
        kt.kaynnista();

        String tulos = tulosvirta.toString();
        assertTrue(tulos.contains("Valitse lista kirjoittamalla sen numero."));
        assertTrue(tulos.contains("Lista numero:"));

        assertTrue(tulos.contains("          **********"));
        assertTrue(tulos.contains("Avaimet"));
        assertTrue(tulos.contains("Tekemättömät tehtävät:"));
        assertTrue(tulos.contains("   1. Teetä lisää avaimia"));
        assertTrue(tulos.contains("Sinulla ei ole tehtyjä tehtäviä."));
    }
    
    @Test
    public void testaaRikkinainenSyotePaaValikossa() {
        String syote = muodosta("666", "3");

        Kayttoliittyma kt = new Kayttoliittyma(new Scanner(syote));
        kt.kaynnista();

        String tulos = tulosvirta.toString();

        assertTrue(tulos.contains("Valitse toiminto numeroiden 1 ja 3 väliltä."));
    }
    
    @Test
    public void testaaRikkinainenSyoteListaValikossa() {
        String syote = muodosta("1", "Testilista 1.0", "2", "10", "999", "3");

        Kayttoliittyma kt = new Kayttoliittyma(new Scanner(syote));
        kt.kaynnista();

        String tulos = tulosvirta.toString();

        assertTrue(tulos.contains("Valitse lista numeroiden 1 ja 1 väliltä."));
    }
    
    @Test
    public void testaaListaValikkoTyhjana() {
        String syote = muodosta("2", "3");

        Kayttoliittyma kt = new Kayttoliittyma(new Scanner(syote));
        kt.kaynnista();

        String tulos = tulosvirta.toString();

        assertTrue(tulos.contains("Ei listoja."));
    }
    
    @Test
    public void testaaMuutaTehdyksi() {
        String syote = muodosta("1", "Avaimet", "2", "1", "1", "kissa", "2", "1", "4", "3");

        Kayttoliittyma kt = new Kayttoliittyma(new Scanner(syote));
        kt.kaynnista();

        String tulos = tulosvirta.toString();

        assertTrue(tulos.contains("Sinulla ei ole tekemättömiä tehtäviä!"));
        assertTrue(tulos.contains("Tehdyt tehtävät:"));
        assertTrue(tulos.contains("   1. kissa"));
        
        
    }

    private String muodosta(String... rivit) {
        String rivitEnterilla = "";
        for (String rivi : rivit) {
            rivitEnterilla += rivi + "\n";
        }
        return rivitEnterilla;
    }

}
