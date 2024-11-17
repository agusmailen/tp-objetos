import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Postulante implements Puntuable {
    private int edad;

    private int puntuacion;

    private HashSet<Idioma> idiomas = new HashSet<Idioma>();

    private HashSet<Curso> cursos = new HashSet<Curso>();

    private List<Voluntariado> voluntariados = new ArrayList<Voluntariado>();

    public Postulante(int edad, int puntuacion) {
        this.edad = edad;
        this.puntuacion = puntuacion;
    }

    public HashSet<Idioma> getIdiomas() {
        return idiomas;
    }

    public List<Voluntariado> getVoluntariados() {
        return voluntariados;
    }

    public void agregarVoluntariado(Voluntariado voluntariadoAceptado) {
        voluntariados.add(voluntariadoAceptado);
    }

    public void agregarIdioma(Idioma idioma) {
        idiomas.add(idioma);
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public HashSet<Curso> getCursos() {
        return cursos;
    }

    public int getEdad(){
        return this.edad;
    }

    public int getPuntuacion(){
        return this.puntuacion;
    }

    public void recibirPuntos(int puntosDatos) {
        this.puntuacion += puntosDatos;
    }
}
