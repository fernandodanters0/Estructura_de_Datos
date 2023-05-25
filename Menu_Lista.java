package Ejercisios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Menu_Lista {
    // Atributos publicos
    public static int num;
    static Scanner x = new Scanner(System.in);
    public static boolean salir = false;
    public static int pos;
    public static String elem;
    public List<String> Lista = new ArrayList<>();

    public static void main(String[] args) {
        // Objeto obj de la clase Menu_Colas
        Menu_Lista obj = new Menu_Lista();
        // Llamando al metodo Datos
        obj.Datos(obj.Lista);

        while (!salir) {

            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------MENU DE LISTAS----------------------");
            System.out.println("1.- Agregar al inicio de una lista");
            System.out.println("2.- Agregar al final de una lista");
            System.out.println("3.- Agregar en una posicion especifica");
            System.out.println("4.- Eliminar al inicio");
            System.out.println("5.- Eliminar al final");
            System.out.println("6.- Eliminar en una posicion especifica");
            System.out.println("7.- Imprimir de inicio a fin");
            System.out.println("8.- Imprimir de Fin a Inicio");
            System.out.println("9.- Escribe (salir) para terminar.");

            System.out.println("\nSelecciona una opcion: ");
            int opcion = x.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Usted ha seleccionado la opcion 1: Agregar al inicio de la lista");
                    Menu_Lista.agregar_inicio(obj.Lista);
                    break;

                case 2:
                    System.out.println("Usted ha seleccionado la opcion 2: Agregar al final de una lista");
                    Menu_Lista.a_final(obj.Lista);
                    break;

                case 3:
                    System.out.println(
                            "Usted ha seleccionado la opcion 3: Agregar un numero en una posicion especifica ");
                    Menu_Lista.a_pos(obj.Lista);
                    break;

                case 4:
                    System.out.println("Usted ha seleccionado la opcion 4: Eliminar al inicio");
                    Menu_Lista.e_inicio(obj.Lista);
                    break;

                case 5:
                    System.out.println("Usted ha seleccionado la opcion 5: Eliminar al final");
                    Menu_Lista.e_final(obj.Lista);
                    break;

                case 6:
                    System.out.println("Usted ha seleccionado la opcion 6: Eliminar en una posicion especifica");
                    Menu_Lista.e_pos(obj.Lista);
                    break;

                case 7:
                    System.out.println("Usted ha seleccionado la opcion 7: Imprimir de inicio a fin");
                    Menu_Lista.imprimir_i(obj.Lista);
                    break;

                case 8:
                    System.out.println("Usted ha seleccionado la opcion 8: Imprimir de Fin a Inicio");
                    Menu_Lista.imprimir_f(obj.Lista);
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
            }

        }
    }

    public void Datos(List<String> list) {
        Scanner x = new Scanner(System.in);
        System.out.println("Ingresa los datos de la lista ");
        String entrada = "";
        while (!entrada.equals("salir")) {
            System.out.print("Ingrese un String (o escriba 'salir' para terminar): ");
            entrada = x.nextLine();
            if (!entrada.equals("salir")) {
                list.add(entrada);
            }
        }

        System.out.println("La Lista es: " + list);
    }

    public static List<String> agregar_inicio(List<String> list) {
        Scanner x = new Scanner(System.in);
        System.out.println("La lista original es: " + list);
        System.out.println("¿Que elemento deseas agregar: ");
        String elem = x.nextLine();

        list.add(0, elem);

        System.out.println("Lista con el nuevo elemento al inicio: " + list);

        return list;
    }

    public static List<String> a_final(List<String> list) {
        Scanner x = new Scanner(System.in);
        System.out.println("La lista original es: " + list);
        System.out.println("¿Que elemento deseas agregar: ");
        String elem = x.nextLine();
        list.add(elem);
        System.out.println("La nueva lista es: " + list);

        return list;

    }

    public static List<String> a_pos(List<String> list) {
        Scanner x = new Scanner(System.in);
        System.out.println("La lista original es: " + list);
        System.out.println("¿Que elemento deseas agregar: ");
        String elem = x.nextLine();
        System.out.println("¿En que posicion deseas que se ingrese? ");
        int pos = x.nextInt();
        list.add(pos, elem);
        System.out.println("Lista con el nuevo elemento al inicio: " + list);

        return list;

    }

    public static List<String> e_inicio(List<String> list) {
        System.out.println("La lista original es: " + list);
        list.remove(0);
        System.out.println("La nueva lista es: " + list);
        return list;

    }

    public static List<String> e_final(List<String> list) {
        System.out.println("La lista original es: " + list);
        // Eliminar el último elemento de la lista
        int ultimoIndice = list.size() - 1;
        list.remove(ultimoIndice);
        System.out.println("La nueva lista es: " + list);
        return list;

    }

    public static List<String> e_pos(List<String> list) {
        Scanner x = new Scanner(System.in);
        System.out.println("La lista original es: " + list);
        System.out.println("¿En que posicion se encuentra? ");
        int pos = x.nextInt();

        list.remove(pos);
        System.out.println("La nueva lista es: " + list);

        return list;

    }

    public static List<String> imprimir_i(List<String> list) {

        System.out.println("La Lista de inicio a fin es: " + list);

        return list;

    }

    public static List<String> imprimir_f(List<String> list) {

        Collections.reverse(list);

        System.out.println("La Lista de fin a inicio es: " + list);

        return list;

    }

}
