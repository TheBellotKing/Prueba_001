/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioud4.pkg1;

/**
 *
 * @author dam1d06
 */
public class NumerosEnteros {
    
    public boolean EsPar(int numero){
        boolean esPar;
        esPar = false;
        if (numero % 2 == 0){
            esPar = true;
        }
        return esPar;
    }
}
