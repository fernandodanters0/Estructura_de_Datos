package Ejercisios;

//importamos las librerias correspondientes
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Menu_Colas {
    // Atributos publicos
    public static int num;
    static Scanner b = new Scanner(System.in);
    public static boolean salir = false;
    public static int pos;
    public static String element;
    public Queue<String> cola = new LinkedList<>();

    public static void main(String[] args) {
        // Objeto obj de la clase Menu_Colas
        Menu_Colas obj = new Menu_Colas();
        // Llamando al metodo Datos
        obj.Datos(obj.cola);

        while (!salir) {

            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------MENU DE COLAS-----------------------");
            System.out.println("1.- Agregar al inicio de una cola");
            System.out.println("2.- Agregar al final de una cola");
            System.out.println("3.- Agregar en una posicion especifica");
            System.out.println("4.- Eliminar al inicio");
            System.out.println("5.- Eliminar al final");
            System.out.println("6.- Eliminar en una posicion especifica");
            System.out.println("7.- Imprimir de inicio a fin");
            System.out.println("8.- Imprimir de Fin a Inicio");
            System.out.println("9.- Escribe (salir) para terminar.");

            System.out.println("\nSelecciona una opcion: ");
            int opcion = b.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Usted ha seleccionado la opcion 1: Agregar al inicio de la cola");
                    Menu_Colas.a_inicio(obj.cola);
                    break;

                case 2:
                    System.out.println("Usted ha seleccionado la opcion 2: Agregar al final de una cola");
                    Menu_Colas.a_final(obj.cola);
                    break;

                case 3:
                    System.out.println(
                            "Usted ha seleccionado la opcion 3: Agregar un numero en una posicion especifica ");
                    Menu_Colas.a_pos(obj.cola, pos, element);
                    break;

                case 4:
                    System.out.println("Usted ha seleccionado la opcion 4: Eliminar al inicio");
                    Menu_Colas.e_inicio(obj.cola);
                    break;

                case 5:
                    System.out.println("Usted ha seleccionado la opcion 5: Eliminar al final");
                    Menu_Colas.eliminarFinal(obj.cola);
                    break;

                case 6:
                    System.out.println("Usted ha seleccionado la opcion 6: Eliminar en una posicion especifica");
                    Menu_Colas.eliminarPosicion(obj.cola);
                    break;

                case 7:
                    System.out.println("Usted ha seleccionado la opcion 7: Imprimir de inicio a fin");
                    Menu_Colas.ImprimirInicio(obj.cola);
                    break;

                case 8:
                    System.out.println("Usted ha seleccionado la opcion 8: Imprimir de Fin a Inicio");
                    Menu_Colas.ImprimirFin(obj.cola);
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
            }

        }

    }

    // Metodos publicos

    public Queue<String> Datos(Queue<String> cola) {
        cola.offer("Blue");
        cola.offer("Something");
        cola.offer("Michelle");
        cola.offer("Alive");
        cola.offer("Selfless");
        cola.offer("Arabella");
        cola.offer("Disco");
        cola.offer("Staring");
        cola.offer("Creep");
        cola.offer("Footloose");

        // Imprimir datos de la cola
        System.out.println("La cola es: " + cola);
        return cola;
    }

    public static Queue<String> a_inicio(Queue<String> cola) {
        Scanner b = new Scanner(System.in);
        System.out.println("La cola original es: " + cola);
        System.out.print("Añade un elemento: ");

        String element = b.nextLine();

        // Guarda temporalmente los elementos existentes en la cola
        Queue<String> temp = new LinkedList<>(cola);

        // Limpia la cola original
        cola.clear();

        // Agrega el nuevo elemento al comienzo de la cola
        cola.add(element);

        // Vuelve a agregar los elementos existentes después del nuevo elemento
        cola.addAll(temp);
        System.out.println("La nueva cola es: " + cola);

        return cola;

    }

    public static void a_final(Queue<String> cola) {
        Scanner b = new Scanner(System.in);
        System.out.println("La cola original es: " + cola);
        System.out.print("Añade un elemento: ");
        String elem = b.nextLine();
        cola.offer(elem);
        System.out.println("La cola es: " + cola);

    }

    public static Queue<String> a_pos(Queue<String> cola, int pos, String elem) {
        Scanner b = new Scanner(System.in);
        System.out.println("La cola original es: " + cola);
        System.out.println("Añade un elemento: ");
        elem = b.nextLine();

        System.out.println("En que posicion deseas que se ingrese: ");
        pos = b.nextInt();

        LinkedList<String> listaAuxiliar = new LinkedList<String>();

        // Extraer los elementos de la cola y almacenarlos en la lista auxiliar
        while (!cola.isEmpty()) {
            listaAuxiliar.add(cola.poll());
        }

        // Agregar el nuevo elemento en la posición especificada
        listaAuxiliar.add(pos, elem);

        // Volver a agregar los elementos en la cola en el orden correcto
        while (!listaAuxiliar.isEmpty()) {
            cola.add(listaAuxiliar.poll());
        }

        System.out.println("La nueva cola es: " + cola);

        return cola;

    }

    public static Queue<String> e_inicio(Queue<String> cola) {
        System.out.println("La cola original es: " + cola);
        String elemento = cola.poll();
        System.out.println("El elemento eliminado es: " + elemento);
        System.out.println("La nueva cola es: " + cola);

        return cola;

    }

    public static Queue<String> eliminarFinal(Queue<String> cola) {

        return cola;

    }

    public static Queue<String> eliminarPosicion(Queue<String> cola) {
        Scanner b = new Scanner(System.in);
        List<String> lista = new ArrayList<>(cola);
        System.out.println("Que posicion desea eliminar?");
        int posicion = b.nextInt(); // La posición del elemento que deseas eliminar
        lista.remove(posicion);
        cola = new LinkedList<>(lista);
        System.out.println("La nueva cola es: " + cola);

        return cola;

    }

    public static Queue<String> ImprimirInicio(Queue<String> cola) {
        System.out.println("La cola es: " + cola);
        return cola;

    }

    public static Queue<String> ImprimirFin(Queue<String> cola) {
        Stack<String> pila = new Stack<>();
        // Extraer los elementos de la cola y empujarlos en la pila
        while (!cola.isEmpty()) {
            pila.push(cola.poll());
        }
        // Agregar los elementos de la pila nuevamente a la cola
        while (!pila.isEmpty()) {
            cola.add(pila.pop());
        }
        System.out.println("Cola invertida: " + cola);

        return cola;

    }

}

// System.out.print("Los elementos de la colaola son: ");
