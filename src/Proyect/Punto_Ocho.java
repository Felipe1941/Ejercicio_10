package Proyect;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Punto_Ocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fichero origen: ");
        String filein = scanner.nextLine();
        System.out.println("fichero destino: ");
        String fileout = scanner.nextLine();
        copia(filein,fileout);

    }
    public static void copia (String filein, String fileout){
        try{
            InputStream in = new FileInputStream(filein);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileout);
            out.write(datos);
            out.close();
        }catch (Exception e){
            System.out.println("Excepcion: "+ e.getMessage());
        }

    }
}
