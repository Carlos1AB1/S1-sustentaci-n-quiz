package Depuracion;

public class DebugginBasico {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;


        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);


        int suma = x + y;
        System.out.println("La suma de x + y es: " + suma);


        if (suma > 15) {

        } else {
            System.out.println("La suma es menor o igual que 15");
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + (i + 1));
        }
    }
}

