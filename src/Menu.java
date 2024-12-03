import java.util.Scanner;

public class Menu {
    private static void mostrarMenu() {
        System.out.println("Elige una opción:\n" +
                "1. Introducir la nota de un estudiante.\n" +
                "2. Calcular la nota media del curso.\n" +
                "3. Mostrar información de los estudiantes.\n" +
                "4. Mostrar estudiantes por inicial.\n" +
                "5. Salir del programa.");
    }

    public static void elegirOpcion(Estudiante estudiantes[]){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion){
                    case 1:
                        MenuApp.introducirNota(estudiantes);
                        break;
                    case 2:
                        MenuApp.calcularMedia(estudiantes);
                        break;
                    case 3:
                        MenuApp.mostrarEstudiantes(estudiantes);
                        break;
                    case 4:
                        MenuApp.mostrarEstudiantePorInicial(estudiantes);
                        break;
                    case 5:
                        System.out.println("Programa finalizado.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
            }
        }while(opcion != 5);
    }
}
