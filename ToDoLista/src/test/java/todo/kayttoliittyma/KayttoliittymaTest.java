
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
        Kayttoliittyma kt = new Kayttoliittyma(new Scanner("1"));
        kt.kaynnista();
        String tulos = tulosvirta.toString();
        
        assertTrue(tulos.contains("   1. Lisää uusi lista"));
        assertTrue(tulos.contains("   2. Selaa vanhoja listoja"));
        assertTrue(tulos.contains("   3. Lopeta"));
        assertTrue(tulos.contains("Toiminto numero: "));
    }
    
    @Test
    public void uudenListanLisays() {
        String syote = muodosta("1");
        
        Kayttoliittyma kt = new Kayttoliittyma(new Scanner(syote));
        kt.kaynnista();
        
        String tulos = tulosvirta.toString();
        
        assertTrue(tulos.contains("Uuden listan nimi: "));
    }
    
    @Test
    public void kahdenListanLisays() {
        String syote = muodosta("1", "Avaimet", "1", "Kukkaset");
        
        Kayttoliittyma kt = new Kayttoliittyma(new Scanner(syote));
        kt.kaynnista();
        
        String tulos = tulosvirta.toString();
        
        assertTrue(tulos.contains("Uusi lista lisätty."));
//        assertTrue(tulos.contains("   1. Avaimet"));
//        assertTrue(tulos.contains("   2. Kukkaset"));
    }
    
    private String muodosta(String... rivit) {
        String rivitEnterilla = "";
        for (String rivi : rivit) {
            rivitEnterilla += rivi + "\n";
        }
        return rivitEnterilla;
    }
    
}
