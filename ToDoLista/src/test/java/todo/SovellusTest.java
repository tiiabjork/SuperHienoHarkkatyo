package todo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import todo.Sovellus;

public class SovellusTest {

    ByteArrayOutputStream tulosvirta;

    Sovellus listat;
    ToDoLista lista;

    @Before
    public void setUp() {
        listat = new Sovellus();
        tulosvirta = new ByteArrayOutputStream();
        System.setOut(new PrintStream(tulosvirta));
        lista = new ToDoLista("Testilista");
        lista.lisaaTehtava("Testilisäys");
        lista.lisaaTehtava("Toinen testilisäys");
    }

    @Test
    public void luomisenJalkeenEiOleVielaListoja() {
        assertEquals(listat.palautaListojenMaara(), 0);
    }

    @Test
    public void yhdenListanLisaaminen() {
        listat.uusiLista("Seuraavaan halkoon");
        assertEquals(listat.palautaListojenMaara(), 1);
    }

    @Test
    public void kahdenListanLisaaminen() {
        listat.uusiLista("Seuraavaan halkoon");
        listat.uusiLista("Kotityöt");
        assertEquals(listat.palautaListojenMaara(), 2);
    }

    @Test
    public void yhdenListanLisaysJaPoisto() {
        listat.uusiLista("Seuraavaan halkoon");
        listat.poistaLista("Seuraavaan halkoon");
        assertEquals(listat.palautaListojenMaara(), 0);
    }

    @Test
    public void kahdenListanLisaysJaYhdenPoisto() {
        listat.uusiLista("Seuraavaan halkoon");
        listat.uusiLista("Kotityöt");
        listat.poistaLista("Seuraavaan halkoon");
        assertEquals(listat.palautaListojenMaara(), 1);
    }

    @Test
    public void eiOleListojaMitaPoistaa() {
        listat.poistaLista("Seuraavaan halkoon");
        String tuloste = tulosvirta.toString();
        assertTrue(tuloste.contains("Ei ole mitään poistettavaa"));
    }
    
    @Test
    public void valmiinListanLisays() {
        listat.lisaaLista(lista);
        assertEquals(listat.palautaListojenMaara(), 1);
    }
    
    @Test
    public void listanTulostusTekemattomillaTehtavilla() {
        listat.lisaaLista(lista);
        listat.tulostaListanSisalto(lista);
        String tuloste = tulosvirta.toString();
        assertTrue(tuloste.contains("Testilista"));
        assertTrue(tuloste.contains(""));
        assertTrue(tuloste.contains("Tekemättömät tehtävät:"));
        assertTrue(tuloste.contains("   Testilisäys"));
        assertTrue(tuloste.contains("   Toinen testilisäys"));
        
    }   
        @Test
        public void listanTulostusTehdyillaTehtavilla() {
            
        listat.lisaaLista(lista);
        lista.muutaTehdyksi("Testilisäys");
        listat.tulostaListanSisalto(lista);
        String tuloste = tulosvirta.toString();
        assertTrue(tuloste.contains("Testilista"));
        assertTrue(tuloste.contains(""));
        assertTrue(tuloste.contains("Tekemättömät tehtävät:"));
        assertTrue(tuloste.contains("   Toinen testilisäys"));
        assertTrue(tuloste.contains("Tehdyt tehtävät:"));
        assertTrue(tuloste.contains("   Testilisäys"));
    }
    
    @Test
    public void listojenPalautus() {
        listat.lisaaLista(lista);
        assertEquals(listat.palautaListat().size(), 1);
    }
    
    @Test
    public void palautaTiettyLista() {
        listat.lisaaLista(lista);
        assertEquals(listat.palautaLista("Testilista").palautaListanNimi(), "Testilista");     
    }
    
    @Test
    public void eiOleListojaJoitaPalauttaa() {
        assertEquals(listat.palautaLista("Testilista"), null);
    }
    
    @Test
    public void tulostaKaikkiListojenSisallot() {
        listat.lisaaLista(lista);
        listat.lisaaLista(new ToDoLista("Tyhjälista"));
        listat.tulostaKaikkienListojenSisalto();
        
        String tuloste = tulosvirta.toString();
        
        assertTrue(tuloste.contains("Tekemättömät tehtävät:"));
        assertTrue(tuloste.contains("   Testilisäys"));
        assertTrue(tuloste.contains("   Toinen testilisäys"));
        assertTrue(tuloste.contains("Sinulla ei ole tehtyjä tehtäviä!"));
        assertTrue(tuloste.contains("Sinulla ei ole tekemättömiä tehtäviä!"));
    }
    
    @Test
    public void palauttaaEtsittavanListan() {
        listat.lisaaLista(lista);
        listat.lisaaLista(new ToDoLista("Tyhjälista"));
        
        assertEquals(listat.palautaLista(lista).palautaListanNimi(), "Testilista");
    }
    
    @Test
    public void palauttaaNullinJosListaaEiLoydy() {
        listat.lisaaLista(lista);
        ToDoLista listuli = new ToDoLista("Tätä ei löydy sovelluksen listasta");
        assertEquals(listat.palautaLista(listuli), null);
    }
    
    @Test
    public void yritaPoistaaListaTyhjasta() {
        assertEquals(listat.palautaListojenMaara(), 0);
        listat.poistaLista("Kotityöt");
        assertEquals(listat.palautaListojenMaara(), 0);
    }
    
    @Test
    public void poistaLista() {
        listat.lisaaLista(lista);
        listat.poistaLista(lista);
        assertEquals(listat.palautaListojenMaara(), 0);
    }
    
}
