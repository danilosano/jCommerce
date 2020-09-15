/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcommerceDAO;

import br.com.jcommerceMODEL.BovinoMODEL;
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
public class bovinoDAO {
    private Connection con;
    private PreparedStatement pgsql;
    private Statement st;
    
    public ResultSet listaBovino() 
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
        String sql = "select * from bovino";
        
        try{
        st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
        ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void insereBovino(BovinoMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
                String sql = "insert into bovino(nomebovino, raça, peso) values (?,?,?)";
                System.out.println(gs.getNomeBovino());
        try{
            pgsql = con.prepareStatement(sql);
              pgsql.setString(1, gs.getNomeBovino());
              pgsql.setString(2, gs.getRaça());
              pgsql.setInt(3, gs.getPeso());
                pgsql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Bovino cadastrado com sucesso!");
        }catch(SQLException | HeadlessException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void alterarBovino(BovinoMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
        
        String sql = "update bovino set nomebovino=?, raça=?, peso=? " + "where codbovino=?";
        System.out.println(gs.getNomeBovino());
        
        try{
              pgsql = con.prepareStatement(sql);
              pgsql.setString(1, gs.getNomeBovino());     
              pgsql.setString(2, gs.getRaça());   
              pgsql.setInt(3, gs.getPeso());   
              pgsql.setInt(4, gs.getCodBovino());
                pgsql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Bovino alterado com sucesso!");
                
                String res = pgsql.toString();
                System.out.println(res);
        }catch(SQLException | HeadlessException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void excluirBovino(BovinoMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre("bancoPrincipal"));
        String sql = "delete from bovino where codbovino=?";
        System.out.println(gs.getCodBovino());
        try
        {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCodBovino());
            pgsql.executeUpdate();
            String res = pgsql.toString();
            System.out.println(res);
            JOptionPane.showMessageDialog(null, "Bovino excluido com sucesso!");
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet buscaBovino(BovinoMODEL gs)
    {
        conexaoDAO cb = new conexaoDAO();
        con = (cb.conectaPostgre(cb.getNomeBanco("bancoPrincipal")));
        
        String sql = "select * from bovino " + "where upper(nomebovino) like upper (?)";
        
        try
        {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, "%" + gs.getNomeBovino() + "%");
            
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
