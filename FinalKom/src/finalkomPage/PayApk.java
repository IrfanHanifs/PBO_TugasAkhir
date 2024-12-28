/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalkomPage;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class PayApk extends javax.swing.JFrame {

    /**
     * Creates new form PayApk
     */
    public PayApk() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        But_Tot = new javax.swing.JButton();
        Hasil_Tot = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Input_Nominal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        metod_Pembayaran = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Jml_RT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jml_Brow = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Jml_Cup = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Jml_Don = new javax.swing.JTextField();
        Button_CetakStruk = new javax.swing.JButton();
        but_BacktoMen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BAKERY");

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("Menu");

        But_Tot.setFont(new java.awt.Font("STXihei", 1, 14)); // NOI18N
        But_Tot.setText("Total Harga");
        But_Tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_TotActionPerformed(evt);
            }
        });

        Hasil_Tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hasil_TotActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("Nominal Pembayaran");

        Input_Nominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_NominalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("Metode Pembayaran");

        metod_Pembayaran.setFont(new java.awt.Font("STXihei", 1, 14)); // NOI18N
        metod_Pembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Qris", "Gopay", "ShopeePay", "Credit Card", "Debit Card", " ", " " }));
        metod_Pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metod_PembayaranActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 14)); // NOI18N
        jLabel5.setText("Roti Tawar - Rp 8.000");

        Jml_RT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jml_RTActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 12)); // NOI18N
        jLabel6.setText("Jumlah :");

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 14)); // NOI18N
        jLabel7.setText("Brownis - Rp 12.000");

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 12)); // NOI18N
        jLabel8.setText("Jumlah :");

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 14)); // NOI18N
        jLabel9.setText("Cupcake - Rp 8.000");

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 12)); // NOI18N
        jLabel10.setText("Jumlah :");

        Jml_Cup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jml_CupActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("STXihei", 1, 14)); // NOI18N
        jLabel11.setText("Donat - Rp 6.000");

        jLabel12.setFont(new java.awt.Font("STXihei", 1, 12)); // NOI18N
        jLabel12.setText("Jumlah :");

        Jml_Don.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jml_DonActionPerformed(evt);
            }
        });

        Button_CetakStruk.setFont(new java.awt.Font("STXihei", 1, 16)); // NOI18N
        Button_CetakStruk.setText("Cetak Struk");
        Button_CetakStruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CetakStrukActionPerformed(evt);
            }
        });

        but_BacktoMen.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        but_BacktoMen.setText("Kembali");
        but_BacktoMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_BacktoMenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(but_BacktoMen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jml_Don))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jml_RT))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jml_Brow))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jml_Cup))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(But_Tot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hasil_Tot)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Input_Nominal)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(metod_Pembayaran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_CetakStruk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(but_BacktoMen)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jml_RT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(But_Tot, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hasil_Tot, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jml_Brow, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jml_Cup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jml_Don, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Input_Nominal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(metod_Pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Button_CetakStruk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Hasil_TotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hasil_TotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hasil_TotActionPerformed

    private void Input_NominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_NominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_NominalActionPerformed

    private void Jml_RTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jml_RTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jml_RTActionPerformed

    private void But_TotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_TotActionPerformed
        int hargaRT = Integer.parseInt(Jml_RT.getText())* 8000;
        int hargaBrow = Integer.parseInt(Jml_Brow.getText())* 12000;
        int hargaCup = Integer.parseInt(Jml_Cup.getText())* 8000;
        int hargaDon = Integer.parseInt(Jml_Don.getText())* 6000;
        int total = hargaRT + hargaBrow + hargaCup + hargaDon;
        Hasil_Tot.setText(String.valueOf(total));
    }//GEN-LAST:event_But_TotActionPerformed

    private void Jml_CupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jml_CupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jml_CupActionPerformed

    private void Jml_DonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jml_DonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jml_DonActionPerformed

    private void metod_PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metod_PembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metod_PembayaranActionPerformed

    private void Button_CetakStrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CetakStrukActionPerformed
        int hasilTotal = Integer.parseInt(Hasil_Tot.getText());
        int nominal = Integer.parseInt(Input_Nominal.getText());
        
        if (nominal < hasilTotal){
            JOptionPane.showMessageDialog(null, "Transaksi Gagal!\n" + "Nominal pembayaran kurang dari total harga. ");
        }else {
            int kembalian = nominal - hasilTotal;
            String struk = "Struk Pembayaran\n";
            struk += "Roti Tawar: " + Jml_RT.getText() + " x Rp 8.000\n";
            struk += "Brownis: " + Jml_Brow.getText() + " x Rp 12.000\n";
            struk += "Cupcake: " + Jml_Cup.getText() + " x Rp 8.000\n";
            struk += "Donat: " + Jml_Don.getText() + " x Rp 6.000\n";
            struk += "Total: Rp " + hasilTotal + "\n";
            struk += "Pembayaran Melalui: " + metod_Pembayaran.getSelectedItem() + "\n";
            struk += "Kembalian: Rp " + kembalian;
            JOptionPane.showMessageDialog(null, struk);
        }
    }//GEN-LAST:event_Button_CetakStrukActionPerformed

    private void but_BacktoMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_BacktoMenActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_BacktoMenActionPerformed

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
            java.util.logging.Logger.getLogger(PayApk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayApk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayApk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayApk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayApk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton But_Tot;
    private javax.swing.JButton Button_CetakStruk;
    private javax.swing.JTextField Hasil_Tot;
    private javax.swing.JTextField Input_Nominal;
    private javax.swing.JTextField Jml_Brow;
    private javax.swing.JTextField Jml_Cup;
    private javax.swing.JTextField Jml_Don;
    private javax.swing.JTextField Jml_RT;
    private javax.swing.JButton but_BacktoMen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> metod_Pembayaran;
    // End of variables declaration//GEN-END:variables
}