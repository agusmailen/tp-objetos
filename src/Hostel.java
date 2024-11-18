public class Hostel extends Voluntariado {
    private int cupoMaximo;

    private int edadMinima;

    private int puntuacionMinima;

    public Hostel(int cantidadDeDias, String ubicacion, int puntuacionBaseEntregable, int edadMinima, int cupoMaximo, int puntuacionMinima) {
        super(cantidadDeDias, ubicacion, puntuacionBaseEntregable);
        this.edadMinima = edadMinima;
        this. cupoMaximo = cupoMaximo;
        this.puntuacionMinima = puntuacionMinima;
    }

    public void aceptarPostulante(Postulante voluntario) throws ExcepcionVoluntariado {
        boolean aceptarParticipante = voluntario.getEdad() >= edadMinima &&  participantes.size() < cupoMaximo && voluntario.getPuntuacion() >= puntuacionMinima;
        if(!aceptarParticipante) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante");
        }
        participantes.add(voluntario);
        voluntario.agregarVoluntariado(this);
    }

    public void puntuarParticipantes(){
        for (Postulante participante: participantes) {
            int puntuacion = 10;
            participante.recibirPuntos(puntuacion);
        }
    }
}
