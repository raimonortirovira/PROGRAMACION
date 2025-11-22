public class Main {

    public static void main(String[] args) {
        int numero = 2;
        int[] numeros = new int [6];
        // [ , , , , , , ]
        //   0 1 2 3 4 5  -> posiciones
        boolean[] aciertos = new boolean [4];
        // [false, false, false, false]
        String[] palabras = new String [3];
        // [null,null,null]
        Object[] cosas = new Object[5];
        // [1,false,"hola",9.1,'a']
        int[] numerosConcretos = new int[]{5,3,1,10,8};
        // Integer[] numerosConcretos2 = new Integer[]{1,3,4,5,6,7,8};
        boolean aciertosConcretos = new boolean[]{false,true,true};
        String [] palabrasConcretas = new String[]{"hola","programacion","array"};
        Object[] cosasConcretas = new Object[]{1,"hola",false,0.0,'a'};

        // acciones que puedo realizar con los arrays
        // saber la longitud del array -> cuantos elementos hay en el array
        int longi = numerosConcretos.length;
        System.out.println("El numero de elementos del array es "+longi);


    }
}
