package Proyect;

public class Saludo {
    public static void main(String[] args) {

        try {
            String saludo = "Hola mundo";


            for (int i = 9; i < saludo.length(); i--) {
                char reverse = saludo.charAt(i);
                System.out.println(reverse);


            }

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Finalizamos");
        }
    }

}