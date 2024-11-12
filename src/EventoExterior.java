public class EventoExterior extends Voluntariado {
    
    private Idioma idiomaRequerido;

    public EventoExterior(int cantidadDeDias, String ubicacion, Idioma idiomaRequerido) {
        super(cantidadDeDias, ubicacion);
        this.idiomaRequerido = idiomaRequerido;
    }

    public boolean puedePostularse(Postulante voluntario) {
        boolean puedePostularse = false;
        for (Idioma idioma : voluntario.getIdiomas()) {
            if (idioma.getNombre().equals(this.idiomaRequerido.getNombre()) && idioma.getNivel() >= this.idiomaRequerido.getNivel()) {
                puedePostularse = true;
                voluntario.agregarVoluntariado(this);
                pasticipantes.add(voluntario);
            }
        }

        return puedePostularse;
    };

    public void puntuarParticipantes(Postulante voluntario) {}
}
