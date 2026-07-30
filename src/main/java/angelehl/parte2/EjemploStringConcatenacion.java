package angelehl.parte2;

public class EjemploStringConcatenacion {

    public void descripcionString(){

        String curso = "Programacion Java";
        String profesor = "Compucleto Martinez";

        String detalle = curso + " con el instructor "+profesor;
        System.out.println(detalle);

        int numeroA =10;
        int numeroB =5;

        System.out.println(detalle + numeroA + numeroB);//Cuando utilizas "+" para concatenar, java usa stringbuilder
        System.out.println(detalle + (numeroA + numeroB));//Los paréntesis tienen preferencia.
        System.out.println(numeroA + numeroB + detalle);//Al no poder sumar el string, concatena

        String detalle2 = curso.concat(profesor);
        System.out.println("detalle2: " + detalle2);
        String detalle3 = curso.concat(" con ".concat(profesor));//Esta forma de concatenar es mas eficiente que con +
        System.out.println("detalle3: " + detalle3);


    }


}
