package angelehl.actividades.DetalleFactura;

import java.util.Scanner;

public class DetalleFactura {

    private String descripcion;
    private double precioTotal;

    private Scanner sc = new Scanner(System.in);

    public void obtenerDescripcion(){

        System.out.println("A continuación escriba la descripción de la factura: ");
        descripcion =sc.nextLine();

    }

    public void obtenerPrecioTotal(){

        double p1 = 0.0;
        double p2 = 0.0;


    while(true) {
                try {
                    System.out.println("Escriba el precio del producto 1: ");
                    p1 = Double.parseDouble(sc.nextLine());

                    System.out.println("Escriba el precio del producto 2: ");
                    p2 = Double.parseDouble(sc.nextLine());

                    precioTotal = p1 + p2;
                    break;

                } catch (Exception e) {
                    System.out.println("Error al ingresar los productos. Intentelo de nuevo.");
                    sc.nextLine();//Limpia buffer de scanner
            }
         }

    }

    @Override
    public String toString() {
        return "DetalleFactura{" +
                "descripcion='" + descripcion + '\'' +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
