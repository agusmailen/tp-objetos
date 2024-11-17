import java.util.HashSet;

public  abstract class Voluntariado {

    protected int cantidadDeDias;

    protected String ubicacion;

    protected int puntuacion;

    protected int puntuacionBaseEntregable;

    protected HashSet<Postulante> pasticipantes = new HashSet<Postulante>();

    public Voluntariado(int cantidadDeDias, String ubicacion, int puntuacionBaseEntregable) {
        this.cantidadDeDias = cantidadDeDias;
        this.ubicacion = ubicacion;
        this.puntuacionBaseEntregable = puntuacionBaseEntregable;
    }

    public HashSet<Postulante> getPasticipantes() {
        return pasticipantes;
    }

    public abstract void aceptarPostulante(Postulante voluntario);

    public  void puntuarParticipantes() {
        for (Postulante participante: pasticipantes) {
            participante.recibirPuntos(puntuacionBaseEntregable);
        }
    }

    public  void recibirPuntos(int puntuacionDada) {
        this.puntuacion += puntuacionDada;
    }

}
