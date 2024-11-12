public class EventoExterior extends Voluntariado {
    
    private Idioma idiomaRequerido;

    private int nivelMinimo;

    public EventoExterior(int cantidadDeDias, String ubicacion, Idioma idiomaRequerido, int nivelMinimo) {
        super(cantidadDeDias, ubicacion);
        this.idiomaRequerido = idiomaRequerido;
        this.nivelMinimo = nivelMinimo;
    }

    public boolean aceptarPostulante(Postulante voluntario) {
        boolean aceptarParticipante = voluntario.getIdiomas().contains(idiomaRequerido);
        if(!aceptarParticipante) {
            throw new ExcepcionIdioma("No es posible aceptar a esta postulante");
        }
        pasticipantes.add(voluntario);
        voluntario.agregarVoluntariado(this);
        return aceptarParticipante;
    };

    public void puntuarParticipantes() {
        //
    }
}
