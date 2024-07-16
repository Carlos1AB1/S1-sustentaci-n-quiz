package the_foreach_statement;

public class ForEachBasico {
    public static void main(String[] args) {
        String[] colores = {"Rojo", "Verde", "Azul", "Blanco"};

        System.out.println("Colores disponibles:");
        for (String color : colores) {
            System.out.println(color);
        }
    }
}

