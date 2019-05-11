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
        int aciertos = 0;
        int regular = 0;
        
        //genera un numero random y lo muestra por pantalla.
        //el largo de la cadena se puede especificar. en este caso, dejamos 4 hardcodeado
        String numeroGenerado = GenerarNumeroRandom.generarNumero(4);
        
        //Muestra el numero generado solo para probar -- ELIMINAR DESPUES
        System.out.println(numeroGenerado);
       
        System.out.println("Ingrese un numero de 4 cifras");
        
        while(true){
            
            String cadena = entrada.nextLine();
            
            //bucle for anidado para revisar los aciertos
            for (int i = 0; i < cadena.length(); i++) {
                for (int j = 0; j < cadena.length(); j++) {
                    if (cadena.charAt(i) == numeroGenerado.charAt(j) && (i == j)) {
                        aciertos++;
                    }
                }
            }
            //bucle for para revisar si el numero esta contenido pero en distinta posicion
            for (int i = 0; i < cadena.length(); i++) {
                if (numeroGenerado.indexOf(cadena.charAt(i)) != -1 && !(cadena.charAt(i) == numeroGenerado.charAt(i))) {
                        regular++;
                }
            }
            
            if (cadena.equals(numeroGenerado)) {
                System.out.println("ADIVINO");
                break;
            } else {
                System.out.println("Aciertos: " + aciertos + " - Regular: " + regular);
                System.out.println("Vuelva a intentar:");
                aciertos = 0;
                regular = 0;
            } 
        }  
        
    }    
}
