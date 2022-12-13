package Proyect;

import java.util.ArrayList;
import java.util.LinkedList;

public class Punto_Cinco {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("nombre 1");
        nombres.add("nombre 2");
        nombres.add("nombre 3");
        nombres.add("nombre 4");

        LinkedList<String> enlazadaNombres = new LinkedList<String>(nombres);

        for (String nombre: nombres){
            System.out.println(nombre);

        }
        for (String lista : enlazadaNombres){
            System.out.println(lista);

        }
    }
}
