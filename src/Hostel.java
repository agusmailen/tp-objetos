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
        boolean tieneEdadMinima = false;
        boolean tienePuntuacionMinima = false;
        boolean tieneCupoMaximo = false;

        if(voluntario.getEdad() >= this.edadMinima) {
            tieneEdadMinima = true;
        }

        if(voluntario.getPuntuacion() >= this.puntuacionMinima) {
            tienePuntuacionMinima = true;
        }

        if(participantes.size() < this.cupoMaximo) {
            tieneCupoMaximo = true;
        }

        aceptarPostulante = tieneEdadMinima && tienePuntuacionMinima && tieneCupoMaximo;

        if(!aceptarPostulante && !tieneEdadMinima) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante porque no tiene la edad mínima requerida");
        }

        if(!aceptarPostulante && !tienePuntuacionMinima) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante porque no tiene la puntuación mínima requerida");
        }

        if(!aceptarPostulante && !tieneCupoMaximo) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante porque se ha alcanzado el cupo máximo en el voluntariado");
        }

        participantes.add(voluntario);
        voluntario.agregarVoluntariado(this);
    }


}
