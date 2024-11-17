public class EventoExterior extends Voluntariado {
    
    private Idioma idiomaRequerido;

    public EventoExterior(int cantidadDeDias, String ubicacion,int puntuacionBaseEntregable, Idioma idiomaRequerido) {
        super(cantidadDeDias, ubicacion,puntuacionBaseEntregable);
        this.idiomaRequerido = idiomaRequerido;
    }

    public boolean aceptarPostulante(Postulante voluntario) {
        boolean aceptarParticipante = false;

        for (Idioma idioma : voluntario.getIdiomas()) {
            if (idioma.getNombre().equalsIgnoreCase(this.idiomaRequerido.getNombre()) && idioma.getNivel() >= this.idiomaRequerido.getNivel()) {
                aceptarParticipante = true;
            }
        }

        if(!aceptarParticipante) {
            throw new ExcepcionIdioma("No es posible aceptar a este postulante");
        }

        pasticipantes.add(voluntario);
        voluntario.agregarVoluntariado(this);
        return aceptarParticipante;
    };

    public void puntuarParticipantes() {
        for (Postulante participante: pasticipantes) {
            int puntuacion = puntuacionBaseEntregable + ( participante.getIdiomas().size() - 1 ) * 5;
            participante.recibirPuntos(puntuacion);
        }
    }
}
