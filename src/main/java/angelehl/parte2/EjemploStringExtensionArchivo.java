package angelehl.parte2;

public class EjemploStringExtensionArchivo {

    public void cuerpoStringExtensionArchivo(){

        String archivo = "alguna_imagen.jpeg";
        int i = archivo.indexOf(".");

        System.out.println("archivo.length = "+ archivo.length());
        System.out.println("archivo.substring(archivo.length()-4)= "+archivo.substring(i+1));
    }
}
