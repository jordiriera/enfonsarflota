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

    
    
    enum tipusvaixell {portaavions, vaixell, llanxa}
    
    int vaixellenfonsat;        
    int [][] posicionsOcupades ;
    boolean [][]posicionsFerides;
    boolean enfonsat = false;
    String triarvaixell;
    int mida;
    
    
        
    
    public void Vaixell(){
        
    }
    
    public void formaVaixells(){
        if (triarvaixell.equals("portaavions")){
            
            posicionsOcupades = new int [5][2];
        }
            if (triarvaixell.equals("vaixell")){
            posicionsOcupades = new int [3][2];
        }
            if (triarvaixell.equals("lanxa")){
                posicionsOcupades = new int [2][2];
            }
    }
    
    
    
    public void posicionsFerides(int x, int y){
        posicionsFerides [x][y] = true;
    }
    
       public void enfonsat(){
            
           enfonsat = true;
            
        }
        
}

