package angelehl.parte1;

public class PrimitivosBoolean {

    public void descripcionBoolean(){

        boolean datoLogico=true;
        boolean datoTipoBoolean=Boolean.FALSE;
        
        System.out.println("datoLogico = " + datoLogico);
        System.out.println("datoTipoBoolean = " + datoTipoBoolean);

        double d= 98765.43e-3; //
        float f = 1.2345e2f;

        datoLogico= d>f;
        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual=3-2==1;
        System.out.println("esIgual = " + esIgual);


    }
}
