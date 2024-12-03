public class Estudiante {

    private String nombre;
    private int edad;
    private int nota = 0;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    public void mostrarEstudiante(){
        System.out.println("Nombre: " + nombre +
                " Edad: " + edad +
                " Nota: " + nota);
    }

}
