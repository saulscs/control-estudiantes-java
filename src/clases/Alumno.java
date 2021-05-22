package clases;
public class Alumno {
    //1.- Atributos
    String nombre;
    Integer dia;
    String mes;
    Integer año;
    Double promedio;
    Double materia1;
    Double materia2;
    Double materia3;

    //2.- constructores parametros obligatorios para que se cree la clase

    public Alumno(String nombre, Integer dia, String mes, Integer año,  Double promedio, Double materia1, Double materia2, Double materia3 ){
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Double getMateria1() {
        return materia1;
    }

    public void setMateria1(Double materia1) {
        this.materia1 = materia1;
    }

    public Double getMateria2() {
        return materia2;
    }

    public void setMateria2(Double materia2) {
        this.materia2 = materia2;
    }

    public Double getMateria3() {
        return materia3;
    }

    public void setMateria3(Double materia3) {
        this.materia3 = materia3;
    }

    // Mostrar los datos

    @Override
    public String toString() {
        return "Alumno { " +
                "\nNombre: " + nombre + '\'' +
                ", \nDia: " + dia +
                ", \nMes: '" + mes + '\'' +
                ", \nAño: " + año +
                ", \nMateria 1: " + materia1 +
                ", \nMateria 2: " + materia2 +
                ", \nMateria 3: " + materia3 +
                ", \nPromedio: " + promedio +
                '}';
    }
}
