/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcommerceVIEW;

import br.com.jcommerceCTR.EstadoCTR;
import br.com.jcommerceCTR.GeneroCTR;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno(a)
 */
public class PesquisarGeneroVIEW extends javax.swing.JFrame {

    /**
     * Creates new form PesquisarGeneroVIEW
     */
    ResultSet rsRegistros;
    String codEstado;
    public CadastroGeneroVIEW objetocadastro;
    public PesquisarGeneroVIEW() {
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
        txtPesquisaGenero = new javax.swing.JTextField();
        pesquisarGenero = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGenero = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pesquisa:");

        pesquisarGenero.setText("Pesquisar");
        pesquisarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarGeneroActionPerformed(evt);
            }
        });

        tblGenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGeneroMouseClicked(evt);
            }
        });
        tblGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblGeneroKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblGenero);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisarGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtPesquisaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarGenero))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarGeneroActionPerformed
        // TODO add your handling code here:
        acaoBtnBuscar();
    }//GEN-LAST:event_pesquisarGeneroActionPerformed

    private void tblGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGeneroMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2)
        {
            int linha = tblGenero.getSelectedRow();

            objetocadastro.txtCod.setText(String.valueOf(tblGenero.getValueAt(linha, 0)));
            objetocadastro.txtGenero.setText((String)tblGenero.getValueAt(linha, 1));

            dispose();
        }
    }//GEN-LAST:event_tblGeneroMouseClicked

    private void tblGeneroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGeneroKeyPressed
        // TODO add your handling code here:
        int linha = tblGenero.getSelectedRow();

        objetocadastro.txtCod.setText(String.valueOf(tblGenero.getValueAt(linha, 0)));
        objetocadastro.txtGenero.setText((String)tblGenero.getValueAt(linha, 1));

        dispose();
    }//GEN-LAST:event_tblGeneroKeyPressed

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
            java.util.logging.Logger.getLogger(PesquisarGeneroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarGeneroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarGeneroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarGeneroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarGeneroVIEW().setVisible(true);
            }
        });
    }
    
    private void preencheTabela()
    {
        try
        {
            GeneroCTR GeneroCTR = new GeneroCTR();
            ResultSet rsGeneroTabela = GeneroCTR.listaGenero();
            
            String[] todos = {"Código", "Nome Estado"};
            String[][] linhas = {};
            
            DefaultTableModel tableModel = new DefaultTableModel(linhas, todos){
                
                public boolean isCellEditTable(int rowIndex, int mColIndex){ 
                    return false;
                }
            };
            
            Vector<Vector> dados = new Vector<>();
            
            while(rsGeneroTabela.next()){
                
                Vector regVetor = new Vector();
                regVetor.add(rsGeneroTabela.getInt("codgenero"));
                regVetor.add(rsGeneroTabela.getString("nomegenero"));
                
                dados.add(regVetor);
                tableModel.addRow(regVetor);
            }
            
            tblGenero.setModel(tableModel);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void pegaValorSelecionado() 
    {
        codEstado = String.valueOf(tblGenero.getValueAt(tblGenero.getSelectedRow(), 0));
        this.dispose();
    }
    
    public void buscaEstado() 
    {
        GeneroCTR GeneroCTR = new GeneroCTR();
        rsRegistros = GeneroCTR.pesquisarGenero(txtPesquisaGenero.getText());
        preencheTabela();
    }
    
    public void acaoBtnBuscar()
    {
        buscaEstado();
        if (tblGenero.getRowCount() > 0) 
        {
            tblGenero.changeSelection(0, 0, false, false);
        }
        tblGenero.grabFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisarGenero;
    private javax.swing.JTable tblGenero;
    private javax.swing.JTextField txtPesquisaGenero;
    // End of variables declaration//GEN-END:variables
}