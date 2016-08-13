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
import java.util.*;

public class RecursividadBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;//Se declaran las variables que se usaran
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Qué número quieres convertir en binario?");//Pregunta
        //al usuario que número quiere convertir a binario
        n = sc.nextInt();//Se guarda el resultado en la variable n
        System.out.println(Binario.Bin(n));//Se imprime lo que se realizó en la
        //clase Binario indicando el método Bin con el valor asignado desde el inicio
        
    }
    
}
