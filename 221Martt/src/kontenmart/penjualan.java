/*sss
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontenmart;

import inc.config;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.text.*;
import java.awt.print.*;
import javax.swing.JTable;

/**
 *
 * @author Aang
 */
public class penjualan extends javax.swing.JInternalFrame {
     Connection con=config.conn();
    Statement st;
    ResultSet rs;
    
    
    
    private void tampil(){
        
        DefaultTableModel modell= new DefaultTableModel();
            modell.addColumn("No");
            modell.addColumn("ID");
            modell.addColumn("Nama");
            modell.addColumn("Harga");
        try{
            String sql = "SELECT * FROM barang";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            int no =0;
            while(rs.next()){
                no++;
                modell.addRow(new Object[]{
                   no, rs.getString("id_barang"), rs.getString("nama_barang"),
                    rs.getString("harga_jual")
                });
            }
            tabel.setModel(modell);
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
    
//    private void reset(){
//        id.setText("");
//        namabrg.setText("");
//        hargabeli.setText("");
//        hargajual.setText("");
//        jumlah.setText("");
//        
//        
//        
//        id.setEditable(false);
//    }
//    
    
    /**
     * Creates new form NewJInternalFrame
     */
    public penjualan() {
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

        tot = new javax.swing.JLabel();
        pencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeelkasir = new javax.swing.JTable();
        la = new javax.swing.JLabel();
        totharga = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        tot.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        tot.setText("221 MART");

        pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pencarianKeyPressed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NO", "ID", "Nama", "Harga"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        tabeelkasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Harga"
            }
        ));
        jScrollPane2.setViewportView(tabeelkasir);

        la.setText("Pencarian");

        totharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tothargaActionPerformed(evt);
            }
        });

        ok.setText("Total Harga");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DAFTAR BELANJAAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(la, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(506, 506, 506)
                .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(ok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totharga, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ok))
                        .addGap(18, 18, 18)
                        .addComponent(print))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(la)))
                            .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pencarianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pencarianKeyPressed
        DefaultTableModel modell= new DefaultTableModel();
            modell.addColumn("No");
            modell.addColumn("ID");
            modell.addColumn("Nama");
            modell.addColumn("Harga");
        try{
            String sql = "SELECT * FROM barang WHERE id_barang LIKE '%"+pencarian.getText()+"%' or nama_barang LIKE '%"+pencarian.getText()+"%' or harga_beli LIKE '%"+pencarian.getText()+"%' or harga_jual LIKE '%"+
                  pencarian.getText()+ "%'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            int no =0;
            while(rs.next()){
                no++;
                modell.addRow(new Object[]{
                   no, rs.getString("id_barang"), rs.getString("nama_barang"),
                    rs.getString("harga_jual")
                });
            }
            tabel.setModel(modell);
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        
    
        // TODO add your handling code here:
    }//GEN-LAST:event_pencarianKeyPressed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
tampil();        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
      TableModel model = tabel.getModel();
      int index[]=tabel.getSelectedRows();
      
      Object[] row = new Object[3];
      DefaultTableModel model2 = (DefaultTableModel) tabeelkasir.getModel();
     
      for(int i=0; i<index.length; i++){
          row[0]=model.getValueAt(index[i], 2); 
          row[1]=model.getValueAt(index[i], 3);
          model2.addRow(row);
      }
      
      
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelMouseClicked

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void tothargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tothargaActionPerformed
       
    }//GEN-LAST:event_tothargaActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
 int total = 0;
        for (int i =0; i< tabeelkasir.getRowCount(); i++){
       int amount = Integer.parseInt(tabeelkasir.getValueAt(i, 1).toString());
       total = total + amount;
}
    totharga.setText(String.valueOf(total));       
    
    }//GEN-LAST:event_okActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("221 Mart");
        MessageFormat er = new MessageFormat("Total Harga :"+totharga.getText().toString());
        try{
            tabeelkasir.print(JTable.PrintMode.NORMAL, header, er);
            System.out.println(totharga.getText().toString());
//            
//        totharga.print(er,footer);
        }catch(java.awt.print.PrinterException e){
            System.err.format("can not print ", e.getMessage());
    }//GEN-LAST:event_printActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel la;
    private javax.swing.JButton ok;
    private javax.swing.JTextField pencarian;
    private javax.swing.JButton print;
    private javax.swing.JTable tabeelkasir;
    private javax.swing.JTable tabel;
    private javax.swing.JLabel tot;
    private javax.swing.JTextField totharga;
    // End of variables declaration//GEN-END:variables
}
