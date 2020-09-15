/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcommerceMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Basket(a)
 */
public class EstadoMODEL {
    
    private int codestado;
    private String nomestado;
    private String siglaestado;
    private Connection con;
    private PreparedStatement pgsql;

    /**
     * @return the codestado
     */
    public int getCodestado() {
        return codestado;
    }

    /**
     * @param codestado the codestado to set
     */
    public void setCodestado(int codestado) {
        this.codestado = codestado;
    }

    /**
     * @return the nomestado
     */
    public String getNomestado() {
        return nomestado;
    }

    /**
     * @param nomestado the nomestado to set
     */
    public void setNomestado(String nomestado) {
        this.nomestado = nomestado;
    }

    /**
     * @return the siglaestado
     */
    public String getSiglaestado() {
        return siglaestado;
    }

    /**
     * @param siglaestado the siglaestado to set
     */
    public void setSiglaestado(String siglaestado) {
        this.siglaestado = siglaestado;
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * @return the pgsql
     */
    public PreparedStatement getPgsql() {
        return pgsql;
    }

    /**
     * @param pgsql the pgsql to set
     */
    public void setPgsql(PreparedStatement pgsql) {
        this.pgsql = pgsql;
    }
    
    
}
