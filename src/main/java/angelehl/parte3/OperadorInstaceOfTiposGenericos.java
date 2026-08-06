package angelehl.parte3;

public class OperadorInstaceOfTiposGenericos {

    public void cuerpoOperadorInstaceOf(){

        Object texto = "¡Creando un objeto de la clase String...que tal!";

        Number num = 7;

        boolean b1 = texto instanceof String;
        //boolean b2 = texto instanceof Integer;//da error porque no tienen ancestros en comun, son totalmente independientes
        Boolean b3 = texto instanceof Object;

        System.out.println("Texto Es String: "+b1);
        System.out.println("Texto Es String: "+b3);

        b3 = texto instanceof Integer;
        System.out.println("Texto Es Integer: "+b3);

        b3 = num instanceof Integer;
        System.out.println("Num Es Integer: "+b3);

        /*b3 = num instanceof Long;//int no se puede convertir a long
        System.out.println("Es Integer: "+b3);*/

        b3 = num instanceof Number;//Number es el ancestro de int, short, long, etc.
        System.out.println("Num Es Number: "+b3);

        b3 = num instanceof Object;
        System.out.println("Num Es Object: "+b3);

        b3 = num instanceof Long;
        System.out.println("Num Es Long: "+b3);

        b3 = num instanceof Double;
        System.out.println("Num Es Double: "+b3);

        Number decimal = 45.84f;
        b3 = decimal instanceof Double;
        System.out.println("decimal Es Double: "+b3);

        b3 = decimal instanceof Float;
        System.out.println("decimal Es Float: "+b3);

        b3 = decimal instanceof Number;
        System.out.println("decimal Es Number: "+b3);

        b3 = decimal instanceof Integer;
        System.out.println("decimal Es Integer: "+b3);

        b3 = b3 instanceof Boolean;
        System.out.println("Bool Es Boolean: "+b3);

    }
}
