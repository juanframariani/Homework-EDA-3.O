/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinacuatro;

import java.util.Scanner;

/**
 *
 * @author sanfrarow
 */
public class adivinaOrdenador {
    
static void adivinador(){
        Scanner entrada = new Scanner(System.in);
        int aciertos = 0;
        int regular = 0;
              
       
        System.out.println("Ingrese un numero de 4 cifras para que el sistema lo adivine");
        String cadena = entrada.nextLine();
        
        while(true){
            String numeroGenerado = GenerarNumeroRandom.generarNumero(4);
            
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
