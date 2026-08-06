package angelehl.parte3;

public class OperadorInstaceOf {

    public void cuerpoOperadorInstaceOf(){

        String texto = "¡Creando un objeto de la clase String...que tal!";

        Integer num = 7;//Por debajo el compilador hace, Integer.valueof(7)

        boolean b1 = texto instanceof String;
        //boolean b2 = texto instanceof Integer;//da error porque no tienen ancestros en comun, son totalmente independientes
        Boolean b3 = texto instanceof Object;

        System.out.println("Es String: "+b1);
        System.out.println("Es String: "+b3);

        b3 = num instanceof Integer;
        System.out.println("Es Integer: "+b3);

        /*b3 = num instanceof Long;//int no se puede convertir a long
        System.out.println("Es Integer: "+b3);*/

        b3 = num instanceof Number;//Number es el ancestro de int, short, long, etc.
        System.out.println("Es Number: "+b3);

        b3 = num instanceof Object;
        System.out.println("Es Object: "+b3);

        Double decimal = 45.84;
        b3 = decimal instanceof Number;
        System.out.println("Es Number: "+b3);

        b3 = b3 instanceof Boolean;
        System.out.println("Es Boolean: "+b3);

    }
}
