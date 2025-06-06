package ec.edu.ups.poo;

public class Calificacion {
    private String materia;
    private double nota; // O puedes usar double si prefieres una nota numérica

    public Calificacion(String materia, double nota) {
        this.materia = materia;
        this.nota = nota;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Materia: " + materia + ", Nota: " + nota;
    }
}
