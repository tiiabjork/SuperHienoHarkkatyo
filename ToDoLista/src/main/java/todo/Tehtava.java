
package todo;


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
