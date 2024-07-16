package Operador_ternario_ejemplos;

public class MayorEdad {
    public int edad;


    public MayorEdad(int edad) {
        this.edad = edad;
    }


    public String esMayorDeEdad() {
        return (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
    }

    public static void main(String[] args) {
        MayorEdad persona = new MayorEdad(22);
        System.out.println(persona.esMayorDeEdad());
    }
}


