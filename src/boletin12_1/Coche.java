/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

import java.util.Date;

/**
 *
 * @author klemavilanova
 */
public class Coche {
    private String matricula;
    private Date hentrada;

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getHentrada() {
        return hentrada;
    }

    public void setHentrada(Date hentrada) {
        this.hentrada = hentrada;
    }
    
}
