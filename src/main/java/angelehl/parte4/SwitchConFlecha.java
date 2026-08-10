package angelehl.parte4;

import java.util.Scanner;

public class SwitchConFlecha {

    public void cuerpoSwitchConFlecha(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Teclea el nombre del libro y te doy el autor (1-8) \n" +
                "1)El amor en tiempos de colera\n" +
                "2)Rayuela\n" +
                "3)Pedro Paramo\n" +
                "4)La ciudad y los perros\n" +
                "5)La region mas transparente\n" +
                "6)El coronel no tiene quien le escriba\n" +
                "7)La guerra del fin del mundo\n" +
                "8)El llano en llamas");
        int nombreLibro = sc.nextInt();


/*        switch(nombreLibro){

            case 1,6 -> System.out.println("Gabriel Garcia Marquez");
            case 2 -> System.out.println("Julio Cortazar");
            case 3,8 -> System.out.println("Juan Rulfo");
            case 4,7 -> System.out.println("Mario Vargas Llosa");
            case 5 -> System.out.println("Carlos Fuentes");

        }

 */
/*
        String autor = switch(nombreLibro){

            case 1,6 -> "Gabriel Garcia Marquez";
            case 2 -> "Julio Cortazar";
            case 3,8 -> "Juan Rulfo";
            case 4,7 -> "Mario Vargas Llosa";
            case 5 -> "Carlos Fuentes";
            default -> "Opcion no valida";//Indispensable
        };//En este caso es importante el punto y coma aqui
*/

/*
        String autor = switch(nombreLibro){

            case 1,6 : { //Se puede omitir el break, justo esta forma de switch es para evitar el "Fall through
                System.out.println("Hemos encontrado tu autor colombiano");
                System.out.println("Es muy conocido. Su nombre es: ");
                yield "Gabriel Garcia Marquez";
            }
            case 2 : {
                System.out.println("Hemos encontrado tu autor argentino.");
                System.out.println("Todos lo recordamos. Su nombre es: ");
                yield "Julio Cortazar";
            }
            case 3,8 : {

                System.out.println("Hemos encontrado tu autor mexicano.");
                System.out.println("Es una entraniable persona. Su nombre es: ");
                yield "Juan Rulfo";
            }

            case 4,7 : {
                System.out.println("Hemos encontrado tu autor peruano.");
                System.out.println("Un hombre elegante. Su nombre es: ");
                yield "Mario Vargas Llosa";}

            case 5 : {
                System.out.println("Hemos encontrado tu autor mexicano.");
                System.out.println("Siempre desafiante. Su nombre es: ");
                yield "Carlos Fuentes";
            }
            default :
                System.out.println("Opcion no valida");
                yield "No encontrado";
        };

    */

        String autor = switch(nombreLibro){

            case 1,6 -> {
                System.out.println("Hemos encontrado tu autor colombiano");
                System.out.println("Es muy conocido. Su nombre es: ");
                yield "Gabriel Garcia Marquez";
            }
            case 2 -> {
                System.out.println("Hemos encontrado tu autor argentino.");
                System.out.println("Todos lo recordamos. Su nombre es: ");
                yield "Julio Cortazar";
            }
            case 3,8 ->{

                System.out.println("Hemos encontrado tu autor mexicano.");
                System.out.println("Es una entraniable persona. Su nombre es: ");
                yield "Juan Rulfo";
            }

            case 4,7 -> {
                System.out.println("Hemos encontrado tu autor peruano.");
                System.out.println("Un hombre elegante. Su nombre es: ");
                yield "Mario Vargas Llosa";}

            case 5 -> {
                System.out.println("Hemos encontrado tu autor mexicano.");
                System.out.println("Siempre desafiante. Su nombre es: ");
                yield "Carlos Fuentes";
            }
            default -> "Opcion no valida";//El default es Indispensable
        };

        if(!autor.isBlank()){}
        System.out.println(autor);

    }
}
