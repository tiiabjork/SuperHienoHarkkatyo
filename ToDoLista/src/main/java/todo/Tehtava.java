
package todo;
/**
 * Luokka kuvaa tehtävää ja muuttaa sen ominaisuuksia.
 */
public class Tehtava {
    private String tehtavakuvaus;
    private boolean onkoTehty;
    
    /**
     * Alustetaan uusi Tehtävä-olio, jonka tilaa voi muuttaa tehdyn ja
     * tekemättömyyden välillä.
     * @param tehtavakuvaus Käyttäjän syöttämä tehtävä
     */
    public Tehtava(String tehtavakuvaus) {
        this.tehtavakuvaus = tehtavakuvaus;
        onkoTehty = false;
    }
    
    @Override
    public String toString() {
        return tehtavakuvaus;
    }
    /**
     * Metodi palauttaa kyseisen tehtävän tilan. Onko se tehty vai tekemätön.
     * @return True tai false
     */
    public boolean onkoTehty() {
        return onkoTehty;
    }
    
    /**
     * Metodilla vaihdetaan tehtävän tilaa tehdyksi, eli true:ksi.
     */
    public void merkitaanTehdyksi() {
        onkoTehty = true;
    }
    
    /**
     * Metodilla vaihdetaan tehtävän tilaa tekemättömäksi, eli false:ksi.
     */
    public void merkitaanTekemattomaksi() {
        onkoTehty = false;
    }
    
}
