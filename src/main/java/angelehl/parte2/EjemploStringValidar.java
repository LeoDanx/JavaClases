package angelehl.parte2;

public class EjemploStringValidar {

    public void cuerpoStringValidar() {

        String curso = null;

        boolean esNulo = curso ==null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "";//"Programacion Java";
        }
        //Un espacio cuenta como caracter

        boolean esVacio = curso.length()==0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();//-->El metodo empty tiene que ver con longitud
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco =  curso.isBlank();//-->isBlank es de java 11 en adelante. Se enfoca en los espacios en blanco

        if(esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println(" Bienvenido al curso ".concat(curso));//cuidado con los nulos en concat
        }

    }
}
