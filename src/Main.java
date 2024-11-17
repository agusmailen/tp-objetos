public class Main {
    public static void main(String[] args) {

        //Hostel Maktub en Córdoba

        Hostel voluntariadoRosas = new Hostel(9, "Bariloche", 21, 3, 10);

        Hostel voluntariadoMaktub = new Hostel(15, "Córdoba - Los Cocos", 19, 5, 25);
        Postulante camila = new Postulante(21, 0);
        Postulante carlos = new Postulante(23, 30);
        Postulante matias = new Postulante(18, 26);

        carlos.agregarVoluntariado(voluntariadoRosas);
        System.out.println("Experiencia de Carlos" + carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + camila.getVoluntariados());
        System.out.println("//");
        System.out.println("Camila puede postularse: " + voluntariadoMaktub.aceptarPostulante(camila));
        System.out.println("Carlos puede postularse: " + voluntariadoMaktub.aceptarPostulante(carlos));
        System.out.println("Matias puede postularse: " + voluntariadoMaktub.aceptarPostulante(matias));
        System.out.println("//");
        System.out.println("Experiencia de Carlos" + carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + camila.getVoluntariados());


        //Voluntariado educación

        Curso matematica = new Curso();

        Educacion voluntariadoMatematica = new Educacion(20, "España - Malaga", matematica);
        Postulante micaela = new Postulante(23, 12);
        Postulante rocio = new Postulante(22, 0);
        rocio.agregarCurso(matematica);
        System.out.println("Experiencia de micaela" + micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + rocio.getVoluntariados());
        System.out.println("//");
        System.out.println("micaela puede postularse: " + voluntariadoMatematica.aceptarPostulante(micaela));
        System.out.println("Rocio puede postularse: " + voluntariadoMatematica.aceptarPostulante(rocio));
        System.out.println("//");
        System.out.println("Experiencia de micaela" + micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + rocio.getVoluntariados());

        //Voluntariado exterior

        Idioma inglesMedio = new Idioma("Ingles", 2);
        Idioma inglesBasico = new Idioma("Ingles", 1);

        EventoExterior voluntariadoIngles = new EventoExterior(10, "Australia - Sidney",30, inglesMedio);

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
            System.out.println("Juan puede postularse: " + voluntariadoIngles.aceptarPostulante(juan));
            System.out.println("Maria puede postularse: " + voluntariadoIngles.aceptarPostulante(maria));
            System.out.println("ana puede postularse: " + voluntariadoIngles.aceptarPostulante(ana));
        } catch (ExcepcionIdioma excepcion) {
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

        System.out.println(juan.getPuntuacion());
        System.out.println(rocio.getPuntuacion());
        System.out.println(carlos.getPuntuacion());
    }

    //aplicar metodo putuar en hostel y en educacion
    //modificar metodo acptarParticipante boolean por void
    //crear una sola excepcion
    //modificar constructor para voluntariado para asignarme una puntuacion a dar por defecto.
}