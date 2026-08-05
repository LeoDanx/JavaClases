package angelehl.actividades;

import java.util.Scanner;

public class ProgramaManejoDeNombres {


    private StringBuilder strFinal=new StringBuilder();//Podria ser un problema, al ser variable de clase y NO limpiarse, se acumularian los strings

    public void cuerpoProgramaManejoDeNombres(){

        Scanner sc = new Scanner(System.in);
        String nombre1="";
        String nombre2="";
        String nombre3="";

        try {
            System.out.println("Ingrese el nombre del primer integrante");
            nombre1 = sc.nextLine();

            System.out.println("Ingrese el nombre del segundo integrante");
            nombre2 = sc.nextLine();

            System.out.println("Ingrese el nombre del tercer integrante");
            nombre3 = sc.nextLine();

        }catch(Exception e){
            System.out.println("Ingrese un nombre valido");
        }


        concatenar(nombre1);
        concatenar(nombre2);
        concatenar(nombre3);

        System.out.println("La transformacion quedaria como sigue: ");
        imprimir();
    }

    private void concatenar(String s){

        Character c = s.charAt(1);
        String strTemp;

        if(!strFinal.isEmpty())//Si ya tiene contenido
            strFinal.append("_");

        strTemp = c.toString().toUpperCase().concat(".") .concat(s.substring(s.length()-2));
        strFinal.append(strTemp);

    }

    private void imprimir(){

        System.out.println(strFinal.toString());
    }
}
