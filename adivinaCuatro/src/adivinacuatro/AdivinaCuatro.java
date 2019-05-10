/*
* EJERCICIO 1:
* El juego para adivinar un numero de cuatro cifras (que no se repiten) consiste en que el "pensador" 
* piensa un numero de 4 cifras (como "1234" o "9072"). El "adivinador" prueba de adivinar el numero 
* diciendo un numero de 4 cifras y el "pensador" le dice cuantas cifras están en el lugar correcto 
* y cuantas en el lugar incorrecto
*/
package adivinacuatro;


import java.util.Scanner;


/**
 *
 * @author sanfrarow
 */
public class AdivinaCuatro {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //genera un numero random y lo muestra por pantalla.
        //el largo de la cadena se puede especificar. en este caso, dejamos 4 hardcodeado
        String numeroGenerado = GenerarNumeroRandom.generarNumero(4);
        
        System.out.println(numeroGenerado);
       

        
    }
    
}
