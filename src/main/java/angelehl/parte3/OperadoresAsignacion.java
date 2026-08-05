package angelehl.parte3;

public class OperadoresAsignacion {

    public void cuerpoOperadorAsignacion(){

        int i = 5;
        int j = i+4;

         i += 2;//i = i+2;
        System.out.println("i = "+i);

        i+=5;//i = i+5;
        System.out.println("i = "+i);

        j-=4;//j = j-4;
        System.out.println("j = "+j);

        j *= 3;//j = j*3;
        System.out.println("j = "+j);

        String sqlString = "select * from Clientes as c";
        sqlString += " where c.nombre='Angel'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = "+sqlString);


    }
}
