package angelehl.parte1;

import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

    public void descripcionSistemas(){

        int numeroDecimal = 30;
        System.out.println("numeroDeciaml = " + numeroDecimal);

        //De decimal a binario
        System.out.println("Equivalente en binario de " + numeroDecimal+" = " + Integer.toBinaryString(numeroDecimal));

        //De binario a decimal
        int numeroBinario = 0b11110;//Con 0b se sabe que es binario en java
        System.out.println("numeroBinario = " + numeroBinario);

        //De decimal a octal
        System.out.println("Numero octal de "+numeroDecimal+" es = " +Integer.toOctalString(numeroBinario));

        //De octal a decimal
        int numeroOctal=036;//Para que java reconozca un octal, se antepone un cero
        System.out.println("numeroOctal = " + numeroOctal);

        //De decimal a hexadecimal
        System.out.println("Numero hexadecimal de " + numeroDecimal+ " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1e;//0x para saber que es hexadecimal
        System.out.println("numeroHex = " + numeroHex);




    }

    public void convertir(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        //String numeroStr = scanner.nextLine();

        int numeroDecimal =0;

        try{
            numeroDecimal =scanner.nextInt();

        }catch(Exception e){
            System.out.println("Error: debe ingresar un número entero");
            convertir();
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "Equivalente en binario de " + numeroDecimal+" = " + Integer.toBinaryString(numeroDecimal);

        //De decimal a octal
        String mensajeOctal = "Numero octal de "+numeroDecimal+" es = " +Integer.toOctalString(numeroDecimal);

        //De decimal a hexadecimal
        String mensajeHexadecimal="Numero hexadecimal de " + numeroDecimal+ " = " + Integer.toHexString(numeroDecimal);


        String mensaje = mensajeBinario;
        mensaje += "\n"+mensajeOctal;
        mensaje += "\n"+mensajeHexadecimal;


        System.out.println(mensaje);
    }
}
