package angelehl.principal;

import angelehl.actividades.DetalleFactura;
import angelehl.parte1.*;
import angelehl.parte2.*;
import angelehl.parte3.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        new Main().parte3();


    }
    private void ejercicio1(){
        DetalleFactura df = new DetalleFactura();

        df.obtenerDescripcion();
        df.obtenerPrecioTotal();
        System.out.println(df);

    }

    private void parte3(){

        //new OperadoresAritmetico().cuerpoOperadorAritmetico();
        //new OperadoresAsignacion().cuerpoOperadorAsignacion();
        //new OperadoresUnarios().cuerpoOperadorUnarios();
        //new OperadoresUnarios().cuerpoOperadorUnarios();
        //new OperadoresIncrementales().cuerpoOperadoresIncrementales();
        //new OperadoresLogicos().cuerpoOperadoresRelacionales();
        new OperadoresTernarios().cuerpoOperadoresTernarios();
    }

    private void parte2(){

        //new EjemploString().descripcionString();
        //new EjemploStringConcatenacion().descripcionString();
        //new EjemploStringTestRendimientoConcat().descripcionString();
        //new EjemploStringValidar().cuerpoStringValidar();
        //new EjemploStringMetodos().cuerpoStringMetodos2();
        new EjemploStringMetodosArreglo().cuerpoStringMetodosArreglo();
    }

     private void parte1(){
        //new CursoVariables1().asinarVariables();

        //Valores por defecto
        //System.out.println(new Primitivos());

        //new Primitivos().descripcionDouble();
        //new PrimitivosBoolean().descripcionBoolean();

        //new SistemasNumericos().descripcionSistemas();
        //new SistemasNumericos().convertir();
        //new SistemasNumericosEntradaScanner().convertir();
        new ConversionTipos().operacionesPrimitivoAPrimitivo();
    }
}