package domain.validador;

import java.util.List;

public class Inscripcion {

    private List<Materia> materiasAInscribirse;
    private Alumno alumnoAInscribirse;
    public boolean aprobada(){ //Metodo para verificar si la inscripcion se aprueba o no
        return this.materiasAInscribirse.stream().allMatch(materia -> materia.correlativasAprobadas(this.alumnoAInscribirse));
    }

    public List<Materia> getMateriasAInscribirse() {
        return materiasAInscribirse;
    }

    public void setMateriasAInscribirse(List<Materia> materiasAInscribirse) {
        this.materiasAInscribirse = materiasAInscribirse;
    }

    public Alumno getAlumnoAInscribirse() {
        return alumnoAInscribirse;
    }

    public void setAlumnoAInscribirse(Alumno alumnoAInscribirse) {
        this.alumnoAInscribirse = alumnoAInscribirse;
    }
}

