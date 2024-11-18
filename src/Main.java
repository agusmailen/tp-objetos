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

        Hostel voluntariadoRosas = new Hostel(10, "Argentina - Buenos Aires", 10, 18, 1, 25);
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

        System.out.println("Agrego postulantes al voluntariado Maktub");
        System.out.println("*****************************************");


        System.out.println("Intento agregar a Camila al voluntariado Maktub: ");
        try {
            voluntariadoMaktub.aceptarPostulante(camila);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Carlos al voluntariado Maktub: ");
        try {
            voluntariadoMaktub.aceptarPostulante(carlos);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Matias al voluntariado Maktub: ");
        try {
            voluntariadoMaktub.aceptarPostulante(matias);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Micaela al voluntariado Maktub: ");
        try {
            voluntariadoMaktub.aceptarPostulante(micaela);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Rocio al voluntariado Maktub: ");
        try {
            voluntariadoMaktub.aceptarPostulante(rocio);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Juan al voluntariado Maktub: ");
        try {
            voluntariadoMaktub.aceptarPostulante(juan);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Maria al voluntariado Maktub: ");
        try {
            voluntariadoMaktub.aceptarPostulante(maria);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Ana al voluntariado Maktub: ");
        try {
            voluntariadoMaktub.aceptarPostulante(ana);
            System.out.println("Agregado");
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

        //Agrego a los participantes al voluntariado Rosas

        System.out.println("Agrego postulantes al voluntariado Rosas");
        System.out.println("*****************************************");

        System.out.println("Intento agregar a Camila al voluntariado Rosas: ");
        try {
            voluntariadoRosas.aceptarPostulante(camila);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Carlos al voluntariado Rosas: ");
        try {
            voluntariadoRosas.aceptarPostulante(carlos);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Matias al voluntariado Rosas: ");
        try {
            voluntariadoRosas.aceptarPostulante(matias);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Micaela al voluntariado Rosas: ");
        try {
            voluntariadoRosas.aceptarPostulante(micaela);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Rocio al voluntariado Rosas: ");
        try {
            voluntariadoRosas.aceptarPostulante(rocio);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Juan al voluntariado Rosas: ");
        try {
            voluntariadoRosas.aceptarPostulante(juan);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Maria al voluntariado Rosas: ");
        try {
            voluntariadoRosas.aceptarPostulante(maria);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Ana al voluntariado Rosas: ");
        try {
            voluntariadoRosas.aceptarPostulante(ana);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("\n");

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

        System.out.println("Agrego postulantes al voluntariado de Matematica");
        System.out.println("*****************************************");

        System.out.println("Intento agregar a Camila al voluntariado de Matematica: ");
        try {
            voluntariadoMatematica.aceptarPostulante(camila);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Carlos al voluntariado de Matematica: ");
        try {
            voluntariadoMatematica.aceptarPostulante(carlos);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Matias al voluntariado de Matematica: ");
        try {
            voluntariadoMatematica.aceptarPostulante(matias);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Micaela al voluntariado de Matematica: ");
        try {
            voluntariadoMatematica.aceptarPostulante(micaela);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Rocio al voluntariado de Matematica: ");
        try {
            voluntariadoMatematica.aceptarPostulante(rocio);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Juan al voluntariado de Matematica: ");
        try {
            voluntariadoMatematica.aceptarPostulante(juan);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Maria al voluntariado de Matematica: ");
        try {
            voluntariadoMatematica.aceptarPostulante(maria);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Ana al voluntariado de Matematica: ");
        try {
            voluntariadoMatematica.aceptarPostulante(ana);
            System.out.println("Agregado");
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

        System.out.println("Agrego postulantes al voluntariado de FIFA");
        System.out.println("*****************************************");

        System.out.println("Intento agregar a Camila al voluntariado de FIFA: ");
        try {
            voluntariadoFIFA.aceptarPostulante(camila);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Carlos al voluntariado de FIFA: ");
        try {
            voluntariadoFIFA.aceptarPostulante(carlos);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Matias al voluntariado de FIFA: ");
        try {
            voluntariadoFIFA.aceptarPostulante(matias);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Micaela al voluntariado de FIFA: ");
        try {
            voluntariadoFIFA.aceptarPostulante(micaela);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Rocio al voluntariado de FIFA: ");
        try {
            voluntariadoFIFA.aceptarPostulante(rocio);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Juan al voluntariado de FIFA: ");
        try {
            voluntariadoFIFA.aceptarPostulante(juan);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Maria al voluntariado de FIFA: ");
        try {
            voluntariadoFIFA.aceptarPostulante(maria);
            System.out.println("Agregado");
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("Intento agregar a Ana al voluntariado de FIFA: ");
        try {
            voluntariadoFIFA.aceptarPostulante(ana);
            System.out.println("Agregado");
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

        System.out.println("Puntuacion de todos los participantes antes de recibir puntos");
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

        voluntariadoFIFA.puntuarParticipantes();
        voluntariadoMatematica.puntuarParticipantes();
        voluntariadoMaktub.puntuarParticipantes();
        voluntariadoRosas.puntuarParticipantes();

        //solo le agrega una puntuacion a Carlos
        System.out.println("Puntuacion de todos los participantes luego de recibir puntos");
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

        //puntuacion de los voluntariados
        System.out.println("Puntuacion de los voluntariados antes de recibir puntos");
        System.out.println("*****************************************");
        System.out.println("Puntuacion de voluntariado Rosas: " + voluntariadoRosas.getPuntuacion());
        System.out.println("Puntuacion de voluntariado Maktub: " + voluntariadoMaktub.getPuntuacion());
        System.out.println("Puntuacion de voluntariado Matematica: " + voluntariadoMatematica.getPuntuacion());
        System.out.println("Puntuacion de voluntariado FIFA: " + voluntariadoFIFA.getPuntuacion());
        System.out.println("*****************************************");
        System.out.println("\n");

        carlos.puntuarVoluntariados(10);
        matias.puntuarVoluntariados(10);
        camila.puntuarVoluntariados(10);
        micaela.puntuarVoluntariados(10);
        rocio.puntuarVoluntariados(30);
        juan.puntuarVoluntariados(20);
        maria.puntuarVoluntariados(20);
        ana.puntuarVoluntariados(10);


        System.out.println("Puntuacion de los voluntariados luego de recibir puntos");
        System.out.println("*****************************************");
        System.out.println("Puntuacion de voluntariado Rosas: " + voluntariadoRosas.getPuntuacion());
        System.out.println("Puntuacion de voluntariado Maktub: " + voluntariadoMaktub.getPuntuacion());
        System.out.println("Puntuacion de voluntariado Matematica: " + voluntariadoMatematica.getPuntuacion());
        System.out.println("Puntuacion de voluntariado FIFA: " + voluntariadoFIFA.getPuntuacion());
        System.out.println("*****************************************");
        System.out.println("\n");
    }
}