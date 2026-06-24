package angelehl.principal;

public class Primitivos {

    byte numeroByte;
    short numeroShort;
    int numeroInt;
    long numeroLong;
    float numeroFloat;
    double numeroDouble;

    public void descripcionByte(){
        
        byte numeroByte=7;

        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo Byte corresponde en bytes a: " + Byte.BYTES);
        System.out.println("Tipo Byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("Valor máximo de tipo byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de tipo byte: " + Byte.MIN_VALUE);

    }

    public void descripcionShort(){

        short numeroShort=30000;

        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en bytes a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("Valor máximo de tipo short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de tipo short: " + Short.MIN_VALUE);

    }

    public void descripcionInt(){

        int numeroInt=2147483647;

        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("Valor máximo de tipo int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de tipo int: " + Integer.MIN_VALUE);

    }

    public void descripcionLong(){

        long numeroLong =9223372036854775807L;

        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo Long corresponde en bytes a: " + Long.BYTES);
        System.out.println("Tipo Long corresponde en bites a: " + Long.SIZE);
        System.out.println("Valor máximo de tipo Long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de tipo Long: " + Long.MIN_VALUE);

    }

    public void descripcionFloat(){

        float numeroFloat =3.4028235E38f;
        float numeroFloat2 = 1.5e-10f;

        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numeroFloat2 = " + numeroFloat2);
        System.out.println("Tipo float corresponde en bytes a: " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor máximo de tipo float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de tipo float: " + Float.MIN_VALUE);

    }

    public void descripcionDouble(){

        double numeroDouble =3.4028235E38d;//La d no es obligatoria, es opcional


        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Tipo double corresponde en bytes a: " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a: " + Double.SIZE);
        System.out.println("Valor máximo de tipo double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de tipo double: " + Double.MIN_VALUE);

    }

    public void descripcionVar(){

        var numeroVar =127;//Siempre que sea un entero se clasifica con int, amenos que te pases del limite de un entero
                            //Entonces se tiene que especificar si es un float, long o double

        System.out.println("numeroVar = " + numeroVar);
        System.out.println("Tipo float corresponde en bytes a: " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor máximo de tipo float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de tipo float: " + Float.MIN_VALUE);

        int a=123456789;
        float b=123456789f;

        System.out.println("a: "+a+",b: "+b);

        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);


        

    }

    //Valores por defecto
    @Override
    public String toString() {
        return "Primitivos{" +
                "numeroByte=" + numeroByte +
                ", numeroShort=" + numeroShort +
                ", numeroInt=" + numeroInt +
                ", numeroLong=" + numeroLong +
                ", numeroFloat=" + numeroFloat +
                ", numeroDouble=" + numeroDouble +
                '}';
    }
}
