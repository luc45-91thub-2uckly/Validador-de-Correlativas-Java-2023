package org.validador;

import java.time.LocalDateTime;
import java.util.concurrent.TransferQueue;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;
    private LocalDateTime fecha;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia, LocalDateTime fecha) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = fecha;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public boolean aprobada(){
        return true;
    }

    @Override
    public String toString() {
        return "Inscripcion:" +
                alumno.toString() + "\n"
                + materia.toString() + "\n" +
                "Fecha:" + fecha;
    }
}
