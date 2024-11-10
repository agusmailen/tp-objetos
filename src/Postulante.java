import java.util.HashSet;

public class Postulante {

    private HashSet<Idioma> idiomas = new HashSet<Idioma>();

    private HashSet<Curso> cursos = new HashSet<Curso>();

    private HashSet<Voluntariado> voluntariados = new HashSet<Voluntariado>();

    public HashSet<Idioma> getIdiomas() {
        return idiomas;
    }

    public HashSet<Voluntariado> getVoluntariados() {
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

    public void puntuarVoluntariado(Voluntariado voluntariado) {
        //TODO: crear una interfaz para que sea recibida como parametro de esta función
    }
}
