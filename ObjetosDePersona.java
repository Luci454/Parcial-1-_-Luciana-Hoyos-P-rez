//Clase en donde se instanciarán los 3 objetos tipo persona.
public class ObjetosDePersona {
    public static void main(String[] args) {
        //Herencia:Se instancian objetos de una clase que reciben/heredan los atributos y métodos de dicha clase.
        Persona persona1 = new Persona("Alejandro","Pérez","Estudiante",19,1036651449);
        Persona persona2 = new Persona("Samuel","Hoyos","Docente",34,8402448);
        Persona persona3 = new Persona("Santiago","Ochoa","Administrativo",23,1000336467);

        //Polimorfismo evidenciado en los mismos métodos, que se emplean de forma diferente en cada objeto.
        //Veamos el polimorfismo en el método presentarse():
        System.out.println("\nA continuación veremos como cada persona se presenta según su nombre y apellido.");
        persona1.presentarse();
        persona2.presentarse();
        persona3.presentarse();

        //Veamos el polimorfismo en el método presentarRol():
        System.out.println("\n \nAhora veremos cómo cada persona nos cuenta el rol que desempeña actualmente.");
        System.out.println("\nAlejandro:");
        persona1.presentarRol();
        System.out.println("\nSamuel:");
        persona2.presentarRol();
        System.out.println("\nSantiago:");
        persona3.presentarRol();

        //Veamos el polimorfismo en el método decirEdad():
        System.out.println("\n \nSeguidamente conoceremos la edad de cada uno.");
        System.out.println("\nAlejandro:");
        persona1.decirEdad();
        System.out.println("\nSamuel:");
        persona2.decirEdad();
        System.out.println("\nSantiago:");
        persona3.decirEdad();
    }
}