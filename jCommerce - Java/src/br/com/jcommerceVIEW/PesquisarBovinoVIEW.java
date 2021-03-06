/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcommerceVIEW;

import br.com.jcommerceCTR.BovinoCTR;
import br.com.jcommerceCTR.EstadoCTR;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno(a)
 */
public class PesquisarBovinoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form PesquisarBovinoVIEW
     */
    ResultSet rsRegistros;
    String codBovino;
    public CadastroBovinoVIEW objetocadastro;
    public PesquisarBovinoVIEW() {
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
        txtPesquisaBovino = new javax.swing.JTextField();
        pesquisarBovino = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBovino = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pesquisa:");

        pesquisarBovino.setText("Pesquisar");
        pesquisarBovino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBovinoActionPerformed(evt);
            }
        });

        tblBovino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBovinoMouseClicked(evt);
            }
        });
        tblBovino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblBovinoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblBovino);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisarBovino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarBovino))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarBovinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBovinoActionPerformed
        // TODO add your handling code here:
        acaoBtnBuscar();
    }//GEN-LAST:event_pesquisarBovinoActionPerformed

    private void tblBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBovinoMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1)
        {
            int linha = tblBovino.getSelectedRow();

            objetocadastro.txtCod.setText(String.valueOf(tblBovino.getValueAt(linha, 0)));
            objetocadastro.txtBovino.setText((String)tblBovino.getValueAt(linha, 1));
            objetocadastro.txtRaça.setText((String)tblBovino.getValueAt(linha, 2));
            objetocadastro.txtPeso.setText(String.valueOf(tblBovino.getValueAt(linha, 3)));

            dispose();
        }
    }//GEN-LAST:event_tblBovinoMouseClicked

    private void tblBovinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBovinoKeyPressed
        // TODO add your handling code here:
        int linha = tblBovino.getSelectedRow();

        objetocadastro.txtCod.setText(String.valueOf(tblBovino.getValueAt(linha, 0)));
        objetocadastro.txtBovino.setText((String)tblBovino.getValueAt(linha, 1));
        objetocadastro.txtRaça.setText((String)tblBovino.getValueAt(linha, 2));
        objetocadastro.txtPeso.setText((String)tblBovino.getValueAt(linha, 3));

        dispose();
    }//GEN-LAST:event_tblBovinoKeyPressed

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
            java.util.logging.Logger.getLogger(PesquisarBovinoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarBovinoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarBovinoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarBovinoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarBovinoVIEW().setVisible(true);
            }
        });
    }
    private void preencheTabela()
    {
        try
        {
            BovinoCTR bovinoCTR = new BovinoCTR();
            ResultSet rsBovinoTabela = bovinoCTR.listaBovino();
            
            String[] todos = {"Código", "Nome Bovino", "Raça", "Peso"};
            String[][] linhas = {};
            
            DefaultTableModel tableModel = new DefaultTableModel(linhas, todos){
                
                public boolean isCellEditTable(int rowIndex, int mColIndex){ 
                    return false;
                }
            };
            
            Vector<Vector> dados = new Vector<>();
            
            while(rsBovinoTabela.next()){
                
                Vector regVetor = new Vector();
                regVetor.add(rsBovinoTabela.getInt("codbovino"));
                regVetor.add(rsBovinoTabela.getString("nomebovino"));
                regVetor.add(rsBovinoTabela.getString("raça"));
                regVetor.add(rsBovinoTabela.getInt("peso"));
                
                dados.add(regVetor);
                tableModel.addRow(regVetor);
            }
            
            tblBovino.setModel(tableModel);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void pegaValorSelecionado() 
    {
        codBovino = String.valueOf(tblBovino.getValueAt(tblBovino.getSelectedRow(), 0));
        this.dispose();
    }
    
    public void buscaEstado() 
    {
        BovinoCTR bovinoCTR = new BovinoCTR();
        rsRegistros = bovinoCTR.pesquisarBovino(txtPesquisaBovino.getText());
        preencheTabela();
    }
    
    public void acaoBtnBuscar()
    {
        buscaEstado();
        if (tblBovino.getRowCount() > 0) 
        {
            tblBovino.changeSelection(0, 0, false, false);
        }
        tblBovino.grabFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisarBovino;
    private javax.swing.JTable tblBovino;
    private javax.swing.JTextField txtPesquisaBovino;
    // End of variables declaration//GEN-END:variables
}
