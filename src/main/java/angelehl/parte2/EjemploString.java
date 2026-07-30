package angelehl.parte2;

public class EjemploString {

    public void descripcionString(){

        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");
        String curso3 = new String("programacion java");
        String curso4 = "Programacion Java";

        boolean esIgual = curso==curso2;
        System.out.println("Curso esIgual: " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("Curso esIgual: " + esIgual);

        esIgual = curso2.equalsIgnoreCase(curso3);
        System.out.println("Curso esIgual: " + esIgual);

        esIgual = curso ==curso4;//Cuando tienen el mismo valor, se asigna una sola referencia.
        System.out.println("Curso esIgual: " + esIgual);

    }


}
