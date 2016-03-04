package todo;

import todo.grafiikka.GrafiikkaUI;

public class Main {

    public static void main(String[] args) {        
        Sovellus sove = new Sovellus();

        GrafiikkaUI ikkuna = new GrafiikkaUI(sove);
        ikkuna.setVisible(true);      
    }

}
