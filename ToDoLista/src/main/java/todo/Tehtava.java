
package todo;
/**
 * Luokka kuvaa tehtävää ja muuttaa sen ominaisuuksia.
 */
public class Tehtava {
    private String tehtavakuvaus;
    private boolean onkoTehty;
    
    public Tehtava(String tehtavauvaus) {
        this.tehtavakuvaus = tehtavauvaus;
        onkoTehty = false;
    }
    
    @Override
    public String toString() {
        return tehtavakuvaus;
    }
    /**
     * Metodi palauttaa kyseisen tehtävän tilan. Onko se tehty vai tekemätön.
     * @return 
     */
    public boolean onkoTehty() {
        return onkoTehty;
    }
    
    public void merkitaanTehdyksi() {
        onkoTehty = true;
    }
    
    public void merkitaanTekemattomaksi() {
        onkoTehty = false;
    }
    
}
