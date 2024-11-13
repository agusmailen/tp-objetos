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

    public boolean aceptarPostulante(Postulante voluntario){
        boolean aceptarParticipante = voluntario.getEdad() >= edadMinima &&  pasticipantes.size() < cupoMaximo && voluntario.getPuntuacion() >= puntuacionMinima;
        if(aceptarParticipante) {
            voluntario.agregarVoluntariado(this);
            pasticipantes.add(voluntario);
        }
        return aceptarParticipante;
    }

    public void puntuarParticipantes(){
        //
    }

    public void recibirPuntos() {

    }

}
