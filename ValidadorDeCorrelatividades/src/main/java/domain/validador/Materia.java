package domain.validador;

import java.util.List;

public class Materia {
    private List<Materia> correlativas;

    public Boolean correlativasAprobadas(Alumno alumno){
        return this.correlativas.stream().allMatch(alumno::aproboMateria);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}

