//Josué Alexis Ramírez Pérez 513622 A02
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividadbinario;

/**
 *
 * @author josuealexis96
 */
public class Binario {//Se crea una clase para convertir a número binario
    
    public static int Bin (int n){
        if (n < 2){//Caso Base
            System.out.print(n);
            return 0;//El momento en el que el método termina
        }
        else{//Caso recursivo, Dominio, División del problema
            Bin(n/2);//Se divine el número entre dos
            System.out.print(n%2);//Se imprime el residuo de la división del número
            //entre 2
            return 0;//Caso de Recursion, el metodo se esta llamando a si mismo, vuelve a iniciar
        }     
    }
    
}
