package Ejercisios;
import java.util.Scanner;
import java.util.Stack;
import java.util.Random;

public class PilasM{
    //Atributos de la clase

    public static int num;
    public Stack<Integer> Pila = new Stack<Integer>();

    public void PedirDatos(){

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos numeros desea ingresar en la pila: ");
        num = sc.nextInt();
        System.out.println();
        sc.close();
    }

    public static void llenar_pila(Stack<Integer> p) {
        Random rnd = new Random();

        for (int i = 0; i <= num; i ++){
            p.push(rnd.nextInt(100));
        }
        System.out.print("La pila es: " + p + "\n\n");
    }

    public static void Mayor(Stack<Integer> p){

        int indiceMayor = 0;
        int mayor = p.get(0);

        for (int i = 0; i < p.size(); i++) {
            int elementoActual = p.get(i);
            if (elementoActual > mayor) {
                mayor = elementoActual;
                indiceMayor = i;
            }
        }
        System.out.println("El número mayor es: " + mayor + ", su posicion es: " + indiceMayor + "\n");
    }

    public static void main(String[] args) {
        //Creacion del objeto
      PilasM obj = new PilasM();
      obj.PedirDatos();
      PilasM.llenar_pila(obj.Pila);
      PilasM.Mayor(obj.Pila);

    }

}