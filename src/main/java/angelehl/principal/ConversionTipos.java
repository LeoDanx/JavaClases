package angelehl.principal;

public class ConversionTipos {

    public void operaciones(){

        String numeroStr="50";

        //String a int
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //String a double
        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //String a boolean
        String logicoStr = "true";
        boolean logicoBool = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBool = " + logicoBool);




    }

    public void operacionesInverso(){

        int otroNumeroInt =100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        //De int a String
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroStr+10);//Tener cuidado con seleccionar el tipo correcto en el método valueOf
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //De double a String
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.234456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

    }

    public void operacionesPrimitivoAPrimitivo(){

        //Solo se hace cast a tipo numérico
        //Char tambien puede, pero el valor resultado es un Unicode

        int i=32768;
        short s = (short)i;//MalaPráctica:  no convertir de tipos de mayor bits a menor bits
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        char b = (char)i;
        System.out.println("b = " + b);
        float f = (float)i;
        System.out.println("f = " + f);

    }
}
