package angelehl.parte3;

public class OperadoresUnarios {

    public void cuerpoOperadorUnarios(){

        int i = -5;

        int j = +i;// j = (i)*i =>-5
        System.out.println("j = " + j);

        int k = -i;//k= (-i)*i =>5
        System.out.println("k = " + k);

        i = 6;
        j =+i;
        System.out.println("j = " + j);

        k = -i;
        System.out.println("k = " + k);

    }
}
