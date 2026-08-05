package angelehl.actividades;

import java.util.Scanner;

public class OperadoresLogicosLogin {

    public void cuerpoOperadoresLogicosLogin(){

        String username = "angel";
        String password = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String usuario = sc.next();

        System.out.println("Ingrese el password");
        String pass = sc.next();

        boolean esAutenticado = false;

        if(username.equals(usuario) &&  pass.equals(pass)){

            esAutenticado = true;
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat("¡").concat(usuario).concat("!"));
        }else{
            System.out.println("Usuario o password incorrecto");
        }
    }
}
