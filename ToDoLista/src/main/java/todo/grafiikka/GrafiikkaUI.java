package todo.grafiikka;

import java.awt.Component;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import todo.Sovellus;
import todo.Tehtava;
import todo.ToDoLista;

public class GrafiikkaUI extends javax.swing.JFrame {

    private Sovellus sove;

    public GrafiikkaUI(Sovellus sove) {
        this.sove = sove;
        initComponents();
//        for (ToDoLista lista : sove.palautaListat()) {
//            listatComboBox.addItem(lista.palautaListanNimi());
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        listatComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tekemattomatList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        muutaTehdyksiButton = new javax.swing.JButton();
        muutaTekemattomaksiButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tehdytList = new javax.swing.JList();
        lisaaTehtavaTextField = new javax.swing.JTextField();
        lisaaTehtavaButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lisaaListaTextField = new javax.swing.JTextField();
        lisaaListaButton = new javax.swing.JButton();
        poistaValittuListaButton = new javax.swing.JButton();
        poistaValittuTehtavaButton = new javax.swing.JButton();
        tallennaMuutoksetButton = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("To Do -Lista");
        jLabel1.setToolTipText("");

        listatComboBox.setToolTipText("");
        listatComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listatComboBoxItemStateChanged(evt);
            }
        });

        jScrollPane1.setToolTipText("");

        jScrollPane1.setViewportView(tekemattomatList);

        jLabel2.setText("Selaa listoja ja valitse tarkasteltava:");
        jLabel2.setToolTipText("");

        muutaTehdyksiButton.setText("Muuta valittu tehtävä tehdyksi");
        muutaTehdyksiButton.setToolTipText("");
        muutaTehdyksiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muutaTehdyksiButtonActionPerformed(evt);
            }
        });

        muutaTekemattomaksiButton.setText("Muuta valittu tehtävä tekemättömäksi");
        muutaTekemattomaksiButton.setToolTipText("");
        muutaTekemattomaksiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muutaTekemattomaksiButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setToolTipText("");

        jScrollPane2.setViewportView(tehdytList);

        lisaaTehtavaTextField.setToolTipText("");
        lisaaTehtavaTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lisaaTehtavaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lisaaTehtavaTextFieldActionPerformed(evt);
            }
        });

        lisaaTehtavaButton.setText("Lisää");
        lisaaTehtavaButton.setToolTipText("");
        lisaaTehtavaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lisaaTehtavaButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Lisää valittuun listaan uusi tehtävä:");
        jLabel3.setToolTipText("");

        jLabel4.setText("Tekemättömät tehtävät");
        jLabel4.setToolTipText("");

        jLabel5.setText("Tehdyt tehtävät");
        jLabel5.setToolTipText("");

        jLabel6.setText("Lisää uusi lista:");
        jLabel6.setToolTipText("");

        lisaaListaTextField.setToolTipText("");
        lisaaListaTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lisaaListaButton.setText("Lisää");
        lisaaListaButton.setToolTipText("");
        lisaaListaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lisaaListaButtonActionPerformed(evt);
            }
        });

        poistaValittuListaButton.setText("Poista valittu lista");
        poistaValittuListaButton.setToolTipText("");
        poistaValittuListaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poistaValittuListaButtonActionPerformed(evt);
            }
        });

        poistaValittuTehtavaButton.setText("Poista valittu tehtävä");
        poistaValittuTehtavaButton.setToolTipText("");
        poistaValittuTehtavaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poistaValittuTehtavaButtonActionPerformed(evt);
            }
        });

        tallennaMuutoksetButton.setText("Tallenna muutokset");
        tallennaMuutoksetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tallennaMuutoksetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(muutaTehdyksiButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lisaaTehtavaTextField)
                                                .addGap(6, 6, 6))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(lisaaTehtavaButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(listatComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(poistaValittuListaButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lisaaListaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lisaaListaButton)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(muutaTekemattomaksiButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(poistaValittuTehtavaButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tallennaMuutoksetButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poistaValittuListaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lisaaListaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lisaaListaButton))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lisaaTehtavaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lisaaTehtavaButton)))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muutaTehdyksiButton)
                    .addComponent(muutaTekemattomaksiButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poistaValittuTehtavaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(tallennaMuutoksetButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void muutaTehdyksiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muutaTehdyksiButtonActionPerformed
        ToDoLista lista = (ToDoLista) sove.palautaLista(listatComboBox.getSelectedItem());
        Tehtava muutettava = (Tehtava) tekemattomatList.getSelectedValue();
        lista.muutaTehdyksi(muutettava.toString());
        paivita(lista);
    }//GEN-LAST:event_muutaTehdyksiButtonActionPerformed

    private void muutaTekemattomaksiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muutaTekemattomaksiButtonActionPerformed
        ToDoLista lista = (ToDoLista) sove.palautaLista(listatComboBox.getSelectedItem());
        Tehtava muutettava = (Tehtava) tehdytList.getSelectedValue();
        lista.muutaTekemattomaksi(muutettava.toString());
        paivita(lista);
    }//GEN-LAST:event_muutaTekemattomaksiButtonActionPerformed

    private void listatComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listatComboBoxItemStateChanged
        if (listatComboBox.getSelectedItem() == null) {
            paivitaTyhjaksi();
            return;
        }
        String tallennetaan = (String) listatComboBox.getSelectedItem();
        ToDoLista lista = sove.palautaLista(tallennetaan);
        paivita(lista);

    }//GEN-LAST:event_listatComboBoxItemStateChanged

    private void lisaaTehtavaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lisaaTehtavaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lisaaTehtavaTextFieldActionPerformed

    private void lisaaTehtavaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lisaaTehtavaButtonActionPerformed
        if (lisaaTehtavaTextField.getText() == "" || lisaaTehtavaTextField.getText().isEmpty()) {
            return;
        }
        String lisattava = (String) lisaaTehtavaTextField.getText();
        ToDoLista lista = (ToDoLista) sove.palautaLista(listatComboBox.getSelectedItem());
        lista.lisaaTehtava(lisattava);
        lisaaTehtavaTextField.setText("");
        paivita(lista);
    }//GEN-LAST:event_lisaaTehtavaButtonActionPerformed

    private void lisaaListaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lisaaListaButtonActionPerformed
        if (lisaaListaTextField.getText() == "" || lisaaListaTextField.getText().isEmpty()) {
            return;
        }
        listatComboBox.setVisible(true);
        String lisattava = (String) lisaaListaTextField.getText();
        ToDoLista uusiLista = new ToDoLista(lisattava);
        sove.lisaaLista(uusiLista);
        lisaaListaTextField.setText("");
        listatComboBox.addItem(uusiLista.palautaListanNimi());
        paivita(uusiLista);
    }//GEN-LAST:event_lisaaListaButtonActionPerformed

    private void poistaValittuTehtavaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poistaValittuTehtavaButtonActionPerformed
        ToDoLista lista = (ToDoLista) sove.palautaLista(listatComboBox.getSelectedItem());
        Tehtava pois = (Tehtava) tehdytList.getSelectedValue();
        lista.poistaTehtava(pois);
        Tehtava poistettava = (Tehtava) tekemattomatList.getSelectedValue();
        lista.poistaTehtava(poistettava);

        paivita(lista);
    }//GEN-LAST:event_poistaValittuTehtavaButtonActionPerformed

    private void poistaValittuListaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poistaValittuListaButtonActionPerformed
        String poistettavaLista = (String) listatComboBox.getSelectedItem();
        ToDoLista lista = sove.palautaLista(poistettavaLista);
        sove.poistaLista(lista);
        listatComboBox.removeItem(poistettavaLista);
    }//GEN-LAST:event_poistaValittuListaButtonActionPerformed

    private void tallennaMuutoksetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tallennaMuutoksetButtonActionPerformed
        
    }//GEN-LAST:event_tallennaMuutoksetButtonActionPerformed
     
    public void paivita(ToDoLista lista) {
        DefaultListModel tehdyt = new DefaultListModel();
        DefaultListModel tekemattomat = new DefaultListModel();
        for (Tehtava duuni : lista.palautaKaikkiTehtavat()) {
            if (duuni.onkoTehty()) {
                tehdyt.addElement(duuni);
            } else {
                tekemattomat.addElement(duuni);
            }
        }
        tehdytList.setModel(tehdyt);
        tekemattomatList.setModel(tekemattomat);

        if (tehdyt.isEmpty()) {
            muutaTekemattomaksiButton.setEnabled(false);
        } else {
            muutaTekemattomaksiButton.setEnabled(true);
        }

        if (tekemattomat.isEmpty()) {
            muutaTehdyksiButton.setEnabled(false);
        } else {
            muutaTehdyksiButton.setEnabled(true);
        }
    }
    
    private void paivitaTyhjaksi() {
        
        DefaultListModel tehdyt = new DefaultListModel();
        DefaultListModel tekemattomat = new DefaultListModel();
        tehdytList.setModel(tehdyt);
        tekemattomatList.setModel(tekemattomat);
        muutaTehdyksiButton.setEnabled(false);
        muutaTekemattomaksiButton.setEnabled(false);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lisaaListaButton;
    private javax.swing.JTextField lisaaListaTextField;
    private javax.swing.JButton lisaaTehtavaButton;
    private javax.swing.JTextField lisaaTehtavaTextField;
    private javax.swing.JComboBox listatComboBox;
    private javax.swing.JButton muutaTehdyksiButton;
    private javax.swing.JButton muutaTekemattomaksiButton;
    private javax.swing.JButton poistaValittuListaButton;
    private javax.swing.JButton poistaValittuTehtavaButton;
    private javax.swing.JButton tallennaMuutoksetButton;
    private javax.swing.JList tehdytList;
    private javax.swing.JList tekemattomatList;
    // End of variables declaration//GEN-END:variables

    
}
