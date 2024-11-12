public class EventoExterior extends Voluntariado {
    
    private Idioma idiomaRequerido;

    public EventoExterior(int cantidadDeDias, String ubicacion, Idioma idiomaRequerido) {
        super(cantidadDeDias, ubicacion);
        this.idiomaRequerido = idiomaRequerido;
    }

    public boolean puedePostularse(Postulante voluntario) {
        boolean aceptarParticipante = voluntario.getIdiomas().contains(idiomaRequerido);
        if(aceptarParticipante) {
            voluntario.agregarVoluntariado(this);
            pasticipantes.add(voluntario);
        }
        return aceptarParticipante;
    };

    public void puntuarParticipantes(Postulante voluntario) {}
}
