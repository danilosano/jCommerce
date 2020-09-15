/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcommerceCTR;

import br.com.jcommerceDAO.estadoDAO;
import br.com.jcommerceMODEL.EstadoMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Basket(a)
 */
public class EstadoCTR {
    
    public ResultSet listaEstado()
    {
        estadoDAO estado = new estadoDAO();
        return (estado.listaEstado());
    }
    
    public void insereEstado(String nomeEstado, String siglaEstado)
    {
        EstadoMODEL gs = new EstadoMODEL();
        gs.setNomestado(nomeEstado);
        gs.setSiglaestado(siglaEstado);
        estadoDAO estado = new estadoDAO();
        estado.insereEstado(gs);
        
    }
    
    public void alterarEstado(int codEstado, String nomeEstado, String siglaEstado)
    {
        EstadoMODEL gs = new EstadoMODEL();
        gs.setNomestado(nomeEstado);
        gs.setSiglaestado(siglaEstado);
        gs.setCodestado(codEstado);
        
        estadoDAO estado = new estadoDAO();
        estado.alterarEstado(gs);
    }
    
    public void excluiEstado(int codEstado)
    {
        EstadoMODEL gs = new EstadoMODEL();
        gs.setCodestado(codEstado);
        estadoDAO estado = new estadoDAO();
        estado.excluirEstado(gs);
    }
    
    public ResultSet pesquisarEstado(String nomeEstado) 
    {
        EstadoMODEL gs = new EstadoMODEL();
        gs.setNomestado(nomeEstado);
        
        estadoDAO estadoDAO = new estadoDAO();
        return estadoDAO.buscaEstado(gs);
    }
    
    
}
