import java.util.HashSet;

public class Postulante {
    private int edad;

    private int puntuacion;

    private HashSet<Idioma> idiomas = new HashSet<Idioma>();

    private HashSet<Curso> cursos = new HashSet<Curso>();

    private HashSet<Voluntariado> voluntariados = new HashSet<Voluntariado>();

    public Postulante(int edad, int puntuacion) {
        this.edad = edad;
        this.puntuacion = puntuacion;
    }

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

    public HashSet<Curso> getCursos() { return cursos; }

    public int getEdad(){
        return this.edad;
    }

    public int getPuntuacion(){
        return this.puntuacion;
    }

    public void puntuarVoluntariado(Voluntariado voluntariado) {
        //TO DO: crear una interfaz para que sea recibida como parametro de esta función
    }
}
