import java.util.HashSet;

public  abstract class Voluntariado {

    //private Date fechaInicio;

    private int cantidadDeDias;

    private String ubicacion;

    private HashSet<Postulante> pasticipantes = new HashSet<Postulante>();

    public abstract boolean puedePostularse(Postulante voluntario);

    public abstract void finalizarEvento(Postulante voluntario);
}
