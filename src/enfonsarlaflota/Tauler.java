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

    int fila, col;

    int[][] tauler = new int[10][10];
    boolean jaOcupat = false;

    //imprimir tabuler amb 0 (esta malament)
    public void prueba() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                tauler[x][y] = 0;
                System.out.print(tauler[x][y] + " ");
            }
 
            System.out.println();
        }
    }

    public void generarVaixell(int mida) {

        do {
            Vaixell.fila = (int) (10 * Math.random());
            Vaixell.col = (int) ((10 - mida) * Math.random());
        } while (!posicioValida(fila, col, mida));
    }

    public boolean posicioValida(int filaDesti, int colDesti, int mida) {

        for (int r = 0; r < mida; r++) {
            if (tauler[filaDesti][colDesti + r] != 1) {
                jaOcupat = true;
                break;
            }
        }
        return jaOcupat;
    }
    
    public void imprimirVaixell(){
  
        
        
    }
        
        
        
        /*
        if (tauler[x][y] = jaOcupat ){
            
            System.out.println("X");
        }
*/
    }
    
    
    
    

