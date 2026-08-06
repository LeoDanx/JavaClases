package angelehl.actividades;

import javax.swing.*;

public class nombreMasLargo {

    public void cuerpoNombreMasLargo() {

        String[] nombre=new String[3];

        for(int i=0;i<nombre.length;i++){
            nombre[i]=JOptionPane.showInputDialog("Introduce el nombre "+(i+1));
        }

        System.out.println("Nombres ingresados: ");
        for(int i=0;i<nombre.length;i++){
            System.out.println("Nombre ".concat(String.valueOf(i+1)).concat(":").concat(" ").concat(nombre[i]));
        }

        String mayor="";
        int indice = 0;
        for(int i=0;i<nombre.length;i++){

            if(nombre[i].split(" ")[0].length()>mayor.length()){
                mayor=nombre[i].split(" ")[i];
                indice = i;
            }
        }

        System.out.println("El nombre de mayor longitud es: "+nombre[indice]);

    }
}
