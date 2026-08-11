package angelehl.parte4;

public class SentenciaFor {

    public void cuerpoSentenciaFor(){

        for(int i=0;i<10;i++){
            System.out.println("i = "+i);
        }


        int j=0;
        for(;j<=5;){

            System.out.println("i= "+j);
            j++;
        }

        for(int i=10;i>=5;i--){
            System.out.println("i= "+i);
        }

        for(int i=1,z=10;i<z;i++,z--){
            System.out.println(i+" - "+z);
        }

        System.out.println("Numeros impares menores de 10: ");
        for(int i=0;i<=10;i++){
            if(i%2==0){
                continue;//salta a la siguiente iteracion y suspende la ejecucion de este bucle
            }
            System.out.println("i= "+i);
        }


    }

}
