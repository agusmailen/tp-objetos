import java.util.HashSet;

public  abstract class Voluntariado {

    protected int cantidadDeDias;

    protected String ubicacion;

    protected int puntuacion;

    protected int puntuacionBaseEntregable;

    protected HashSet<Postulante> participantes = new HashSet<Postulante>();

    public Voluntariado(int cantidadDeDias, String ubicacion, int puntuacionBaseEntregable) {
        this.cantidadDeDias = cantidadDeDias;
        this.ubicacion = ubicacion;
        this.puntuacionBaseEntregable = puntuacionBaseEntregable;
    }

    public HashSet<Postulante> getparticipantes() {
        return participantes;
    }

    public abstract void aceptarPostulante(Postulante voluntario);

    public  void puntuarParticipantes() {
        for (Postulante participante: participantes) {
            participante.recibirPuntos(puntuacionBaseEntregable);
        }
    }

    public  void recibirPuntos(int puntuacionDada) {
        this.puntuacion += puntuacionDada;
    }

}
