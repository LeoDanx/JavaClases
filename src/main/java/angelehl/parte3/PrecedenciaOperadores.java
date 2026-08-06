package angelehl.parte3;

public class PrecedenciaOperadores {

    public void cuerpoPrecedenciaOperadores() {

        int i =14;
        int j = 8;
        int k =20;

        double promedio = (i+j+k)/3d*10;//basta con que un factor sea decimal, para que toda la expresion sea decimal
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / 3d * 10;//Primero divide y luego multiplica
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k )/ 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10;
        System.out.println("promedio = " + promedio);
        System.out.println("i = "+i);
        System.out.println("j = "+j);

    }
}
