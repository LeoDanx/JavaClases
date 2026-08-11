package angelehl.parte4;

public class SentenciaForEach {

    public void cuerpoSentenciaForEach(){

        int[] numeros = {1,3,5,7,9,11,13,14};

        for(int num: numeros){
            System.out.println("num = "+num);
        }

        String[] nombres = {"Angel","Maria","Pepe","Paco","Lalo","Pato"};

        for(String nombre:nombres){
            System.out.println("nombre = "+nombre);
        }

    }
}
