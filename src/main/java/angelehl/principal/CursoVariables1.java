package angelehl.principal;

public class CursoVariables1 {
    //La declaración de variables siempre consta de dos partes: El tipo de dato y la variable.
    //Es fuertemente tipado
    //Hay dos tipos de datos: primitivos y de referencia. Primitivos son enteros, flotantes, caracteres y booleanos
    //De referencia tenemos los arreglos, clases e interfaces
    //Primitivos NO SON objetos, son valores
    //Datos por referencia tienen atributos, métodos. Son una entidad
    //Valores por defecto se aplican en atributos de una clase, no al método. En el método se inicializan si o si

    public void asinarVariables(){

        String saludar= "Hola mundo desde java";
        System.out.println("sauldar = " + saludar);

        int numero= 10;
        System.out.println("numero = " + numero);
        boolean valor = true;

        int numero2=5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3="15";

        String nombre;

        nombre = "Andrés";

        if(numero>10){
            nombre="Juan";
        }
        System.out.println("nombre = " + nombre);

        System.out.println("char = " + '\u00B6');



    }
       

}
