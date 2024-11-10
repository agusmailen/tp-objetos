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
        System.out.println("Camila puede postularse: " + voluntariadoMaktub.puedePostularse(Camila));
        System.out.println("Carlos puede postularse: " + voluntariadoMaktub.puedePostularse(Carlos));
        System.out.println("Matias puede postularse: " + voluntariadoMaktub.puedePostularse(Matias));
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
        System.out.println("Micaela puede postularse: " + voluntariadoMatematica.puedePostularse(Micaela));
        System.out.println("Rocio puede postularse: " + voluntariadoMatematica.puedePostularse(Rocio));
        System.out.println("//");
        System.out.println("Experiencia de Micaela" + Micaela.getVoluntariados());
        System.out.println("Experiencia de Rocio" + Rocio.getVoluntariados());

    }
}