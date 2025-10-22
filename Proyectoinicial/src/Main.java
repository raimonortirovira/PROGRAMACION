//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //esto es un comentario
    /*este comentario
    se puede dividir en
    varias lineas de codigo
     */
    // TODO me falta esto

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Primer programa en JAVA");
        String miNombre = "Borja"; // null
        char letraDNI = 'A';
        int edad = 41;
        double altura = 1.71;
        float peso = 70.7f;
        boolean experiencia = true;

        letraDNI = 109;
        miNombre = "Borja M. H.";
        altura = 1.75;
        peso = 67.5f;
        experiencia = false;

        System.out.println("Mi nombre es: "+miNombre);
        System.out.println("Mi edad es "+edad+" años");
        System.out.println("La letra de mi dni es "+letraDNI);
        System.out.println("Mi altura es de "+altura+" cm");
        System.out.println("Mi peso es de "+peso+" kg");
        System.out.println("Mi experiencia es: "+experiencia);

    }


    public void nombreMetodo() {

    }
    // TODO esto tambien esta pendiente

}