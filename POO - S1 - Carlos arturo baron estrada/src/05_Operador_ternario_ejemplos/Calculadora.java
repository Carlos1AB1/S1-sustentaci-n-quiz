package Operador_ternario_ejemplos;

public class Calculadora {
    public int num1;
    public int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int maximo() {
        return (num1 > num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(6, 18);
        System.out.println("El número mayor es: " + calc.maximo());
    }
}

