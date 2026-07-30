package angelehl.parte2;

public class EjemploStringMetodosArreglo {

    public void cuerpoStringMetodosArreglo(){

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray()= "+trabalenguas.toCharArray());

        char[] arreglo =  trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo string= "+trabalenguas.length());
        System.out.println("largo string= "+largo);

        for(int i=0; i<largo; i++){
            System.out.println("arreglo = "+arreglo[i]);
        }
        System.out.println("\ntrabalenguas = "+trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for(int j=0; j<l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");
        l = archivoArr.length;
        System.out.println("l = "+l);

        for(int j=0; j<l; j++){
            System.out.println(archivoArr[j]);
        }

        System.out.println("extension = "+archivoArr[archivoArr.length-1]);


    }
}
