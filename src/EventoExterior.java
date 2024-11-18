public class EventoExterior extends Voluntariado {
    
    private Idioma idiomaRequerido;

    public EventoExterior(int cantidadDeDias, String ubicacion,int puntuacionBaseEntregable, Idioma idiomaRequerido) {
        super(cantidadDeDias, ubicacion,puntuacionBaseEntregable);
        this.idiomaRequerido = idiomaRequerido;
    }

    public void aceptarPostulante(Postulante voluntario) throws ExcepcionVoluntariado {

        boolean aceptarPostulante = false;
        boolean sabeElIdioma = false;
        boolean tieneElNivel = false;

        for(Idioma idioma : voluntario.getIdiomas()) {
            if(idioma.getNombre().equalsIgnoreCase(this.idiomaRequerido.getNombre())) {
                sabeElIdioma = true;
                if(idioma.getNivel() >= this.idiomaRequerido.getNivel()) {
                    tieneElNivel = true;
                }
            }
        }

        if(sabeElIdioma && tieneElNivel) {
            aceptarPostulante = true;
        }

        if(!aceptarPostulante && !sabeElIdioma) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante porque no sabe el idioma requerido");
        }

        if(!aceptarPostulante && !tieneElNivel) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante porque no tiene el nivel requerido del idioma");
        }

        participantes.add(voluntario);
        voluntario.agregarVoluntariado(this);


    }

   @Override
    public void puntuarParticipantes() {
        for (Postulante participante: participantes) {
            int puntuacion = puntuacionBaseEntregable + ( participante.getIdiomas().size() - 1 ) * 5;
            participante.recibirPuntos(puntuacion);
        }
    }
}
