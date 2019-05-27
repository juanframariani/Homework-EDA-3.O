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

    static void adivinador() {

        Scanner entrada = new Scanner(System.in);
        int[] aciertos = new int[300];
        int[] regular = new int[300];
        int contador = 0;
        int numeroGeneradoEntero;
        int numeroGeneradoEnteroAux;
        String numeroGeneradoAux = "";

        String[] numeroGenerado = new String[300];
        //numeroGenerado[0] = "7234";
        numeroGenerado[0] = Funciones.generarNumero(4);
        System.out.println("Es el numero: " + numeroGenerado[contador] + " ?");

        numeroGeneradoEntero = Integer.parseInt(numeroGenerado[contador]);

        System.out.println("Bien: ");
        aciertos[contador] = entrada.nextInt();
        System.out.println("Regular: ");
        regular[contador] = entrada.nextInt();

        while (true) {

            numeroGeneradoEntero++;
            if (numeroGeneradoEntero > 9876) {
                numeroGeneradoEntero = 1234;
            }
            numeroGeneradoAux = Integer.toString(numeroGeneradoEntero);
            System.out.println(numeroGeneradoAux);
            if (Funciones.validarNumeroOrdenador(numeroGeneradoAux)) {
                
                //bucle for anidado para revisar los aciertos
                for (int i = 0; i < numeroGeneradoAux.length(); i++) {
                    for (int j = 0; j < numeroGeneradoAux.length(); j++) {
                        if (numeroGeneradoAux.charAt(i) == numeroGenerado[contador].charAt(j) && (i == j)) {
                            aciertos[contador + 1]++;

                        } else {
                            regular[contador + 1]++;

                        }

                    }
                }
                if (aciertos[contador] != aciertos[contador + 1] && regular[contador] != regular[contador + 1]) {
                    aciertos[contador + 1] = 0;
                    regular[contador + 1] = 0;
                } else {

                    contador++;
                   boolean flag = true ;
                        
                    if (contador > 1) {
                        
                        flag = comparaAnteriores(contador, aciertos, regular, numeroGenerado, numeroGeneradoAux);
                        if (!flag) {
                            contador--;
                        }
                    
                    }
                    if (flag) {
                        numeroGenerado[contador] = numeroGeneradoAux;
                        System.out.println(numeroGenerado[contador]);
                            System.out.println("Bien: ");
                            aciertos[contador] = entrada.nextInt();
                            System.out.println("Regular: ");
                            regular[contador] = entrada.nextInt();
                    }
                        

                }
            }
            if (aciertos[contador] == 4) {
                System.out.println("Adivinaste");
                break;
            }
            //  break;
        }

        //numeroGeneradoAux = adivinarNumero(numeroGenerado, aciertos, regular);
        System.out.println(numeroGenerado[contador]);
        System.out.println(numeroGeneradoAux);
    }

    public static boolean comparaAnteriores(int contador,int[] acierto, int[] regular,String[] numeros,String numero){
    boolean result = true;
    int[] aciertos = new int[300];
    int[] regulares = new int [300];
            for (int i = 0; i < contador; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (numero.charAt(j) == numeros[i].charAt(k) && (j == k)) {
                            aciertos[i]++;
                            
                        } else if (numero.charAt(j) == numeros[i].charAt(k)) {
                            regulares[i]++;

                        }
                    }
                }
//                System.out.println(numero +" "+numeros[i] + "   Bien : "+aciertos[i] + " Regulares : "+regulares[i]);
//                System.out.println(acierto[i]+"  "+regular[i]);

                if (aciertos[i] != acierto[i] || regulares[i] != regular[i]) {
                    return  false;
                    //break;
                }
                else if(i == contador-1){
                return result;
                }
            }
        
    return result;
    }

}
