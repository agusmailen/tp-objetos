public class Main {
    public static void main(String[] args) {

        //Hostel Maktub en Córdoba

        Hostel voluntariadoRosas = new Hostel(9, "Bariloche", 21, 3, 10);

        Hostel voluntariadoMaktub = new Hostel(15, "Córdoba - Los Cocos", 19, 5, 25);
        Postulante Camila = new Postulante(21, 0);
        Postulante Carlos = new Postulante(23, 30);
        Postulante Matias = new Postulante(18, 26);

        Carlos.agregarVoluntariado(voluntariadoRosas);
        System.out.println("Experiencia de Carlos" + Carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + Matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + Camila.getVoluntariados());
        System.out.println("//");
        System.out.println("Camila puede postularse: " + voluntariadoMaktub.aceptarPostulante(Camila));
        System.out.println("Carlos puede postularse: " + voluntariadoMaktub.aceptarPostulante(Carlos));
        System.out.println("Matias puede postularse: " + voluntariadoMaktub.aceptarPostulante(Matias));
        System.out.println("//");
        System.out.println("Experiencia de Carlos" + Carlos.getVoluntariados());
        System.out.println("Experiencia de Matias" + Matias.getVoluntariados());
        System.out.println("Experiencia de Camila" + Camila.getVoluntariados());


        //Voluntariado educación

        Curso matematica = new Curso();

        Educacion voluntariadoMatematica = new Educacion(20, "España - Malaga", matematica);
        Postulante Micaela = new Postulante(23, 12);
        Postulante Rocio = new Postulante(22, 0);
        Rocio.agregarCurso(matematica);
        System.out.println("Experiencia de Micaela" + Micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + Rocio.getVoluntariados());
        System.out.println("//");
        System.out.println("Micaela puede postularse: " + voluntariadoMatematica.aceptarPostulante(Micaela));
        System.out.println("Rocio puede postularse: " + voluntariadoMatematica.aceptarPostulante(Rocio));
        System.out.println("//");
        System.out.println("Experiencia de Micaela" + Micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + Rocio.getVoluntariados());

        //Voluntariado exterior

        Idioma inglesMedio = new Idioma("Ingles", 2);
        Idioma inglesBasico = new Idioma("Ingles", 1);

        EventoExterior voluntariadoIngles = new EventoExterior(10, "Australia - Sidney", inglesMedio);

        Postulante Juan = new Postulante(25, 0);
        Postulante Maria = new Postulante(20, 0);
        Postulante Ana = new Postulante(22, 0);
        Juan.agregarIdioma(inglesMedio);
        Ana.agregarIdioma(inglesBasico);
        System.out.println("Experiencia de Juan" + Juan.getVoluntariados());
        System.out.println("Experiencia de Maria" + Maria.getVoluntariados());
        System.out.println("Experiencia de Ana" + Ana.getVoluntariados());
        System.out.println("//");

        try {
            System.out.println("Juan puede postularse: " + voluntariadoIngles.aceptarPostulante(Juan));
            System.out.println("Maria puede postularse: " + voluntariadoIngles.aceptarPostulante(Maria));
            System.out.println("Ana puede postularse: " + voluntariadoIngles.aceptarPostulante(Ana));
        } catch (ExcepcionIdioma excepcion) {
            System.out.println("Se capturó la excepción: " + excepcion.getMessage());
        }
        System.out.println("//");
        System.out.println("Experiencia de Juan" + Juan.getVoluntariados());
        System.out.println("Experiencia de Maria" + Maria.getVoluntariados());
        System.out.println("Experiencia de Ana" + Ana.getVoluntariados());
        System.out.println("final");
    }
}