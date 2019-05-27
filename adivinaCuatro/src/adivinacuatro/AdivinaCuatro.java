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
    
        int opcion = 0;
        
        Scanner entrada = new Scanner(System.in);
            
    while(opcion != 3) {
        System.out.println("Ingrese como desea jugar" +
        "\n 1- Adivine un número generado por el ordenador"+
        "\n 2- Ingrese un número para que el ordenador adivine"+
        "\n 3- Salir");
        
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                adivinaUsuario.adivinador();
                break;
         
            case 2:
                adivinaOrdenador.adivinador();
                break;
            
            case 3:
                System.out.println("Gracias por jugar");
                break;
            default:
                System.out.println("Opcion Incorrecta.");
        }   
    }   

    }
}
