package Operadores_aritméticos_lógicos;

public class Ejemplo2 {

    public int Ejemplo2(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Ejemplo2 multiplicadora = new Ejemplo2();

        int resultado = multiplicadora.Ejemplo2(10, 5);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
}

