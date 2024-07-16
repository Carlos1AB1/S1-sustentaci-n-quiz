package Operador_ternario_ejemplos;


public class Numero {
    public int valor;


    public Numero(int valor) {
        this.valor = valor;
    }

    public String esPar() {
        return (valor % 2 == 0) ? "El número es par" : "El número es impar";
    }


    public static void main(String[] args) {
        Numero num = new Numero(8);
        System.out.println(num.esPar());
    }
}
