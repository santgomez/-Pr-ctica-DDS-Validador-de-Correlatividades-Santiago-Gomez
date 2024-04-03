package domain;

import domain.validador.Inscripcion;
import domain.validador.Alumno;
import domain.validador.Materia;

import org.junit.Test;
import junit.framework.Assert;

import java.util.List;

public class InscripcionTest {

    @Test
    public void inscripcionDeAlumnoAceptada(){

        Materia algoritmos = new Materia();

        Materia paradigmas = new Materia();

        Alumno juan = new Alumno();

        List<Materia> listaAlgoritmos = new List<Materia>();
        listaAlgoritmos.add(algoritmos);

        List<Materia> listaParadigmas = new List<Materia>();
        listaParadigmas.add(paradigmas);

        paradigmas.setCorrelativas(listaAlgoritmos);
        juan.setMateriasAprobadas(listaParadigmas);

        Inscripcion inscripcionAlgoritmos = new Inscripcion();
        inscripcionAlgoritmos.setAlumnoAInscribirse(juan);
        inscripcionAlgoritmos.setMateriasAInscribirse(listaParadigmas);

        Assert.assertTrue(inscripcionAlgoritmos.aprobada());

    }


    public void inscripcionDeAlumnoRechazada(){

        Materia quimica = new Materia();

        Materia discreta = new Materia();

        Materia sintaxis = new Materia();

        Alumno pedro = new Alumno();

        List<Materia> listaQuimica = new List<Materia>();
        listaQuimica.add(quimica);

        List<Materia> listaDiscreta = new List<Materia>();
        listaDiscreta.add(discreta);

        List<Materia> listaSintaxis = new List<Materia>();
        listaSintaxis.add(sintaxis);

        sintaxis.setCorrelativas(listaDiscreta);
        pedro.setMateriasAprobadas(listaQuimica);



        Inscripcion inscripcionSintaxis = new Inscripcion();
        inscripcionSintaxis.setAlumnoAInscribirse(pedro);
        inscripcionSintaxis.setMateriasAInscribirse(listaSintaxis);

        Assert.assertFalse(inscripcionSintaxis.aprobada());

    }
}