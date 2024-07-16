package Sentencia_Break;

public class EjemploBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);


            if (i == 5) {
                System.out.println("Número 5 encontrado, saliendo del ciclo...");
                break;
            }
        }
    }
}

