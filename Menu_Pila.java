package Ejercisios;

//importamos las librerias correspondientes
import java.util.Stack;
import java.util.Random;
import java.util.Scanner;

public class Menu_Pila {
  // Atributos publicos
  public static Random rnd = new Random();
  public static int num;
  public static Scanner sc = new Scanner(System.in);
  public static boolean salir = false;
  public Stack<Integer> pila = new Stack<Integer>();

  public static void main(String[] args) {
    // Objeto obj de la clase Menu_Pila
    Menu_Pila obj = new Menu_Pila();
    // Llamando al metodo Datos
    obj.Datos();

    while (!salir) {

      System.out.println("---------------------------------------------------------");
      System.out.println("------------------------MENU DE PILA---------------------");
      System.out.println("1.- Agregar al inicio de una pila");
      System.out.println("2.- Agregar al final de una pila");
      System.out.println("3.- Agregar en una posicion especifica");
      System.out.println("4.- Eliminar al inicio");
      System.out.println("5.- Eliminar al final");
      System.out.println("6.- Eliminar en una posicion especifica");
      System.out.println("7.- Imprimir de inicio a fin");
      System.out.println("8.- Imprimir de Fin a Inicio");
      System.out.println("9.- Escribe (salir) para terminar.");

      System.out.println("\nSelecciona una opcion: ");
      int opcion = sc.nextInt();

      switch (opcion) {

        case 1:
          System.out.println("Usted ha seleccionado la opcion 1: Agregar al inicio de la pila");
          Menu_Pila.a_inicio(obj.pila);
          break;

        case 2:
          System.out.println("Usted ha seleccionado la opcion 2: Agregar al final de una pila");
          Menu_Pila.a_final(obj.pila);
          break;

        case 3:
          System.out.println("Usted ha seleccionado la opcion 3: Agregar un numero en una posicion especifica ");
          Menu_Pila.a_pos(obj.pila);
          break;

        case 4:
          System.out.println("Usted ha seleccionado la opcion 4: Eliminar al inicio");
          Menu_Pila.e_inicio(obj.pila);
          break;

        case 5:
          System.out.println("Usted ha seleccionado la opcion 4: Eliminar al final");
          Menu_Pila.eliminarFinal(obj.pila);
          break;

        case 6:
          System.out.println("Usted ha seleccionado la opcion 6: Eliminar en una posicion especifica");
          Menu_Pila.eliminarPosicion(obj.pila);
          break;

        case 7:
          System.out.println("Usted ha seleccionado la opcion 7: Imprimir de inicio a fin");
          Menu_Pila.ImprimirInicio(obj.pila);
          break;

        case 8:
          System.out.println("Usted ha seleccionado la opcion 8: Imprimir de Fin a Inicio");
          Menu_Pila.ImprimirFin(obj.pila);
          break;

        case 9:
          System.out.println("Saliendo del programa...");
          salir = true;
          break;
      }

    }

  }

  // Metodos publicos

  public void Datos() {
    System.out.print("Ingresa la cantidad de numeros de la pila: ");
    int c = sc.nextInt();

    for (int i = 0; i < c; i++) {
      pila.push(rnd.nextInt(100));
    }
    // Imprimir datos de la pila
    System.out.println("La pila es: " + pila);

  }

  public static void a_inicio(Stack<Integer> p) {
    System.out.println("La pila original es: " + p);
    System.out.print("Añade un numero entero: ");
    int elem = sc.nextInt();

    Stack<Integer> pilaTemp = new Stack<Integer>();

    // Pasar elementos de la pila original a la pila temporal
    while (!p.isEmpty()) {
      pilaTemp.push(p.pop());
    }

    // Agregar el número al comienzo de la pila temporal
    pilaTemp.push(elem);

    // Pasar los elementos de la pila temporal a la pila original, manteniendo el
    // orden
    while (!pilaTemp.isEmpty()) {
      p.push(pilaTemp.pop());
    }

    // Imprimir la pila con el orden original
    System.out.println("La nueva pila es: " + p);
    System.out.println(" ");

  }

