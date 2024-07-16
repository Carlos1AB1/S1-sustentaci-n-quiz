package Operador_ternario_ejemplos;


public class Estudiante {
    public int nota;

    public Estudiante(int nota) {
        this.nota = nota;
    }

    public String aprobo() {
        return (nota >= 60) ? "Aprobado" : "Reprobado";
    }


    public static void main(String[] args) {
        Estudiante est = new Estudiante(75);
        System.out.println("El estudiante está " + est.aprobo());
    }
}

