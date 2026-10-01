/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Taller {

    private int id;
    private String nombre;
    private String instructor;
    private String fecha;
    private String horario;
    private String lugar;
    private int cupo;

    public Taller(int id, String nombre, String instructor,
                  String fecha, String horario,
                  String lugar, int cupo) {

        this.id = id;
        this.nombre = nombre;
        this.instructor = instructor;
        this.fecha = fecha;
        this.horario = horario;
        this.lugar = lugar;
        this.cupo = cupo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHorario() {
        return horario;
    }

    public String getLugar() {
        return lugar;
    }

    public int getCupo() {
        return cupo;
    }

    @Override
    public String toString() {
        return nombre;
    }
}