 //-------------------------------------------------------------------------------------------
 // Objeto del programa: Programa que pregunta por un número y dice si es par o impar.
 // Autor: Alessandro Cardin Feijoo
 // Fecha: 17/01/2018
 //-------------------------------------------------------------------------------------------
package ejercicioud4.pkg1;


public class EjercicioUD41 {


    public static void main(String[] args) {
        
        // Declaramos las variables
        int numero;
        boolean esPar;
        
        NumerosEnteros objNE = new NumerosEnteros();
        Teclado objTeclado = new Teclado();
        
        System.out.println("Introduce un número");
        numero = objTeclado.entero(); 
        esPar = objNE.EsPar(numero);
        
        if (esPar == true){
            System.out.println("El numero " + numero + " es par." );
        }
        else{
            System.out.println("El numero " + numero + " es impar." );
        }
    }
    
}
