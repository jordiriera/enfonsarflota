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
public class Vaixell {

    enum tipusvaixell {
        portaavions, vaixell, llanxa
    }

    int vaixellenfonsat;
    int[][] posicionsOcupades;
    boolean[][] posicionsFerides;
    boolean enfonsat = false;
    //  String triarvaixell;
    int mida;
    
    static int fila, col;

    public Vaixell(tipusvaixell tria) {
        if (tria.equals("portaavions")) {
            mida = 5;
            posicionsOcupades = new int[5][2];
        }
        if (tria.equals("vaixell")) {
            posicionsOcupades = new int[3][2];
            mida = 3;
        }
        if (tria.equals("lanxa")) {
            posicionsOcupades = new int[2][2];
            mida = 2;
        }
    }

    public void posicionsFerides(int x, int y) {
        posicionsFerides[x][y] = true;
    }

    public void enfonsat() {

        enfonsat = true;
    }

}


