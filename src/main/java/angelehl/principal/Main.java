package angelehl.principal;

import angelehl.actividades.DetalleFactura.DetalleFactura;
import angelehl.parte1.*;
import angelehl.parte2.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        new Main().parte2();


    }
    public void ejercicio1(){
        DetalleFactura df = new DetalleFactura();

        df.obtenerDescripcion();
        df.obtenerPrecioTotal();
        System.out.println(df);

    }

    public void parte2(){

            //new EjemploString().descripcionString();
        new EjemploStringConcatenacion().descripcionString();
    }

    public void parte1(){
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