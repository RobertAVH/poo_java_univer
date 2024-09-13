package prueba;

//import java.util.Scanner;
import persona.Persona;

public class prueba_persona {

    public static void main(String[] args) {
        String nombre = "Roberto";
        String apellido = "Valdez";

        // System.out.print("Cual es tu Nombre:");
        // Scanner consola = new Scanner(System.in);
        // nombre = consola.nextLine();

        // System.out.print("Cual es tu Apellido:");
        // apellido = consola.nextLine();
        // consola.close();

        Persona gerente = new Persona();
        gerente.setNombre(nombre);
        gerente.setApellido(apellido);
        System.out.println("Mi nombre es: " + gerente.getNombre() + " y mi apellido es: " + gerente.getApellido());
    }
}
