public class Hostel extends Voluntariado {
    private int cupoMaximo;

    private int edadMinima;

    public Hostel(int cantidadDeDias, String ubicacion, int edadMinima, int cupoMaximo) {
        super(cantidadDeDias, ubicacion);
        this.edadMinima = edadMinima;
        this. cupoMaximo = cupoMaximo;
    }

    public boolean puedePostularse(Postulante voluntario){
        boolean aceptarParticipante = voluntario.getEdad() >= edadMinima &&  pasticipantes.size() < edadMinima;
        if(aceptarParticipante) {
            voluntario.agregarVoluntariado(this);
        }
        return aceptarParticipante;
    }

    public void puntuarParticipantes(Postulante voluntario){
        //TO DO: crear una interfaz para que sea recibida como parametro de esta función
    }
}
