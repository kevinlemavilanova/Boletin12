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

    public void salirGaraxe(Coche c1) {
        Date horasalida = new Date();
        float coste = 0;
        double horas = 2 ; 
        
        for (int i = 0;  i < matricula.length; i++) {
            if (matricula[i].getMatricula() == c1.getMatricula() ) {
    //            horas = Math.floor(horasalida.getTime()-(matricula[i].getHentrada().getTime()))/3600000;
                matricula[i] = null;
                break;
            }
        }
        System.out.println("Horas: "+ horas);
        Boolean primeras3 = false;
        while (horas > 0) {
           if (horas >= 3 && primeras3 == false) {
               primeras3 = true;
               coste += 1.5;
               horas-= 3;
           }
           else {
               if (horas >= 1) {
                coste += 0.2;
                horas -=1;                  
               }
           }
        }
        System.out.println("Coste: "+ coste);
    }

}
