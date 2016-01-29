package todo;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import todo.ToDoLista;

public class ToDoListaTest {

    ToDoLista lista;

    @Before
    public void setUp() {
        lista = new ToDoLista("Seuraavaan halkoon");
    }

    @Test
    public void mikaListanNimiOn() {
        assertEquals("Seuraavaan halkoon", lista.palautaListanNimi());
    }

    @Test
    public void lisataanTehtava() {
        lista.lisaaTehtava("Avaimet");

        assertEquals(lista.tekemattomiaTehtavia(), 1);
        assertEquals(lista.tehtyjaTehtavia(), 0);
        assertEquals(lista.palautaKaikkiTehtavat().size(), 1);
    }

    @Test
    public void lisataanUseampiTehtava() {
        lista.lisaaTehtava("Avaimet");
        lista.lisaaTehtava("Klusterihengailut");
        lista.lisaaTehtava("Nakkeilu Tekiksen vujuilla");

        assertEquals(lista.tekemattomiaTehtavia(), 3);
        assertEquals(lista.tehtyjaTehtavia(), 0);
        assertEquals(lista.palautaKaikkiTehtavat().size(), 3);
    }

    @Test
    public void listataanTehtavaTehdyksi() {
        lista.lisaaTehtava("Avaimet");
        lista.muutaTehdyksi("Avaimet");

        assertEquals(lista.tekemattomiaTehtavia(), 0);
        assertEquals(lista.tehtyjaTehtavia(), 1);
        assertEquals(lista.palautaKaikkiTehtavat().size(), 1);
    }

    @Test
    public void listataanUseitaTehtaviaTehdyiksi() {
        lista.lisaaTehtava("Avaimet");
        lista.lisaaTehtava("Klusterihengailut");
        lista.lisaaTehtava("Nakkeilu Tekiksen vujuilla");
        
        lista.muutaTehdyksi("Avaimet");
        lista.muutaTehdyksi("Klusterihengailut");
        lista.muutaTehdyksi("Nakkeilu Tekiksen vujuilla");
        
        assertEquals(lista.tekemattomiaTehtavia(), 0);
        assertEquals(lista.tehtyjaTehtavia(), 3);
        assertEquals(lista.palautaKaikkiTehtavat().size(), 3);
    }
    
    @Test
    public void tehdyjaJaTekemattomiaTehtavia() {
        lista.lisaaTehtava("Avaimet");
        lista.lisaaTehtava("Klusterihengailut");
        lista.lisaaTehtava("Nakkeilu Tekiksen vujuilla");
        
        lista.muutaTehdyksi("Avaimet");
        
        lista.lisaaTehtava("Valitkaa edustajat opetuksenkehityksentyöryhmään");
        
        
        assertEquals(lista.tekemattomiaTehtavia(), 3);
        assertEquals(lista.tehtyjaTehtavia(), 1);
        assertEquals(lista.palautaKaikkiTehtavat().size(), 4);
    }

}
