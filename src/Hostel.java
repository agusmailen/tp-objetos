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
    
    public void aceptarPostulante(Postulante voluntario) throws ExcepcionVoluntariado{
        boolean aceptarPostulante = false;
        boolean tieneEdadMinima = voluntario.getEdad() >= this.edadMinima;
        boolean tienePuntuacionMinima = voluntario.getPuntuacion() >= this.puntuacionMinima;
        boolean tieneCupo = participantes.size() < this.cupoMaximo;

        aceptarPostulante = tieneEdadMinima && tienePuntuacionMinima && tieneCupo;

        if(!aceptarPostulante && !tieneEdadMinima) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante porque no tiene la edad mínima requerida");
        }

        if(!aceptarPostulante && !tienePuntuacionMinima) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante porque no tiene la puntuación mínima requerida");
        }

        if(!aceptarPostulante && !tieneCupo) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante porque se ha alcanzado el cupo máximo en el voluntariado");
        }

        participantes.add(voluntario);
        voluntario.agregarVoluntariado(this);
    }
}
