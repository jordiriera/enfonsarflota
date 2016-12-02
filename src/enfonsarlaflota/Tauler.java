/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enfonsarlaflota;

/**
 *
 * @author aluadmin
 */
public class Tauler {

    

    int[][] tauler = new int[10][10];

    
    //imprimir tabuler amb 0 (esta malament)
    public void prueba(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                tauler[i][j] = 0;
                System.out.print(tauler[i][j] + " ");
            }
            System.out.println();
        }
    }

}
