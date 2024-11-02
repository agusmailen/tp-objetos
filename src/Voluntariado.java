public  abstract class Voluntariado {

    //private Date fechaInicio;

    private int cantidadDeDias;

    private String ubicacion;

    public abstract boolean puedePostularse(Postulante voluntario);

    public abstract void finalizarEvento(Postulante voluntario);
}
