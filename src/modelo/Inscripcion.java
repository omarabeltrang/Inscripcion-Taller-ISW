/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Inscripcion {

    private Alumno alumno;
    private Taller taller;

    public Inscripcion(Alumno alumno, Taller taller) {
        this.alumno = alumno;
        this.taller = taller;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Taller getTaller() {
        return taller;
    }

    public String generarTicket() {

        return """
               =====================================
                    TICKET DE INSCRIPCIÓN
               =====================================

               SEMANA DE INGENIERÍA DE SOFTWARE

               ID Alumno: %s
               Nombre: %s
               Semestre: %d
               Programa: %s

               -------------------------------------

               Taller:
               %s

               Instructor:
               %s

               Fecha:
               %s

               Horario:
               %s

               Lugar:
               %s

               -------------------------------------

                    INSCRIPCIÓN CONFIRMADA

               =====================================
               """.formatted(
                alumno.getId(),
                alumno.getNombre(),
                alumno.getSemestre(),
                alumno.getPrograma(),
                taller.getNombre(),
                taller.getInstructor(),
                taller.getFecha(),
                taller.getHorario(),
                taller.getLugar()
        );
    }
}