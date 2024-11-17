import java.util.HashSet;

public  abstract class Voluntariado {

    protected int cantidadDeDias;

    protected String ubicacion;

    protected int puntuacion;

    protected int puntuacionBaseEntregable;

    protected HashSet<Postulante> pasticipantes = new HashSet<Postulante>();

    public Voluntariado(int cantidadDeDias, String ubicacion) {
        this.cantidadDeDias = cantidadDeDias;
        this.ubicacion = ubicacion;
    }

    public Voluntariado(int cantidadDeDias, String ubicacion,int puntuacionBaseEntregable) {
        this.cantidadDeDias = cantidadDeDias;
        this.ubicacion = ubicacion;
        this.puntuacionBaseEntregable = puntuacionBaseEntregable;
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
