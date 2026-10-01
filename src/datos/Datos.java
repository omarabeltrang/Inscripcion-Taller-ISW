/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;
import modelo.Alumno;
import modelo.Taller;

public class Datos {

    public static ArrayList<Taller> obtenerTalleres() {

        ArrayList<Taller> talleres = new ArrayList<>();

        talleres.add(new Taller(
                1,
                "Introducción al Desarrollo Web",
                "Ing. Carlos Ramírez",
                "12 de octubre de 2026",
                "09:00 - 11:00",
                "Laboratorio de Software 1",
                25
        ));

        talleres.add(new Taller(
                2,
                "Desarrollo de Aplicaciones con Java",
                "Mtra. Ana López",
                "12 de octubre de 2026",
                "11:00 - 13:00",
                "Laboratorio de Software 2",
                20
        ));

        talleres.add(new Taller(
                3,
                "Introducción a Inteligencia Artificial",
                "Dr. Roberto Martínez",
                "13 de octubre de 2026",
                "10:00 - 12:00",
                "Sala Audiovisual",
                30
        ));

        talleres.add(new Taller(
                4,
                "Diseño de Interfaces UX/UI",
                "Mtra. Laura García",
                "13 de octubre de 2026",
                "15:00 - 17:00",
                "Laboratorio de Diseño",
                20
        ));

        return talleres;
    }

    public static ArrayList<Alumno> obtenerAlumnos() {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno(
                "000001",
                "Juan Carlos López",
                5,
                "Ingeniería de Software"
        ));

        alumnos.add(new Alumno(
                "000002",
                "María Fernanda García",
                3,
                "Ingeniería de Software"
        ));

        alumnos.add(new Alumno(
                "000003",
                "Carlos Eduardo Martínez",
                7,
                "Ingeniería de Software"
        ));

        alumnos.add(new Alumno(
                "000004",
                "Ana Sofía Rodríguez",
                4,
                "Ingeniería en Sistemas"
        ));

        return alumnos;
    }
}
