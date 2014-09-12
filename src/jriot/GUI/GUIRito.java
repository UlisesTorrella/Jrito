/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jriot.GUI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jriot.main.*;
import jriot.objects.*;

/**
 *
 * @author ulises
 */
public class GUIRito extends javax.swing.JFrame {

    /**
     * Creates new form GUIRito
     */
    Jrito rito = new Jrito();
    public GUIRito() {
        
        initComponents();
        setResizable(false);
        ListaFavoritos.levantarObjetoEntero();
        refreshTable();
        try {
            setFreeChamps();
        } catch (JRiotException ex) {
            Logger.getLogger(GUIRito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameBox = new javax.swing.JTextField();
        regionComboBox = new javax.swing.JComboBox();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFav = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        img4 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img8 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img9 = new javax.swing.JLabel();
        img10 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jrito");

        jLabel1.setText("Buscar");

        nameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxActionPerformed(evt);
            }
        });

        regionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LAS", "NA" }));
        regionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionComboBoxActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tblFav.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Ranking", "KDA"
            }
        ));
        tblFav.setEnabled(false);
        jScrollPane1.setViewportView(tblFav);

        jLabel2.setFont(new java.awt.Font("Open Sans", 3, 14)); // NOI18N
        jLabel2.setText("Favoritos:");

        img4.setText("jLabel6");

        img1.setText("jLabel3");

        img8.setText("jLabel10");

        img2.setText("jLabel4");

        img3.setText("jLabel5");

        img9.setText("jLabel11");

        img10.setText("jLabel12");

        img7.setText("jLabel9");

        img5.setText("jLabel7");

        img6.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img6)
                    .addComponent(img1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(img7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(img2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {img1, img10, img2, img3, img4, img5, img6, img7, img8, img9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(img1)
                    .addComponent(img2)
                    .addComponent(img3)
                    .addComponent(img4)
                    .addComponent(img5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(img6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(img7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(img8)
                        .addComponent(img9)
                        .addComponent(img10)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {img1, img10, img2, img3, img4, img5, img6, img7, img8, img9});

        jLabel3.setFont(new java.awt.Font("Open Sans", 3, 14)); // NOI18N
        jLabel3.setText("Free Week:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(botonBuscar)
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameBoxActionPerformed

    private void regionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_regionComboBoxActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        JRiot lol = new JRiot();
        
        
        switch(regionComboBox.getSelectedIndex()){
            case 0: ApikeyAndRegion.setRegion("las");
                    ApikeyAndRegion.setApiKey("ad5f2333-5eb4-473f-a763-969480587d8c");
                    System.out.println("las po");
                    break;
            case 1: ApikeyAndRegion.setRegion("na");
                    ApikeyAndRegion.setApiKey("c11e451a-032b-4c88-b1d3-49fd4ec5c9f6");
                    System.out.println("na po");
                    break;          
        }
        try {
            lol.setApiKey(ApikeyAndRegion.getApiKey());
            lol.setRegion(ApikeyAndRegion.getRegion());
            lol.getSummoner(nameBox.getText());
            GUIBuscarSumm gui = new GUIBuscarSumm(nameBox.getText(), this);
            gui.setVisible(rootPaneCheckingEnabled);        
        } catch (JRiotException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "El invocador no posee suficientes partidas clasificatorias, o no existe");
            
        }

    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUIRito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRito().setVisible(true);
            }
        });
    }
     public void refreshTable(){


        //Levantamos los datos a cargar
        Favorito[] favoritos = ListaFavoritos.getFavoritos();

        //Creamos el modelo de datos de la tabla.
        DefaultTableModel model = new DefaultTableModel();
         System.out.println("ref");
        model.addColumn("Nombre");
        model.addColumn("Ranking");
        model.addColumn("KDA");

        for (int i = 0; i < favoritos.length; i++) {
            if (favoritos[i] != null) {
                String[] fila = new String[3];
                fila[0] = favoritos[i].getNombre();
                fila[1] = favoritos[i].getRank();
                fila[2] = "" + favoritos[i].getKda();
                model.addRow(fila);
            }
        }
        tblFav.setModel(model);
    }
     
    public void setFreeChamps() throws JRiotException{
        long[] ids = rito.getFreeChampsID();
        jPanel1.setBackground(Color.black);
        for (int i = 0; i < ids.length; i++) {
            ImageIcon icono = new ImageIcon("res/SmallImg/"+ids[i]+"_Web_0.jpg");
            java.awt.Image img = icono.getImage();
            //System.out.println(ids[i]);
            BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);  
            Graphics g = bi.createGraphics();  
            g.drawImage(img, 0, 0, 75, 75, null, null);  
            ImageIcon newIcon = new ImageIcon(bi);
            
            switch(i){
                case 0: img1.setIcon(newIcon);img1.setText("");img1.setIconTextGap(0);break;
                case 1: img2.setIcon(newIcon);img2.setText("");img2.setIconTextGap(0);break;
                case 2: img3.setIcon(newIcon);img3.setText("");img3.setIconTextGap(0);break;
                case 3: img4.setIcon(newIcon);img4.setText("");img4.setIconTextGap(0);break;
                case 4: img5.setIcon(newIcon);img5.setText("");img5.setIconTextGap(0);break;
                case 5: img6.setIcon(newIcon);img6.setText("");img6.setIconTextGap(0);break;
                case 6: img7.setIcon(newIcon);img7.setText("");img7.setIconTextGap(0);break;
                case 7: img8.setIcon(newIcon);img8.setText("");img8.setIconTextGap(0);break;
                case 8: img9.setIcon(newIcon);img9.setText("");img9.setIconTextGap(0);break;
                case 9: img10.setIcon(newIcon);img10.setText("");img10.setIconTextGap(0);break;
            
            }
        }        

            

             
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img10;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameBox;
    private javax.swing.JComboBox regionComboBox;
    private javax.swing.JTable tblFav;
    // End of variables declaration//GEN-END:variables
}
