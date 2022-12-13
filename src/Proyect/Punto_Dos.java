package Proyect;

public class Punto_Dos {
    public static void main(String[] args) {
        int array[][]= {
                {1,2,3,4},
                {10,20,30,40},
                {100,200,300,400}
        };

        for (int i=0 ; i< array.length;i++){
            System.out.println("Posicion: " + i);
            for (int j=0 ; j< array[2].length; j++){
                System.out.println("Estoy en fila: " + i + " Columna: " + j);
                System.out.println(array[i][j]);

            }
        }
    }
}
