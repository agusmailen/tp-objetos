public class Educacion extends Voluntariado {

    private Curso cursoRequerido;

    public Educacion(int cantidadDeDias, String ubicacion, int puntuacionBaseEntregable,  Curso cursoRequerido) {
        super(cantidadDeDias, ubicacion, puntuacionBaseEntregable);
        this.cursoRequerido = cursoRequerido;
    };

    public void aceptarPostulante(Postulante voluntario) throws ExcepcionVoluntariado {
       
        if (!(voluntario.getCursos().contains(cursoRequerido))) {
            throw new ExcepcionVoluntariado("No es posible aceptar a este postulante porque no tiene el curso requerido");
        }

        participantes.add(voluntario);
        voluntario.agregarVoluntariado(this);
    };
}
