import Logica.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Alumno> alumnoList = new ArrayList<>();

        // mostra alumno con los datos quemados
        //datosAlumnos(); // descomentar esta linea para ver los resultados

        solicitarDatosAlumno(alumnoList);


        // mostrar un resumen de los alumnos
        System.out.println("******** RESUMEN ALUMNOS **************\n");
        for(Alumno alumno : alumnoList){ // forma corta de recorrer un arrego o lista
            System.out.println("******** Alumno " + alumno.getId() + " ***********");
            System.out.println("Nombre: " +  alumno.getNombre());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Calificacion: " + alumno.getCalificacion());
            System.out.println("Estado: " + alumno.isApproved(alumno.getCalificacion()) + "\n");
        }

    }


    /**
     * Metodo para solicitar los datos de un alumno
     * @param alumnoList lista o arreglo que recibe, donde se van almacenar los alumnos para poder mostrar el resumen
     */
    public static void solicitarDatosAlumno(List<Alumno> alumnoList){

        // Solicitar datos por teclado usando la clase Scanner
        Scanner scanner = new Scanner(System.in);

        int numeroAlumnos = 0;

        //************ Solicitar datos por teclado **************//
        System.out.println("********** datos por teclado *********");

        System.out.println("Ingrese la cantidad de alumnos a evaludar: ");
        numeroAlumnos = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < numeroAlumnos; i++ ){

            Alumno alumno = new Alumno();
            //double calificacion = 0d;

            int id = i + 1;
            alumno.setId(id);

            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumno.setNombre(scanner.nextLine());
            System.out.println("Ingrese el apellido del alumno " + (i + 1));
            alumno.setApellido(scanner.nextLine());
            System.out.println("Ingresa la calificacion del alumno " + (i + 1));
            alumno.setCalificacion(scanner.nextDouble());
            scanner.nextLine();

            alumno.saludar();
            String status = alumno.isApproved(alumno.getCalificacion());;
            System.out.println("El alumno " + alumno.getNombre() + " " + alumno.getApellido() + " esta: " + status +"\n") ;

            alumnoList.add(alumno);
        }

        scanner.close();
    }

    public static void datosAlumnos(){
        Alumno alumno = new Alumno(1, "Gerson", "Benito", 10);
        Alumno alumno2 = new Alumno();

        alumno2.setId(2);
        alumno2.setNombre("Pepe");
        alumno2.setApellido("Grillo");
        alumno2.setCalificacion(8);

        alumno.saludar();
        alumno.isApproved(9.99);

        // alumno 2
        alumno2.saludar();
        alumno2.isApproved(6.5);
    }
}