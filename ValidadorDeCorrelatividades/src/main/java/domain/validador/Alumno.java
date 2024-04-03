package domain.validador;

import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;

    public Boolean aproboMateria(Materia materia){
        return this.materiasAprobadas.contains(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}