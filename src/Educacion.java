public class Educacion extends Voluntariado {

    private Curso cursoRequerido;

    public Educacion(int cantidadDeDias, String ubicacion, Curso cursoRequerido) {
        super(cantidadDeDias, ubicacion);
        this.cursoRequerido = cursoRequerido;
    }

    public boolean aceptarPostulante(Postulante voluntario) {
        boolean aceptarParticipante = voluntario.getCursos().contains(cursoRequerido);
        if(aceptarParticipante) {
            voluntario.agregarVoluntariado(this);
            pasticipantes.add(voluntario);
        }
        return aceptarParticipante;
    };

    public void puntuarParticipantes() {
        //
    }
}
