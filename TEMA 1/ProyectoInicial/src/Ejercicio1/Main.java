package Ejercicio1;

public class Main {

    // esto es un comentario
    /*
    este comentario
    se puede dividir en
    varias linea de código
     */
    //TODO me falta esto

    public static void main(String[] args){
        System.out.print("Primer programa en Java\n");
        String miNombre = "Borja"; // null

        final String DNI = "23423434";
        Double alturaCompleja = 21.76;

        // **ERROR CORREGIDO 1:** La línea 'double altura 1.71;' fue eliminada.
        // La eliminé para evitar la duplicación de la variable 'altura' más abajo

        char letraDNI = 'L';
        int edad = 41;

        // ÚNICA DECLARACIÓN DE ALTURA: Eliminada la duplicación de la línea 22 original
        double altura = 1.71234234234234;

        float peso = 70.76f;
        Boolean experienciaCompleja = false;
        boolean experiencia = true;

        // **ERROR CORREGIDO 2:** ¡Faltaban puntos y coma (;) al final de todas estas líneas!
        edad= 23;
        edad++;
        letraDNI = 109;
        miNombre = "Borja Martin Herrera";
        altura = 1.75;
        peso = 67.5f;
        experiencia = false;

        // **********************
        // IMPRESIONES
        // **********************

        System.out.println("Mi nombre es "+miNombre);
        System.out.println("La letra de mi dni es =" + letraDNI);
        System.out.println("Mi edad es " + edad);
        System.out.println("Mi altura es de "+altura + " cm");
        System.out.println("Mi peso es de "+peso + " kg");
        System.out.println("Mi experiencia es: "+experiencia);
        System.out.println("Mi DNI es:" + DNI);
        System.out.println("El valor del numero Pi es " +Math.PI );
        System.out.println("El valor del numero E " +Math.E);
        System.out.println("El valor maximo de un int es " +Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int es " +Integer.MIN_VALUE);
    }


    public void nombreMetodo() {
        int edadMetodo = 12;
        System.out.println(edadMetodo);
    }
}