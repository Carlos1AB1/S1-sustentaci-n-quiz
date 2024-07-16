package Operadores_aritméticos_lógicos;


public class Ejem {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Ejem sumadora = new Ejem();

        int resultado = Ejem.sumar(10, 5);
        System.out.println("Resultado de la suma: " + resultado);
    }

}



