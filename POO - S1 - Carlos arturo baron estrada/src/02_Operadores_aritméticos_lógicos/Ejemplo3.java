package Operadores_aritméticos_lógicos;

public class Ejemplo3 {

    public static void main(String[] args) {

            boolean esVerano = true;
            boolean haceCalor = false;


            boolean resultado = esVerano && !haceCalor;

            System.out.println("¿Es verano y no hace calor?: " + resultado);
        }
    }

