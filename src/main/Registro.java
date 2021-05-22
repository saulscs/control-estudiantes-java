package  main;

import clases.Alumno;
import java.io.IOException;

public class Registro {
    //1.-Arreglo
    static Alumno alumnos[] = null;

    //2.- contador
    static int cont = 0;

    //3.- psvm + tab
    public static void main(String[] args) throws IOException {

        //4.- Inicializar arreglo
        alumnos = new Alumno[3];

        //5.- inicializar opcion
        int opcion = 0;

        //6.- menu
        do{
            System.out.println("--Selecciona una opcion");
            System.out.println("___________________");
            System.out.println("1.-Ingresar alumno");
            System.out.println("2.- Listar alumno");
            System.out.println("3.- Salir");
            System.out.println("\n");
            opcion = Leer.datoInt();

            //sw + tab
            switch (opcion) {
                case 1:
                    if (cont < 3) {
                        agregarAlumno();
                    } else {
                        System.out.println("No hay cupos");
                    }
                    break;
                case 2:
                    listarAlumno();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema");
                    break;
            }
        } while (opcion != 3);
        System.exit(0);
    }


// 7.- Metodo agregar alumno

    private static void agregarAlumno() throws IOException {
        //8.- variables locales
        String nombre = "";
        Integer dia = 0;
        String mes = "";
        Integer año = 0;
        double materia1 = 0;
        double materia2 = 0;
        double materia3 = 0;
        double promedio = 0;

        //9.- lectura de datos
        System.out.println("\n\n\n");
        System.out.println("______________");
        System.out.println("--Datos del Alumno");
        System.out.println("___________________");

        System.out.print("Nombre: ");
        nombre = Leer.dato();

        System.out.print("\nINGRESA TU FECHA DE NACIMIENTO\n");

        System.out.print("Dia: ");
        dia = Leer.datoInt();

        System.out.print("Mes: ");
        mes = Leer.dato();

        System.out.print("Año: ");
        año = Leer.datoInt();

        System.out.print("\nINGRESA TUS CALIFICACIONES\n");

        System.out.print("Materia 1: ");
        materia1 = Leer.datoDouble();

        System.out.print("Materia 2: ");
        materia2 = Leer.datoDouble();

        System.out.print("Materia 3: ");
        materia3 = Leer.datoDouble();

        //10.- Calculos

        promedio = (materia1 + materia2 + materia3) / 3;

        //11.- Mostrar datos

        System.out.println("Promedio de datos: " + promedio);

        //Agregar elementos a la colección
        alumnos[cont] = new Alumno(nombre, dia, mes, año ,materia1, materia2, materia3, promedio);
        cont++;
        System.out.println("Alumno agregado: " + cont);
    }


    private static void listarAlumno() {
        for(int i = 0; i < cont; i++){
            System.out.println("----------------------");
            System.out.println("\n\n\n--ALUMNOS--");
            System.out.println("----------------------");
            System.out.println(alumnos[i].toString());
        }
    }

}
