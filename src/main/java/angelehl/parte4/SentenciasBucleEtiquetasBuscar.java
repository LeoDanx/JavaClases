package angelehl.parte4;

public class SentenciasBucleEtiquetasBuscar {

    public void cuerpoSentenciasBucleEtiquetasBuscar(){

        String frase = "tres triste tigres tragan trigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length()-maxPalabra;

        int cantidad=0;
        char letra = 'g';


        //buscar numero letras en la frase
        for(int i=0;i<maxFrase;i++){
            if(frase.charAt(i)!='t'){
                continue;
            }
            cantidad++;
        }
        System.out.println("Cantidad de letras en la frase: "+cantidad);

        cantidad=0;
        //buscamos numero de palabras
        buscar:
        for(int i=0;i<=maxFrase;){
            int k=i;
           for(int j=0;j<maxPalabra;j++){
                if(frase.charAt(k++)!=palabra.charAt(j)){
                    i++;
                    continue buscar;
                }
           }
            cantidad++;
           i = i+maxPalabra;
        }
        System.out.println("Encontrado = "+cantidad+" veces la palabra '"+palabra+"' en la frase");
    }
}
