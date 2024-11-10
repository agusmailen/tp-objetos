import java.util.HashSet;

public  abstract class Voluntariado {

    private int cantidadDeDias;

    private String ubicacion;

    private HashSet<Postulante> pasticipantes = new HashSet<Postulante>();

    public abstract boolean puedePostularse(Postulante voluntario);

    public abstract void puntuarParticipantes(Postulante voluntario);
    //TODO: crear una interfaz para que sea recibida como parametro de esta función
}
