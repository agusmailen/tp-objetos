import java.util.HashSet;

public  abstract class Voluntariado {

    protected int cantidadDeDias;

    protected String ubicacion;

    protected HashSet<Postulante> pasticipantes = new HashSet<Postulante>();

    public Voluntariado(int cantidadDeDias, String ubicacion) {
        this.cantidadDeDias = cantidadDeDias;
        this.ubicacion = ubicacion;
    }

    public HashSet<Postulante> getPasticipantes() {
        return pasticipantes;
    }

    public abstract boolean puedePostularse(Postulante voluntario);

    public abstract void puntuarParticipantes(Postulante voluntario);
    //TO DO: crear una interfaz para que sea recibida como parametro de esta función
}
