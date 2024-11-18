public class EventoExterior extends Voluntariado {
    
    private Idioma idiomaRequerido;

    public EventoExterior(int cantidadDeDias, String ubicacion,int puntuacionBaseEntregable, Idioma idiomaRequerido) {
        super(cantidadDeDias, ubicacion,puntuacionBaseEntregable);
        this.idiomaRequerido = idiomaRequerido;
    }

    public void aceptarPostulante(Postulante voluntario) throws ExcepcionVoluntariado {
        boolean aceptarParticipante = false;

        for (Idioma idioma : voluntario.getIdiomas()) {
            if (idioma.getNombre().equalsIgnoreCase(this.idiomaRequerido.getNombre()) && idioma.getNivel() >= this.idiomaRequerido.getNivel()) {
                aceptarParticipante = true;
            }
        }

        if(!aceptarParticipante) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante");
        }

        participantes.add(voluntario);
        voluntario.agregarVoluntariado(this);
    };

   @Override
    public void puntuarParticipantes() {
        for (Postulante participante: participantes) {
            int puntuacion = puntuacionBaseEntregable + ( participante.getIdiomas().size() - 1 ) * 5;
            participante.recibirPuntos(puntuacion);
        }
    }
}
