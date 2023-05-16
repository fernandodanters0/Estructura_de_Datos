package Ejercisios;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static Random rnd = new Random();
    public static Scanner sc = new Scanner (System.in);
    public static boolean salir = false;
    public Stack<Integer> pila = new Stack<Integer>();
    public static Queue<Integer> cola1 = new LinkedList<Integer>();

  public static void main (String [] args){

    Menu obj = new Menu();

    while(!salir){

      System.out.println("---------------------------------------------------------");
      System.out.println("--------------------MENU DE PRIORIDADES------------------");
      System.out.println("1.- Agregar al inicio de una pila");
      System.out.println("2.- Agregar al final de una pila");

      System.out.println("\nSelecciona una opcion: ");
      int opcion = sc.nextInt();

      switch (opcion){

        case 1:
        System.out.println("Usted ha seleccionado la opcion 1: Agregar al inicio de la pila");
        Menu.pila1(obj.pila);

        break;



      }


    }


  }

  public static void pila1(Stack<Integer> p){

    System.out.print("Ingresa la cantidad de datos de la pila: ");
    int c = sc.nextInt();

    for (int i = 0; i < c; i ++){
        p.push(rnd.nextInt(100));
    }

    //Imprimir datos de la pila
    System.out.println("La pila es: " + p);
  

    System.out.print("Añade un elemento: ");
    int elem = sc.nextInt();

    Stack<Integer> pilaTemp = new Stack<Integer>();

    // Pasar elementos de la pila original a la pila temporal
    while (!p.isEmpty()) {
        pilaTemp.push(p.pop());
    }

    // Agregar el número al comienzo de la pila temporal
    pilaTemp.push(elem);

    // Pasar los elementos de la pila temporal a la pila original, manteniendo el orden
    while (!pilaTemp.isEmpty()) {
        p.push(pilaTemp.pop());
    }

    // Imprimir la pila con el orden original
    System.out.println("La nueva pila es: " + p);
    System.out.println("\n");

  }


}
