package Ejercisios;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Prom_Cola {

    public Queue<Float> cola_prom = new LinkedList<Float>();
    public static int calificaciones;

    public void PedirDatos(){
        //Usuario crea Datos
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas Calificaciones desea ingresar?");
        calificaciones = sc.nextInt();
        //Genera Datos
        for (int i = 1; i <= calificaciones; i++){
            System.out.println("Ingrese la Calificacion " + i +":");
            cola_prom.add(sc.nextFloat());
        }
        //Imprime Datos con Foreach
        System.out.println("Las claificaciones son: ");
        for (Float float1 : cola_prom) {
            System.out.print(float1 + ", ");
            
        } System.out.println();
        sc.close();

    }

    public static void Promedio(Queue<Float> c){
        //Variable de la suma de los elemntos de la cola
        float sum = 0f;
        //Variable del contador o total de los elemntos de la cola
        int count = 0;
        //Mientras que la cola no este vacia
        while (!c.isEmpty()) {
            //Sacar el primer elemnto de la cola usando poll()
            float num = c.poll();
            //Agregarlo a sum
            sum += num;
            //El contador aumente en cada iteracion del bucle
            count++;
        }
        //Si el total o contador es mayor a 0
        if (count > 0) {
            //Calcular el promedio
            float promedio = sum / count;
            //Imprimir el promedio
            System.out.println("El promedio de la cola es: " + promedio);
            //Si no es asi entonces la cola esta vacia
        } else {
            System.out.println("La cola está vacía");
        }

    }
    
    public static void main(String[] args) {

        //Creacion del Objeto Queue
        Prom_Cola queue = new Prom_Cola();
        //Llamada al metodo generar datos
        queue.PedirDatos();
        //Llamada al metodo promedio
        Prom_Cola.Promedio(queue.cola_prom);

    }

}
