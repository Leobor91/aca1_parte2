/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aca1;

import java.util.*;

/**
 *
 * @author leonel.borja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "001", "Bocadillo de Jamón", 1.5));
        productos.add(new Producto(2, "002", "Refresco", 1.05));
        productos.add(new Producto(3, "003", "Cerveza", 0.75));

        Cliente cliente = new Cliente();
        System.out.println(   "*************************************************************"  );
        System.out.println("Ingrese el nombre del cliente");
        cliente.setNombreCliente(entrada.nextLine());
        System.out.println("*************************************************************");
        System.out.println("Ingrese el Id del Cliente");
        cliente.setIdCliente(entrada.nextLine());
        System.out.println("*************************************************************");

        Factura factura = new Factura();
        

        for (Producto producto : productos) {
            System.out.println("Ingrersa la cantidad de " + producto.getNombreProducto());
            producto.setCatidadProducto(Integer.parseInt(entrada.nextLine()));
            producto.setTotalProducto(producto.getCatidadProducto() * producto.getPrecioProducto());
            factura.setSubTotal(factura.getSubTotal() + (producto.getCatidadProducto() * producto.getPrecioProducto()));
            System.out.println( "*************************************************************" );
        }

        factura.setValorIva(factura.getSubTotal() * factura.getPORCENTAJE_IVA());
        factura.setPrecioFinal(factura.getSubTotal() + factura.getValorIva());
        System.out.println("");
        System.out.println("");
        System.out.println(Color.BOLD + Color.RED + "ALMACENES VELEZ" + Color.RESET);
        System.out.println(cliente.toString());
        for (Producto producto : productos) {
            System.out.println(producto.toString());           
        }
        System.out.println(factura.toString());
        System.out.println("");
        System.out.println(Color.BOLD + Color.BLUE + "GRACIAS POR SU COMPRA, VUELVA PRONTO" + Color.RESET);
        System.out.println("");
        System.out.println("*************************************************************");

    }

}
