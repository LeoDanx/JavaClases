package angelehl.actividades;

import java.util.Scanner;

public class OperadoresLogicosLogin {

    public void cuerpoOperadoresLogicosLogin(){


        /*String[] username = new String[3];
        String[] password = new String[3];
        username[0] = "angel";
        password[0] = "12345";

        username[1] = "Lorena";
        password[1] = "12468";

        username[2] = "Carlos";
        password[2] = "24689";*/

        String[] username = {"angel","lorena","pepe"};
        String[] password = {"12345","12468","24689"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String usuario = sc.next();

        System.out.println("Ingrese el password");
        String pass = sc.next();

        boolean esAutenticado = false;

        for(int i = 0; i < username.length; i++){

            /*if(username[i].equals(usuario) &&  password[i].equals(pass)){

                esAutenticado = true;
                break;
            }*/

            //Im 2026-05-08: Se mantiene el valor esAutenticado para no perderlo si es que en una iteracion previa se encontro un true
            esAutenticado = (username[i].equals(usuario) && password[i].equals(pass)?true:esAutenticado);
            //Fm 2026-05-08: Se mantiene el valor esAutenticado para no perderlo si es que en una iteracion previa se encontro un true
        }


       /* if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat("¡").concat(usuario).concat("!"));
        }else{
            System.out.println("Usuario o password incorrecto");
        }*/
        String mensaje = esAutenticado?"Bienvenido usuario ".concat(usuario).concat("!"):
                "¡Usuario o password incorrecto!";

        System.out.println(mensaje);
    }
}
