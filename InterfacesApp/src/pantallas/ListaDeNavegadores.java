package pantallas;

import entidades.Celular;
import entidades.Navegador;
import entidades.SmartTv;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jean Pierre
 */
public class ListaDeNavegadores extends javax.swing.JFrame {

    List<Celular> celulares = new ArrayList<>();
    List<SmartTv> televisores = new ArrayList<>();
    List<Navegador> navegadores = new ArrayList<>();
    DefaultListModel modeloLista = new DefaultListModel();
    
    
    public ListaDeNavegadores() {
        initComponents();
        lstNavegadores.setModel(modeloLista);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstNavegadores = new javax.swing.JList<>();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnAgregarSmartTv = new javax.swing.JButton();
        btnAgregarCelular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstNavegadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstNavegadores);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnAgregarSmartTv.setText("Agegar Smart Tv");
        btnAgregarSmartTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSmartTvActionPerformed(evt);
            }
        });

        btnAgregarCelular.setText("Agregar Celular");
        btnAgregarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addGap(29, 29, 29)
                                .addComponent(btnBuscar))
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarSmartTv)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarCelular)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarSmartTv)
                    .addComponent(btnAgregarCelular))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCelularActionPerformed
        // TODO add your handling code here:
        EditarCelular editar = new EditarCelular(this);
        editar.setLocationRelativeTo(null);
        editar.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAgregarCelularActionPerformed

    private void btnAgregarSmartTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSmartTvActionPerformed
        // TODO add your handling code here:
        EditarSmartTv editar = new EditarSmartTv(this);
        editar.setLocationRelativeTo(null);
        editar.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAgregarSmartTvActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        buscar();
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void buscar() {
        modeloLista.removeAllElements();      
        for(Navegador nav : navegadores){
            if(nav.getNombre().toLowerCase()
                    .contains(txtBuscar.getText().toLowerCase())) {
                modeloLista.addElement(nav.getNombre());
            }
        }
    }

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        buscar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    
    
    void actualizarLista(){
        
        modeloLista.removeAllElements();
        for(Navegador nav : navegadores){
            modeloLista.addElement(nav.getNombre());
            
        }      
    }
    
    
    void setCelular(Celular celular) {
        celulares.add(celular);
        navegadores.add(celular);
        actualizarLista();
    }
          
    void setSmartTv(SmartTv televisor) {
        televisores.add(televisor);
        navegadores.add(televisor);
        actualizarLista();        
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeNavegadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCelular;
    private javax.swing.JButton btnAgregarSmartTv;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNavegadores;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    
}
