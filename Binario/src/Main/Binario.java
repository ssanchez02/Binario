package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sebastián Sanchez
 */
public class Binario {

    public static void main(String[] args) {//Método  main
     int numero = leerNumero();
     mostrar(completar(convertirBinario(numero)));
    }

    public static String convertirBinario(int numero) { //Método que convierte el numero ingresado en binario
        String binario = "";
        while (numero > 0) {
            binario = numero % 2 + binario;
            numero /= 2;
        }
        return binario;
    }

    public static int leerNumero() { //Método que captura el numero
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar un numero entero");
        int numero;
        
        try {
            numero = teclado.nextInt();
            if (numero < 0 || numero > 255) {
                numero = leerNumero();
            }

        } catch (InputMismatchException e) {
            System.out.println("Solo numeros enteros");
            numero=leerNumero();
        }   
      return numero;
    }

  /*  public static int validarNumero(int numero){ //Valida el numero ingresado

        try {
            if (numero < 0 || numero > 255) {
                numero = leerNumero();
            }

        } catch (InputMismatchException e) {
            System.out.println("Solo numeros enteros");
        }
        return numero;
    }
*/

    public static String completar(String numero) {//completa la cadena con ceros a la izquierda
        int diferencia = numero.length();
        if (diferencia < 8) {
            for (int i = 0; i < 8 - diferencia; i++) {
                numero = "0" + numero;
            }
        }
        return numero;

    }

    public static void mostrar(String numero) {
        System.out.println(numero);
    }

}
