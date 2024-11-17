public class Educacion extends Voluntariado {

    private Curso cursoRequerido;

    public Educacion(int cantidadDeDias, String ubicacion, Curso cursoRequerido) {
        super(cantidadDeDias, ubicacion);
        this.cursoRequerido = cursoRequerido;
    }

    public void aceptarPostulante(Postulante voluntario) throws ExcepcionVoluntariado{
        boolean aceptarParticipante = voluntario.getCursos().contains(cursoRequerido);

        if(!aceptarParticipante) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante");
        }

        pasticipantes.add(voluntario);
        voluntario.agregarVoluntariado(this);
    }

    public void puntuarParticipantes() {
        for (Postulante participante: pasticipantes) {
            int puntuacion = 15;
            participante.recibirPuntos(puntuacion);
        }
    }
}