  public static void a_final(Stack<Integer> p) {
    System.out.println("La pila original es: " + p);
    System.out.print("Añade un elemento: ");
    int elemf = sc.nextInt();
    p.push(elemf);
    System.out.println("La pila es: " + p);

  }

  public static void a_pos(Stack<Integer> p) {
    System.out.println("La pila original es: " + p);
    System.out.println("Añade un elemento: ");
    int elem = sc.nextInt();

    System.out.println("En que posicion deseas que se ingrese: ");
    int pos = sc.nextInt();

    int currentIndex = 0;

    Stack<Integer> PilaTemporal = new Stack<>();

    // Transfieres los elementos de la pila original a la pila auxiliar
    while (currentIndex < pos) {
      PilaTemporal.push(p.pop());
      currentIndex++;
    }

    // Agregas el nuevo elemento en la posición especificada
    p.add(elem);

    // Transfieres los elementos de la pila auxiliar de vuelta a la pila original
    while (!PilaTemporal.isEmpty()) {
      p.push(PilaTemporal.pop());
    }

    System.out.println("La nueva pila es: " + p);

  }

  public static void e_inicio(Stack<Integer> b) {
    System.out.println("La pila original es: " + b);
    Stack<Integer> pilaTemp = new Stack<Integer>();

    // Pasar elementos de la pila original a la pila temporal
    while (!b.isEmpty()) {
      pilaTemp.push(b.pop());
    }

    // Eliminar el número al comienzo de la pila temporal
    pilaTemp.pop();

    // Pasar los elementos de la pila temporal a la pila original, manteniendo el
    // orden
    while (!pilaTemp.isEmpty()) {
      b.push(pilaTemp.pop());
    }

    // Imprimir la pila con el orden original
    System.out.println("La nueva pila es: " + b);
    System.out.println(" ");
  }

  public static void eliminarFinal(Stack<Integer> p) {
    System.out.println("La pila original es: " + p);
    Stack<Integer> pilaTemp = new Stack<Integer>();

    // Pasar elementos de la pila original a la pila temporal
    while (!p.isEmpty()) {
      pilaTemp.push(p.pop());
    }
    // Eliminamos el ultimo elemento de la pila
    if (!p.isEmpty()) {
      p.pop();
    }

    // Pasar los elementos de la pila temporal a la pila original, manteniendo el
    // orden
    while (!pilaTemp.isEmpty()) {
      p.push(pilaTemp.pop());
    }

    // Imprimir la pila con el orden original
    System.out.println("La nueva pila es: " + p);
    System.out.println(" ");

  }

  public static void eliminarPosicion(Stack<Integer> p) {
    System.out.println("La pila original es: " + p);
    System.out.println("Ingresa el numero a eliminar: ");
    num = sc.nextInt();
    System.out.println("Ingresa la posicion donde se encuentra ese numero: ");
    int pos = sc.nextInt();

    int currentIndex = 0;

    Stack<Integer> PilaTemp = new Stack<>();
    // Movemos los elementos a la pila temporal hasta llegar
    // a la posicion deseada
    while (currentIndex < pos - 1) {
      PilaTemp.push(p.pop());
      currentIndex++;
    }

    // Eliminamos el elmento deseado y lo guardamos
    if (!PilaTemp.isEmpty()) {
      num = p.pop();

    }

    // Transfieres los elementos de la pila auxiliar de vuelta a la pila original
    while (!PilaTemp.isEmpty()) {
      p.push(PilaTemp.pop());
    }

    System.out.println("La nueva pila es: " + p);

  }

  public static void ImprimirInicio(Stack<Integer> p) {
    System.out.println("La pila es: " + p);

  }

  public static Stack<Integer> ImprimirFin(Stack<Integer> p) {
    System.out.println("La pila original es: " + p);
    Stack<Integer> pilaTemp = new Stack<>();

    while (!p.isEmpty()) {
      pilaTemp.push(p.pop());
    }
    p = pilaTemp;

    System.out.println("La pila de Fin a inicio es: " + p);

    return pilaTemp;

  }

}
