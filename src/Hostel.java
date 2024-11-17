public class Hostel extends Voluntariado {
    private int cupoMaximo;

    private int edadMinima;

    private int puntuacionMinima;

    public Hostel(int cantidadDeDias, String ubicacion, int edadMinima, int cupoMaximo, int puntuacionMinima) {
        super(cantidadDeDias, ubicacion);
        this.edadMinima = edadMinima;
        this. cupoMaximo = cupoMaximo;
        this.puntuacionMinima = puntuacionMinima;
    }

    public void aceptarPostulante(Postulante voluntario) throws ExcepcionVoluntariado {
        boolean aceptarParticipante = voluntario.getEdad() >= edadMinima &&  pasticipantes.size() < cupoMaximo && voluntario.getPuntuacion() >= puntuacionMinima;
        if(!aceptarParticipante) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante");
        }
        pasticipantes.add(voluntario);
        voluntario.agregarVoluntariado(this);
    }

    public void puntuarParticipantes(){
        for (Postulante participante: pasticipantes) {
            int puntuacion = 10;
            participante.recibirPuntos(puntuacion);
        }
    }


}
