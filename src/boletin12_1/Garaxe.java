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
public class Garaxe {

    private int numeroCoches;
    private Coche[] matricula = new Coche[5];

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public void aparcar(Coche c1) {
        if (numeroCoches < 5) {
            System.out.println("Hay sitio");
            numeroCoches++;
            for (int i = 0; i < this.matricula.length - 1; i++) {
                if (this.matricula[i] == null) {
                    Date fechahoy = new Date();
                    c1.setHentrada(fechahoy);
                    this.matricula[i] = c1;
                    break;
                }
            }
        } else {
            System.out.println("No hay sitio");
        }
    }

    public void calcFactura() {

        float coste;

    }

}
