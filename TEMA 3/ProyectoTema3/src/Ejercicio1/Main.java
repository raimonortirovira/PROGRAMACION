package Ejercicio1

import java.util.Scanner;

public class Main {
    /*
    1. Crea un programa de adivinación de números El programa genera de manera
aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
máximo de 7 intentos. Después de cada intento, indica si el número es mayor
o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
de intentos utilizado; si no, mostrar un aviso de que debe introducir
nuevamente un número.
    1 - Generar un aleatorio entre 1-50
    2 -  7 intentos / repeticiones
    3 - indicar si el número es mayor o menor del elegido
    4 - Mostrar un aviso con el número de intentos utilizado

     */
    public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       int numeroSistema = (int) (Math.random(*50) +1; // 0-0.999999
        int intentos =7;
        int numeroUsuario;
        boolean acierto = false;
        do {
            System.out.println("Indica el numero con el que juegas");
            numeroUsuario = scanner.nextInt();
            if (numeroSistema ==numeroUsuario){
                System.out.println("Has acertado el numero");
                break
            }
            //vas a pedir numero 7max min1
        }while (intentos>0);
    }
}
