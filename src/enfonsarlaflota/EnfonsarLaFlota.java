/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enfonsarlaflota;

import java.util.*;

/**
 *
 * @author aluadmin
 */
public class EnfonsarLaFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tauler aa = new Tauler();
        Vaixell bb = new Vaixell(Vaixell.tipusvaixell.portaavions);
        
        aa.prueba();
        aa.generarVaixell(4);
        aa.imprimirVaixell();
        
    }
    
}
