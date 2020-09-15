/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcommerceDAO;

import br.com.jcommerceMODEL.EstadoMODEL;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno(a)
 */
public class estadoDAO {
    
    private Connection con;
    private PreparedStatement pgsql;
    private Statement st;
    
    public ResultSet listaEstado() 
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
        String sql = "select * from estado";
        
        try{
        st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
        ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void insereEstado(EstadoMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
                String sql = "insert into estado(nomeestado, siglaestado) values (?,?)";
                System.out.println(gs.getNomestado());
        try{
            pgsql = con.prepareStatement(sql);
              pgsql.setString(1, gs.getNomestado());
              pgsql.setString(2, gs.getSiglaestado());             
                pgsql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Estado cadastrado com sucesso!");
        }catch(SQLException | HeadlessException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void alterarEstado(EstadoMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
        
        String sql = "update estado set nomeestado=?, siglaestado=?" + "where codestado=?";
        System.out.println(gs.getNomestado());
        
        try{
              pgsql = con.prepareStatement(sql);
              pgsql.setString(1, gs.getNomestado());
              pgsql.setString(2, gs.getSiglaestado());     
              pgsql.setInt(3, gs.getCodestado());
                pgsql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Estado alterado com sucesso!");
                
                String res = pgsql.toString();
                System.out.println(res);
        }catch(SQLException | HeadlessException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void excluirEstado(EstadoMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
        String sql = "delete from estado where codestado=?";
        System.out.println(gs.getCodestado());
        try
        {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCodestado());
            pgsql.executeUpdate();
            String res = pgsql.toString();
            System.out.println(res);
            JOptionPane.showMessageDialog(null, "Estado excluido com sucesso!");
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet buscaEstado(EstadoMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre(cb.getNomeBanco("bancoPrincipal")));
        
        String sql = "select * from estado " + "where upper(nomeestado) like upper (?)";
        
        try
        {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, "%" + gs.getNomestado() + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            ResultSet rs = st.executeQuery(pgsql.toString());
            return rs;
        } catch (Exception e)
                {
                    System.out.println(e.getMessage());
                    return null;
                }
    }
}
