package Ejercisios;
import java.util.PriorityQueue;

public class HospitalPriorityQueue {
    public static void main(String[] args) {
        // Crear una cola de prioridad de pacientes
        PriorityQueue<Paciente> pacientes = new PriorityQueue<>();

        // Agregar pacientes a la cola de prioridad
        pacientes.add(new Paciente("Juan", 2));
        pacientes.add(new Paciente("Maria", 1));
        pacientes.add(new Paciente("Pedro", 3));

        // Atender a los pacientes en orden de prioridad
        while (!pacientes.isEmpty()) {
            Paciente paciente = pacientes.poll();
            System.out.println("Atendiendo a " + paciente.getNombre());
        }
    }
}

class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int prioridad;

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.prioridad, otro.prioridad);
    }
}
