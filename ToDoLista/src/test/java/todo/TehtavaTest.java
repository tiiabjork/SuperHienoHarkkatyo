package todo;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import todo.Tehtava;


public class TehtavaTest {
    
    Tehtava tehtava;
    
    
    @Before
    public void setUp() {
        tehtava = new Tehtava("Pese pyykit.");
    }
    
    @Test
    public void onkoTehtavaAlussaTekematon() {
        assertTrue(!tehtava.onkoTehty());
    }
    
    @Test
    public void asetetaanTehtavaTehdyksi() {
        tehtava.merkitaanTehdyksi();
        assertTrue(tehtava.onkoTehty());
    }
    
    @Test
    public void tehtavaTehdyksiJaSenJalkeenTekemattomaksi() {
        tehtava.merkitaanTehdyksi();
        tehtava.merkitaanTekemattomaksi();
        assertTrue(!tehtava.onkoTehty());
    }

    @Test
    public void mitaToStringPalauttaa() {
        assertEquals("Pese pyykit." , tehtava.toString());
    }
}
