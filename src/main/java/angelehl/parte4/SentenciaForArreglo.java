package angelehl.parte4;

import javax.swing.*;

public class SentenciaForArreglo {

    public void cuerpoSentenciaForArreglo(){

        String[] nombres = {"Angel","Maria","Pepe","Paco","Lalo","Pato"};

        for(int i=0;i<nombres.length;i++){

            if(nombres[i].equalsIgnoreCase("Angel") ||
                    nombres[i].equalsIgnoreCase("Paco")){
                continue;
            }

            if(nombres[i].toLowerCase().contains("Maria".toLowerCase())){
                continue;
            }
            System.out.println(nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
        System.out.println("Buscando "+buscar);

        boolean encontrado = false;
        for(int i=0;i<nombres.length;i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar+ " fue encontrado");
        }else{
            JOptionPane.showMessageDialog(null, buscar+ " no fue encontrado");
        }

    }
}
