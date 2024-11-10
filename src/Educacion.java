public class Educacion extends Voluntariado{

    private Curso cursoRequerido;

    public Educacion(int cantidadDeDias, String ubicacion, Curso cursoRequerido) {
        super(cantidadDeDias, ubicacion);
        this.cursoRequerido = cursoRequerido;
    }

    @Override
    public boolean puedePostularse(Postulante voluntario) {
        return voluntario.getCursos().contains(cursoRequerido);
    }

    @Override
    public void puntuarParticipantes(Postulante voluntario) {

    }
}
