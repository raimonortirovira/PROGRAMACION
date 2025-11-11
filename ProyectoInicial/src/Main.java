import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.net.SocketAddress;
import java.sql.SQLOutput;

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

        char letraDNI = 'L';
        int edad = 41;
        double altura = 1.71234234234234;
        float peso = 70.76f;
        boolean experiencia = true;
        edad++;
        edad++;
        letraDNI = 'B';
        letraDNI = 'I';
        miNombre = "Borja Martin Herrera";
        altura = 1.75;
        peso = 67.5f;
        experiencia = false;
        System.out.println("Mi nombre es "+miNombre);
        System.out.println("La letra de mi dni es =" + letraDNI);
        System.out.println("Mi edad es " + edad);
        System.out.println("Mi altura es de "+altura + " cm");
        System.out.println("Mi peso es de "+peso + " kg");
        System.out.println("Mi experiencia es: "+experiencia);

}
}
