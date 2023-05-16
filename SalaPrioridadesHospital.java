package Ejercisios;
import java.util.PriorityQueue;
import java.util.Scanner;

//cd Documents/JAVA/Estructura_de_Datos

//Definimos una subclase que contenga el comparable
// para comparar los niveles de prrioridad
 class Paciente implements Comparable<Paciente> {
   //Atributos privados
    private String nombre;
    private int gravedad;
    //Metodo setters
    public Paciente(String nombre, int gravedad) {
        this.nombre = nombre;
        this.gravedad = gravedad;
    }
    //Metodos getters
    public String getNombre() {
        return nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    //Sobreescritura
    @Override
    public int compareTo(Paciente otroPaciente) {
        // Comparar por gravedad (mayor gravedad tiene mayor prioridad)
        return Integer.compare(otroPaciente.getGravedad(), this.gravedad);
    }
}


public class SalaPrioridadesHospital {

    public static PriorityQueue<Paciente> salaDePrioridades = new PriorityQueue<Paciente>();

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la sala de prioridades del hospital.");

        while (true) {
            System.out.println("Ingrese el nombre del paciente (o 'salir' para terminar):");
            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingrese la gravedad de la condición del paciente (un número entero):");
            int gravedad = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada

            Paciente paciente = new Paciente(nombre, gravedad);
            salaDePrioridades.add(paciente);
        }

        System.out.println("Pacientes en la sala de prioridades:");
        //Mientras que la cola no este vacia entonces:
        while (!salaDePrioridades.isEmpty()) {
            Paciente pacientePrioritario = salaDePrioridades.poll();
            System.out.println("Atendiendo a: " + pacientePrioritario.getNombre());
        }

        System.out.println("Todos los pacientes han sido atendidos. ¡Gracias!");

        sc.close();
    }
}
