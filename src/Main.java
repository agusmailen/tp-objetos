public class Main {
    public static void main(String[] args) {

        //Postulantes

        Postulante camila = new Postulante(21, 0);
        Postulante carlos = new Postulante(23, 30);
        Postulante matias = new Postulante(18, 26);
        Postulante micaela = new Postulante(23, 12);
        Postulante rocio = new Postulante(22, 0);
        Postulante juan = new Postulante(25, 0);
        Postulante maria = new Postulante(20, 0);
        Postulante ana = new Postulante(22, 0);

        //Voluntariodos de Hostel

        Hostel voluntariadoRosas = new Hostel(10, "Argentina - Buenos Aires", 10, 18, 5, 25);
        Hostel voluntariadoMaktub = new Hostel(15, "Córdoba - Los Cocos", 15,19, 5, 25);

        //Voluntariado de Educacion

        Curso matematica = new Curso();
        Educacion voluntariadoMatematica = new Educacion(20, "España - Malaga", 20,matematica);

        //Voluntariado exterior

        Idioma inglesMedio = new Idioma("Ingles", 2);
        Idioma inglesBasico = new Idioma("Ingles", 1);
        Idioma francesBasico = new Idioma("Frances", 1);

        EventoExterior voluntariadoFIFA = new EventoExterior(10, "Doha - Qatar",20, inglesMedio);


        //Agrego a Carlos al voluntariado Rosas y veo el estado de todos los postulantes

        System.out.println("Experiencia de todos los participantes");
        System.out.println("*****************************************");
        System.out.println("Experiencia de Carlos" + carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + camila.getVoluntariados());
        System.out.println("Experiencia de Micaela" + micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + rocio.getVoluntariados());
        System.out.println("Experiencia de Juan" + juan.getVoluntariados());
        System.out.println("Experiencia de Maria" + maria.getVoluntariados());
        System.out.println("Experiencia de ana" + ana.getVoluntariados());
        System.out.println("*****************************************");
        System.out.println("\n");

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
        try {
            voluntariadoMaktub.aceptarPostulante(micaela);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMaktub.aceptarPostulante(rocio);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMaktub.aceptarPostulante(juan);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMaktub.aceptarPostulante(maria);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMaktub.aceptarPostulante(ana);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("\n");

        //veo el estado de los postulantes luego de intentar agregarlos a los voluntariados de maktub

        System.out.println("Experiencia de todos los participantes");
        System.out.println("*****************************************");
        System.out.println("Experiencia de Carlos" + carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + camila.getVoluntariados());
        System.out.println("Experiencia de Micaela" + micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + rocio.getVoluntariados());
        System.out.println("Experiencia de Juan" + juan.getVoluntariados());
        System.out.println("Experiencia de Maria" + maria.getVoluntariados());
        System.out.println("Experiencia de Ana" + ana.getVoluntariados());
        System.out.println("*****************************************");
        System.out.println("\n");

        //Agrego a rocio el curso de matematica
        rocio.agregarCurso(matematica);

        //try catch para intentar agregar a los postulantes a los voluntariados de matematica

        try {
            voluntariadoMatematica.aceptarPostulante(camila);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMatematica.aceptarPostulante(carlos);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMatematica.aceptarPostulante(matias);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMatematica.aceptarPostulante(micaela);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMatematica.aceptarPostulante(rocio);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMatematica.aceptarPostulante(juan);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMatematica.aceptarPostulante(maria);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoMatematica.aceptarPostulante(ana);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("\n");


        //veo el estado de los postulantes luego de intentar agregarlos a los voluntariados de matematica
        System.out.println("Experiencia de todos los participantes");
        System.out.println("*****************************************");
        System.out.println("Experiencia de Carlos" + carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + camila.getVoluntariados());
        System.out.println("Experiencia de Micaela" + micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + rocio.getVoluntariados());
        System.out.println("Experiencia de Juan" + juan.getVoluntariados());
        System.out.println("Experiencia de Maria" + maria.getVoluntariados());
        System.out.println("Experiencia de Ana" + ana.getVoluntariados());
        System.out.println("*****************************************");
        System.out.println("\n");

        //agrego a los postulantes al voluntariado de ingles

        juan.agregarIdioma(inglesMedio);
        juan.agregarIdioma(francesBasico);
        ana.agregarIdioma(inglesBasico);
        maria.agregarIdioma(inglesMedio);

        //try catch para intentar agregar a los postulantes a los voluntariados de ingles
        try {
            voluntariadoFIFA.aceptarPostulante(camila);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoFIFA.aceptarPostulante(carlos);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoFIFA.aceptarPostulante(matias);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoFIFA.aceptarPostulante(micaela);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoFIFA.aceptarPostulante(rocio);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoFIFA.aceptarPostulante(juan);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoFIFA.aceptarPostulante(maria);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        try {
            voluntariadoFIFA.aceptarPostulante(ana);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("\n");

        //veo el estado de los postulantes luego de intentar agregarlos a los voluntariados de ingles
        System.out.println("Experiencia de todos los participantes");
        System.out.println("*****************************************");
        System.out.println("Experiencia de Carlos" + carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + camila.getVoluntariados());
        System.out.println("Experiencia de Micaela" + micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + rocio.getVoluntariados());
        System.out.println("Experiencia de Juan" + juan.getVoluntariados());
        System.out.println("Experiencia de Maria" + maria.getVoluntariados());
        System.out.println("Experiencia de Ana" + ana.getVoluntariados());
        System.out.println("*****************************************");
        System.out.println("\n");

        //puntuacion de los participantes
        voluntariadoFIFA.puntuarParticipantes();
        voluntariadoMatematica.puntuarParticipantes();
        voluntariadoMaktub.puntuarParticipantes();
        voluntariadoRosas.puntuarParticipantes();

        //solo le agrega una puntuacion a Carlos
        System.out.println("Puntuacion de todos los participantes");
        System.out.println("*****************************************");
        System.out.println("Puntuacion de Carlos: " + carlos.getPuntuacion());
        System.out.println("Puntuacion de Matias: " + matias.getPuntuacion());
        System.out.println("Puntuacion de Camila: " + camila.getPuntuacion());
        System.out.println("Puntuacion de Micaela: " + micaela.getPuntuacion());
        System.out.println("Puntuacion de Rocio: " + rocio.getPuntuacion());
        System.out.println("Puntuacion de Juan: " + juan.getPuntuacion());
        System.out.println("Puntuacion de Maria: " + maria.getPuntuacion());
        System.out.println("Puntuacion de Ana: " + ana.getPuntuacion());
        System.out.println("*****************************************");
        System.out.println("\n");
    }
}