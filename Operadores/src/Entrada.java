public class Entrada {

    // variables
    int edad = 23; // Variable de instancia

    // metodos

    // El método principal para ejecutar el programa
    public static void main (String [] args){
        // Si desea acceder a 'edad' desde aquí, debe crear una instancia de la clase:
        // Entrada miObjeto = new Entrada();
        // System.out.println("Edad: " + miObjeto.edad);
    }

    // Método que recibe dos parámetros e invoca a metodoDos
    public void nombreMetodo(int numero, int elemento) {
        System.out.println(numero);
        System.out.println(elemento);

        // Llamada al otro método
        metodoDos();
    }


    // Método sin parámetros ni retorno
    public void metodoDos() {
        // Ejemplo de uso de la variable de instancia
        System.out.println("La edad en metodoDos es: " + edad);
    }
}