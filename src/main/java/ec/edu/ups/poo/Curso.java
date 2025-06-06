package ec.edu.ups.poo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String paralelo;
    private String nivel;
    private List<Estudiante> estudiantes;

    public Curso(String paralelo, String nivel) {
        this.paralelo = paralelo;
        this.nivel = nivel;
        this.estudiantes = new ArrayList<>();
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Curso " + nivel + " " + paralelo + ", Estudiantes: " + estudiantes;
    }
}