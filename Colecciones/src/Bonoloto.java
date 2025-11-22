/*
Realizar el juego del bonoloto
Para ello el sistema contara con dos cadenas de numeros
    - numeros del sistema
    - numeros del usuario
De primeras, el sistema guardará 5 numeros aleatorios entre 1-20
El sistema pedira al usuario que introduzca sus numeros
El sistema deberá decidir si he ganado un premio. Para ello los premios se reparten de la siguiente forma
5 aciertos -> 1 millon de euros
4 aciertos -> 10 mil euros
3 aciertos -> 1000 euros
1-2 ->  10 euros
0 -> prueba suerte la siguiente vez

numeros del sistema -> 9,12,3,5,11
numeros del usuario ->12,9,6,10,3
 */

public class Bonoloto {
    private int[] numerosSistema = new int[5];

    private int[] numerosSistema = new int[5];

    public void generarNumerosSistema (){
        for (int i = 0; i < numerosSistema.length; i++ {
            numerosSistema[i] = (int) (Match.random()*20)+1;

        })
    }
 }
