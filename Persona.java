//Abstracción:Crear una clase a través de propiedades y métodos que la describen y describensus comportamientos.
public class Persona {
    //Encapsulamiento: Manipular los parámetros de la clase únicamente dentro de la misma clase.
    //Propiedades/atributos String.
    private String nombre, apellido, rol;
    //Propiedades/atributos enteros.
    private int edad, id;

    //Constructor
    public Persona(String nombre, String apellido, String rol,int edad, int id){
        this.nombre = nombre;
        this.apellido = apellido;
        //rol se refiere al papel que el objeto Persona desempeñaría.
        this.rol = rol;
        this.edad = edad;
        this.id = id;
    }

    //3 Métodos especiales:
    //Polimorfismo: Estos 3 métodos aplican el polimorfismo, ya que al ejecutarse lo hacen de forma diferente para la instancia de cada objeto, según sus propiedades particulares.
    public void presentarse (){
        System.out.println("\nCordial saludo, mi nombre es "+this.nombre+" "+this.apellido+".");
    }

    public void presentarRol (){
        System.out.println("Actualmente soy "+this.rol+" y mi ID es "+this.id+".");
    }

    public void decirEdad (){
        System.out.println("Ahora mismo tengo "+this.edad+" años.");
    }

    //Setters:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getters:
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRol() {
        return rol;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }
}
