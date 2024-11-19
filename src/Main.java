public class Main {

    public static void postularVoluntario(Postulante voluntario, Voluntariado voluntariadoSeleccinado) {
        try {
            voluntariadoSeleccinado.aceptarPostulante(voluntario);
        } catch (ExcepcionVoluntariado excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
    }
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

        //Intento agregar a los postulantes al voluntariado de Maktub

        System.out.println("Agrego postulantes al voluntariado Maktub");
        System.out.println("*****************************************");


        System.out.println("Intento agregar a Camila al voluntariado Maktub: ");
        postularVoluntario(camila, voluntariadoMaktub);
        System.out.println("Intento agregar a Carlos al voluntariado Maktub: ");
        postularVoluntario(carlos, voluntariadoMaktub);
        System.out.println("Intento agregar a Matias al voluntariado Maktub: ");
        postularVoluntario(matias, voluntariadoMaktub);
        System.out.println("Intento agregar a Micaela al voluntariado Maktub: ");
        postularVoluntario(micaela, voluntariadoMaktub);
        System.out.println("Intento agregar a Rocio al voluntariado Maktub: ");
        postularVoluntario(rocio, voluntariadoMaktub);
        System.out.println("Intento agregar a Juan al voluntariado Maktub: ");
        postularVoluntario(juan, voluntariadoMaktub);
        System.out.println("Intento agregar a Maria al voluntariado Maktub: ");
        postularVoluntario(maria, voluntariadoMaktub);
        System.out.println("Intento agregar a Ana al voluntariado Maktub: ");
        postularVoluntario(ana, voluntariadoMaktub);
        System.out.println("\n");

        //veo el estado de los postulantes luego de intentar agregarlos a los voluntariados de maktub
        System.out.println("Experiencia de todos los participantes luego de postularse a Maktub");
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
        postularVoluntario(camila, voluntariadoRosas);
        System.out.println("Intento agregar a Carlos al voluntariado Rosas: ");
        postularVoluntario(carlos, voluntariadoRosas);
        System.out.println("Intento agregar a Matias al voluntariado Rosas: ");
        postularVoluntario(matias, voluntariadoRosas);
        System.out.println("Intento agregar a Micaela al voluntariado Rosas: ");
        postularVoluntario(micaela, voluntariadoRosas);
        System.out.println("Intento agregar a Rocio al voluntariado Rosas: ");
        postularVoluntario(rocio, voluntariadoRosas);
        System.out.println("Intento agregar a Juan al voluntariado Rosas: ");
        postularVoluntario(juan, voluntariadoRosas);
        System.out.println("Intento agregar a Maria al voluntariado Rosas: ");
        postularVoluntario(maria, voluntariadoRosas);
        System.out.println("Intento agregar a Ana al voluntariado Rosas: ");
        postularVoluntario(ana, voluntariadoRosas);
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

        //Intento agregar a los postulantes a los voluntariados de matematica

        System.out.println("Agrego postulantes al voluntariado de Matematica");
        System.out.println("*****************************************");

        System.out.println("Intento agregar a Camila al voluntariado de Matematica: ");
        postularVoluntario(camila, voluntariadoMatematica);
        System.out.println("Intento agregar a Carlos al voluntariado de Matematica: ");
        postularVoluntario(carlos, voluntariadoMatematica);
        System.out.println("Intento agregar a Matias al voluntariado de Matematica: ");
        postularVoluntario(matias, voluntariadoMatematica);
        System.out.println("Intento agregar a Micaela al voluntariado de Matematica: ");
        postularVoluntario(micaela, voluntariadoMatematica);
        System.out.println("Intento agregar a Rocio al voluntariado de Matematica: ");
        postularVoluntario(rocio, voluntariadoMatematica);
        System.out.println("Intento agregar a Juan al voluntariado de Matematica: ");
        postularVoluntario(juan, voluntariadoMatematica);
        System.out.println("Intento agregar a Maria al voluntariado de Matematica: ");
        postularVoluntario(maria, voluntariadoMatematica);
        System.out.println("Intento agregar a Ana al voluntariado de Matematica: ");
        postularVoluntario(ana, voluntariadoMatematica);
        System.out.println("\n");


        //veo el estado de los postulantes luego de intentar agregarlos a los voluntariados de matematica
        System.out.println("Experiencia de todos los participantes luego de postularse al voluntariado de enseñar Matematica");
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

        //Intentar agregar a los postulantes a los voluntariados de ingles

        System.out.println("Agrego postulantes al voluntariado de FIFA");
        System.out.println("*****************************************");

        System.out.println("Intento agregar a Camila al voluntariado de FIFA: ");
        postularVoluntario(camila, voluntariadoFIFA);
        System.out.println("Intento agregar a Carlos al voluntariado de FIFA: ");
        postularVoluntario(carlos, voluntariadoFIFA);
        System.out.println("Intento agregar a Matias al voluntariado de FIFA: ");
        postularVoluntario(matias, voluntariadoFIFA);
        System.out.println("Intento agregar a Micaela al voluntariado de FIFA: ");
        postularVoluntario(micaela, voluntariadoFIFA);
        System.out.println("Intento agregar a Rocio al voluntariado de FIFA: ");
        postularVoluntario(rocio, voluntariadoFIFA);
        System.out.println("Intento agregar a Juan al voluntariado de FIFA: ");
        postularVoluntario(juan, voluntariadoFIFA);
        System.out.println("Intento agregar a Maria al voluntariado de FIFA: ");
        postularVoluntario(maria, voluntariadoFIFA);
        System.out.println("Intento agregar a Ana al voluntariado de FIFA: ");
        postularVoluntario(ana, voluntariadoFIFA);
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