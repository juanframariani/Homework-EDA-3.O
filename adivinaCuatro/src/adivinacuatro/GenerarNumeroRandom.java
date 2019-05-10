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
public class GenerarNumeroRandom {


//genera una cadena aleatoria de 1 a 10 cifras, sin repetir
static String generarNumero(int length){
    
            String numeroGenerado = "";
            int random;
            
            if (length > 10) {
                System.out.println("El numero no puede ser de mas de 10 cifras, ingrese otro número");
                Scanner numero = new Scanner(System.in);
                length = numero.nextInt();
            }
            
            while(true){
                random  = (int) ((Math.random() * (10 )));
                if(numeroGenerado.length() == 0 && random == 0){    //para que el número no comience con 0 (cero)
                    random+=1;
                    numeroGenerado+=random;
                }
                else if(!numeroGenerado.contains(Integer.toString(random))){         //si el numero no esta repetido, lo agrega al número generado
                    numeroGenerado+=Integer.toString(random);
                }
                if(numeroGenerado.length()>=length){    //cuando genera los 4 digitios
                    break;
                }
            }

            return numeroGenerado;
        }
}
