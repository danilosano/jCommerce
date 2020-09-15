/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcommerceCTR;

import br.com.jcommerceDAO.estadoDAO;
import br.com.jcommerceDAO.generoDAO;
import br.com.jcommerceMODEL.EstadoMODEL;
import br.com.jcommerceMODEL.GeneroMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Aluno(a)
 */
public class GeneroCTR {
    
    public ResultSet listaGenero()
    {
        generoDAO Genero = new generoDAO();
        return (Genero.listaGenero());
    }
    
    public void insereGenero(String nomeGenero)
    {
        GeneroMODEL gs = new GeneroMODEL();
        gs.setNomeGenero(nomeGenero);
        generoDAO Genero = new generoDAO();
        Genero.insereGenero(gs);
        
    }
    
    public void alterarGenero(int codGenero, String nomeGenero)
    {
        GeneroMODEL gs = new GeneroMODEL();
        gs.setNomeGenero(nomeGenero);
        gs.setCodGenero(codGenero);
        
        generoDAO Genero = new generoDAO();
        Genero.alterarGenero(gs);
    }
    
    public void excluiGenero(int codGenero)
    {
        GeneroMODEL gs = new GeneroMODEL();
        gs.setCodGenero(codGenero);
        generoDAO genero = new generoDAO();
        genero.excluirGenero(gs);
    }
    
    public ResultSet pesquisarGenero(String nomeGenero) 
    {
        GeneroMODEL gs = new GeneroMODEL();
        gs.setNomeGenero(nomeGenero);
        
        generoDAO GeneroDAO = new generoDAO();
        return GeneroDAO.buscaGenero(gs);
    }
}
