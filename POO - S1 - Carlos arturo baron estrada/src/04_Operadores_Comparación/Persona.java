package Operadores_Comparación;


public class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean esMayorQue(Persona otraPersona) {
        return this.edad > otraPersona.edad;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("María", 25);


        if (persona1.esMayorQue(persona2)) {
            System.out.println(persona1.nombre + " es mayor que " + persona2.nombre);
        } else {
            System.out.println(persona2.nombre + " es mayor que " + persona1.nombre);
        }
    }
}

