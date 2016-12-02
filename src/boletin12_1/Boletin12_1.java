/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

/**
 *
 * @author klemavilanova
 */
public class Boletin12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garaxe g1 = new Garaxe();
        Coche c1 = new Coche("hjagskdgk");
        g1.aparcar(c1);
        g1.salirGaraxe(c1);
    }
    
}
