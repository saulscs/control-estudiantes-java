public class Alumno {
    //1.- Atributos
    String nombre;
    Integer dia;
    String mes;
    Integer año;
    Double promedio;
    Integer materia1;
    Integer materia2;
    Integer materia3;

    //2.- constructores parametros obligatorios para que se cree la clase

    public Alumno(){

    }

    public Alumno(String nombre, Integer dia, String mes, Integer año, Double promedio, Integer materia1, Integer materia2, Integer materia3 ){
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.promedio = promedio;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    //getters y setters


}
