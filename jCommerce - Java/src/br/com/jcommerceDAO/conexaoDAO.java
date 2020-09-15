/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcommerceDAO;

import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author Aluno(a)
 */
public class conexaoDAO {
    
    // Informações de conexão
    
    private String caminho = "jdbc:postgresql://localhost:5432/";
    private String usuario = "postgres";
    private String senha = "123456";
    private Connection con = null;
    private String bancoPrincipal = "bancoPrincipal";
    
    public Connection conectaPostgre(String banco)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            try{
            con = DriverManager.getConnection (caminho + banco, usuario, senha);
            }catch (SQLException ex){
                Logger.getLogger(conexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch(ClassNotFoundException ex)
            {
                System.out.println("Classe não encontrada!");
                System.out.println(ex.getMessage());
            }
            return con;
        
    }
    
    public String getNomeBanco(String banco)
    {
        if (banco.equals("bancoPrincipal"))
        {
            return bancoPrincipal;
        } else{
            return null;
        }
    }
    
    
    
}
