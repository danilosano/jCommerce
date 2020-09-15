/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcommerceDAO;

import br.com.jcommerceMODEL.EstadoMODEL;
import br.com.jcommerceMODEL.GeneroMODEL;
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
public class generoDAO {
    private Connection con;
    private PreparedStatement pgsql;
    private Statement st;
    
    public ResultSet listaGenero() 
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
        String sql = "select * from genero";
        
        try{
        st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
        ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void insereGenero(GeneroMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
                String sql = "insert into genero(nomegenero) values (?)";
                System.out.println(gs.getNomeGenero());
        try{
            pgsql = con.prepareStatement(sql);
              pgsql.setString(1, gs.getNomeGenero());
                pgsql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Genero cadastrado com sucesso!");
        }catch(SQLException | HeadlessException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void alterarGenero(GeneroMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
        
        String sql = "update genero set nomegenero=? " + "where codgenero=?";
        System.out.println(gs.getNomeGenero());
        
        try{
              pgsql = con.prepareStatement(sql);
              pgsql.setString(1, gs.getNomeGenero());     
              pgsql.setInt(2, gs.getCodGenero());
                pgsql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Genero alterado com sucesso!");
                
                String res = pgsql.toString();
                System.out.println(res);
        }catch(SQLException | HeadlessException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void excluirGenero(GeneroMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
        String sql = "delete from genero where codgenero=?";
        System.out.println(gs.getCodGenero());
        try
        {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCodGenero());
            pgsql.executeUpdate();
            String res = pgsql.toString();
            System.out.println(res);
            JOptionPane.showMessageDialog(null, "Genero excluido com sucesso!");
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet buscaGenero(GeneroMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre(cb.getNomeBanco("bancoPrincipal")));
        
        String sql = "select * from genero " + "where upper(nomegenero) like upper (?)";
        
        try
        {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, "%" + gs.getNomeGenero() + "%");
            
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
