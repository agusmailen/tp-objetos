public class Main {
    public static void main(String[] args) {

        //Postulantes

        Postulante camila = new Postulante(21, 0);
        Postulante carlos = new Postulante(23, 30);
        Postulante matias = new Postulante(18, 26);

        //Voluntariodos de Hostel

        Hostel voluntariadoRosas = new Hostel(10, "Argentina - Buenos Aires", 10, 18, 5, 25);
        Hostel voluntariadoMaktub = new Hostel(15, "Córdoba - Los Cocos", 15,19, 5, 25);

        //Voluntariado de Educacion

        Curso matematica = new Curso();
        Educacion voluntariadoMatematica = new Educacion(20, "España - Malaga", 20,matematica);

        //Voluntariado exterior

        Idioma inglesMedio = new Idioma("Ingles", 2);
        Idioma inglesBasico = new Idioma("Ingles", 1);

        EventoExterior voluntariadoIngles = new EventoExterior(10, "Australia - Sidney",30, inglesMedio);


        //Agrego a Carlos al voluntariado Rosas y veo el estado de todos los postulantes
        //carlos.agregarVoluntariado(voluntariadoRosas);

        System.out.println("Experiencia de todos los participantes");
        System.out.println("*****************************************");
        System.out.println("Experiencia de Carlos" + carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + camila.getVoluntariados());
        System.out.println("*****************************************");

        //try catch para intentar agregar a los postulantes a los voluntariados
        try {
            voluntariadoMaktub.aceptarPostulante(camila);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }

        try {
            voluntariadoMaktub.aceptarPostulante(carlos);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }

        try {
            voluntariadoMaktub.aceptarPostulante(matias);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }

        //veo el estado de los postulantes luego de intentar agregarlos a los voluntariados

        System.out.println("Experiencia de todos los participantes");
        System.out.println("*****************************************");
        System.out.println("Experiencia de Carlos" + carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + camila.getVoluntariados());
        System.out.println("*****************************************");

        System.out.println("//");
        System.out.println("Experiencia de Carlos" + carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + camila.getVoluntariados());



        Postulante micaela = new Postulante(23, 12);
        Postulante rocio = new Postulante(22, 0);
        rocio.agregarCurso(matematica);
        System.out.println("Experiencia de micaela" + micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + rocio.getVoluntariados());
        System.out.println("//");
        try {
            voluntariadoMatematica.aceptarPostulante(micaela);
            voluntariadoMatematica.aceptarPostulante(rocio);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("//");
        System.out.println("Experiencia de micaela" + micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + rocio.getVoluntariados());

        

        Postulante juan = new Postulante(25, 0);
        Postulante maria = new Postulante(20, 0);
        Postulante ana = new Postulante(22, 0);
        juan.agregarIdioma(inglesMedio);
        ana.agregarIdioma(inglesBasico);
        System.out.println("Experiencia de Juan" + juan.getVoluntariados());
        System.out.println("Experiencia de Maria" + maria.getVoluntariados());
        System.out.println("Experiencia de ana" + ana.getVoluntariados());
        System.out.println("//");

        try {
            voluntariadoIngles.aceptarPostulante(juan);
            voluntariadoIngles.aceptarPostulante(maria);
            voluntariadoIngles.aceptarPostulante(ana);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("//");
        System.out.println("Experiencia de Juan" + juan.getVoluntariados());
        System.out.println("Experiencia de Maria" + maria.getVoluntariados());
        System.out.println("Experiencia de ana" + ana.getVoluntariados());
        System.out.println("final");

        voluntariadoIngles.puntuarParticipantes();
        voluntariadoMatematica.puntuarParticipantes();
        voluntariadoMaktub.puntuarParticipantes();
        voluntariadoRosas.puntuarParticipantes();

        //solo le agrega una puntuacion a Carlos

        System.out.println("Puntuacion de Juan: " + juan.getPuntuacion());
        System.out.println("Puntuacion de Rocio: " + rocio.getPuntuacion());
        System.out.println("Puntuacio de Carlos: " + carlos.getPuntuacion());
    }
}