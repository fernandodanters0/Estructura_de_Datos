package Ejercisios;

import java.util.ArrayList;
import java.util.List;

public class Listabasica {

    public static void main(String[]arg){
        List<String> lis_nombres = new ArrayList<>();
         lis_nombres.add("walter");
         lis_nombres.add("log");
         lis_nombres.add("byte");
         lis_nombres.add("float");
         lis_nombres.add("doublle");
         lis_nombres.add("short");
         lis_nombres.add("son de los que me acuerdo");

         System.out.println("tamaño"+lis_nombres.size());
         System.out.println("dato posicion 0:"+lis_nombres.get(0));
    }
    
}
