package ec.edu.ups.poo;

public class Main {
    public static void main(String[] args) {

        Calificacion c1 = new Calificacion("Programacion", 8.5);
        Calificacion c2 = new Calificacion("Electro", 6.2);
        Calificacion c3 = new Calificacion("Fisica", 9.0);


        Estudiante est1 = new Estudiante("Valeria", "Gómez");
        est1.agregarCalificacion(c1);
        est1.agregarCalificacion(c2);

        Estudiante est2 = new Estudiante("Luis", "Ordoñez");
        est2.agregarCalificacion(c3);


        Curso curso = new Curso("c", "Tercero");
        curso.agregarEstudiante(est1);
        curso.agregarEstudiante(est2);


        System.out.println("=== INFORMACIÓN DEL CURSO ===");
        System.out.println("Nivel: " + curso.getNivel());
        System.out.println("Paralelo: " + curso.getParalelo());
        System.out.println("Estudiantes:");

        for (int i = 0; i < curso.getEstudiantes().size(); i++) {
            Estudiante e = curso.getEstudiantes().get(i);
            System.out.println("  - " + e.getNombre() + " " + e.getApellido());
            for (int j = 0; j < e.getCalificaciones().size(); j++) {
                Calificacion c = e.getCalificaciones().get(j);
                System.out.println("      * " + c.getMateria() + " → Nota: " + c.getNota());
            }
        }
    }
}