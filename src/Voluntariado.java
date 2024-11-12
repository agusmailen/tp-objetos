import java.util.HashSet;

public  abstract class Voluntariado {

    protected int cantidadDeDias;

    protected String ubicacion;

    protected int puntuacion;

    protected HashSet<Postulante> pasticipantes = new HashSet<Postulante>();

    public Voluntariado(int cantidadDeDias, String ubicacion) {
        this.cantidadDeDias = cantidadDeDias;
        this.ubicacion = ubicacion;
    }

    public HashSet<Postulante> getPasticipantes() {
        return pasticipantes;
    }

    public abstract boolean aceptarPostulante(Postulante voluntario);

    public abstract void puntuarParticipantes();

    public  void recibirPuntos(int puntuacionDada) {
        this.puntuacion += puntuacionDada;
    }

}
