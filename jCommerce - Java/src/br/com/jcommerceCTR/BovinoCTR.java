/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcommerceCTR;

import br.com.jcommerceDAO.bovinoDAO;
import br.com.jcommerceMODEL.BovinoMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Aluno(a)
 */
public class BovinoCTR {
    public ResultSet listaBovino()
    {
        bovinoDAO Bovino = new bovinoDAO();
        return (Bovino.listaBovino());
    }
    
    public void insereBovino(String nomeBovino, String raça, int peso)
    {
        BovinoMODEL gs = new BovinoMODEL();
        gs.setNomeBovino(nomeBovino);
        gs.setRaça(raça);
        gs.setPeso(peso);

        bovinoDAO Bovino = new bovinoDAO();
        Bovino.insereBovino(gs);
        
    }
    
    public void alterarBovino(int codBovino, String nomeBovino, String raça, int peso)
    {
        BovinoMODEL gs = new BovinoMODEL();
        gs.setNomeBovino(nomeBovino);
        gs.setCodBovino(codBovino);
        gs.setPeso(peso);
        gs.setRaça(raça);
        
        bovinoDAO Bovino = new bovinoDAO();
        Bovino.alterarBovino(gs);
    }
    
    public void excluiBovino(int codBovino)
    {
        BovinoMODEL gs = new BovinoMODEL();
        gs.setCodBovino(codBovino);
        bovinoDAO Bovino = new bovinoDAO();
        Bovino.excluirBovino(gs);
    }
    
    public ResultSet pesquisarBovino(String nomeBovino) 
    {
        BovinoMODEL gs = new BovinoMODEL();
        gs.setNomeBovino(nomeBovino);
        
        bovinoDAO bovinoDAO = new bovinoDAO();
        return bovinoDAO.buscaBovino(gs);
    }
}
