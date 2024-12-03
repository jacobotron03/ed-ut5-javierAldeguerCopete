import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Estudiante estudiantes[] = new Estudiante[4];
        estudiantes[0] = new Estudiante("javier", 21);
        estudiantes[1] = new Estudiante("María", 22);
        estudiantes[2] = new Estudiante("Jose", 23);
        estudiantes[3] = new Estudiante("Daniel", 24);

        Menu.elegirOpcion(estudiantes);
    }

    public static void introducirNota(Estudiante estudiantes[]) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        boolean incorrecto = true;
        while (incorrecto) {
            System.out.println("Introduce el nombre del alumno.");
            nombre = sc.nextLine();
            for (Estudiante estudiante : estudiantes){
                if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                    incorrecto = false;
                    boolean invalida = true;
                    while (invalida) {
                        System.out.println("Introduce una nota entre 0 y 10: ");
                        String mark = sc.nextLine();
                        int nota = Integer.parseInt(mark);
                        if (-1 < nota && nota < 11) {
                            estudiante.setNota(nota);
                            invalida = false;
                        }
                        else{
                            System.out.println("La nota no es válida.");
                        }
                    }

                }
            }

            if (incorrecto){
                System.out.println("El nombre del alumno no se ha podido encontrar.");
            }
        }
        System.out.println("Nota introducida con éxito para el alumno " + nombre + ".");
    }

    public static void calcularMedia(Estudiante estudiantes[]){
        double notaMedia = 0;
        for (Estudiante estudiante : estudiantes){
            notaMedia += estudiante.getNota();
        }
        System.out.println("La nota media de todos los alumnos es: " + notaMedia/estudiantes.length);
    }

    public static void mostrarEstudiantes (Estudiante estudiantes[]){
        for (Estudiante estudiante : estudiantes){
            estudiante.mostrarEstudiante();
        }
        calcularMedia(estudiantes);
    }

    public static void mostrarEstudiantePorInicial(Estudiante estudiantes[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra inicial: ");
        String letraInicial = sc.nextLine().toUpperCase();
        double notasSuma = 0;
        int contador = 0;
        System.out.println("Estudiantes que empiezan por la letra: " + letraInicial);
        boolean existe = false;
        for (Estudiante estudiante : estudiantes){
            if (estudiante.getNombre().toUpperCase().charAt(0) == letraInicial.charAt(0)){
                estudiante.mostrarEstudiante();
                notasSuma += estudiante.getNota();
                contador++;
                existe = true;
            }
        }
        if (existe){
            System.out.println("\nLa nota media de estos alumnos es: " + notasSuma/contador);
        }
        else{
            System.out.println("No existe ningún alumno que empiece por esa letra.");
        }

    }
}