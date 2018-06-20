/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Ignacio.Avellaneda
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = {1,4,3,2,6,5};
        System.out.println("Vector original");
        imprimeVector(vector);
        Ordenar(vector);
        System.out.println("Vector ordenado");
        imprimeVector(vector);
        System.out.println(fibonacci(8));
        System.out.println(esPrimo(17));
    }
    /**
     * Ordena un vector usando bubble-sort
     * @param vec vector desordenado
     */
    public static void Ordenar(int[] vec ){
        int n = vec.length;
        int k;
        for (int i = 0; i < n-1; i++){            
            for(int j = 0; j < n-i-1; j++){
                k = j + 1;
                if (vec[j] > vec[k]){
                    intercambia(j, k, vec);
                }
            }
        }
    } 
    private static void intercambia(int j, int k, int[] vec){
        int temp = vec[j];
        vec[j] = vec[k];
        vec[k] = temp;
    }
   
    
    static void imprimeVector(int vec[])
    {       
        for (int i=0; i<vec.length; ++i)
            System.out.print(vec[i] + " ");
        System.out.println();
    }
    
    /**
     * Calcula la serie de fibonacci hasta el numero n
     * @param n limite
     * @return 
     */
    public static int fibonacci(int n)  {
        switch(n){
            case 0: return 0;
            case 1: return 1;
            default: return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    /**
     * Determina is un numero es o no primo
     * @param n numero a chequear
     * @return 
     */
    private static boolean esPrimo(int n) {
        if (n <= 1)
            return false;
        else if (n <= 3)
            return true;
        else if ((n % 2 == 0) || (n % 3 == 0)){
            return false;
        }
        int i = 5;
        while ((i * i) <= n) {
            if ((n % i == 0) || (n % (i + 2) == 0))
                return false;
        i += 6;
        }
        return true;
    }
             
}
