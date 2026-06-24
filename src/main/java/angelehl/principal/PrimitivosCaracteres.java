package angelehl.principal;

public class PrimitivosCaracteres {

    public void descripcionChar(){

        /*char caracter='\u0040';
        char decimal=64;

        System.out.println("caracter = "+caracter);
        System.out.println("decimal = " + decimal);
        System.out.println(decimal==caracter);
        
        char simbolo='@';
        System.out.println("simbolo = " + simbolo);
        System.out.println(simbolo==caracter);*/

        var caracter='\u0040';
        var decimal=64;

        System.out.println("caracter = "+caracter);
        System.out.println("decimal = " + decimal);
        System.out.println(decimal==caracter);

        char espacio='\u0020';
        char retroceso='\b';
        char tabulador='\t';
        char nuevaLinea='\n';
        char retornoCarro= '\r'; //vuelve el cursor al inicio de la línea.

        System.out.println("Tipo char corresponde en bytes a: " + retroceso + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a: " + tabulador+ Character.SIZE);
        System.out.println("Valor máximo de tipo char: " + nuevaLinea + espacio + Character.MAX_VALUE);
        System.out.println("Valor mínimo de tipo char: " + Character.MIN_VALUE);


    }

}
