/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aca1;

/**
 *
 * @author leonel.borja
 */
public class Factura {

    private double subTotal;
    private double precioFinal;
    private double valorIva;
    private final double PORCENTAJE_IVA;

    public Factura() {
        this.subTotal = 0;
        this.precioFinal = 0;
        this.valorIva = 0;
        this.PORCENTAJE_IVA = 0.19;
    }

    public double getValorIva() {
        return valorIva;
    }

    public void setValorIva(double valorIva) {
        this.valorIva = valorIva;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public double getPORCENTAJE_IVA() {
        return PORCENTAJE_IVA;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(Color.GREEN).append("SubTotal Compra: $$ ").append(subTotal).append(Color.RESET);
        sb.append("\n");
        sb.append(Color.GREEN).append("Iva Compra: $$ ").append(valorIva).append(Color.RESET);
        sb.append("\n");
        sb.append(Color.GREEN).append("Total Compra: $$ ").append(precioFinal).append(Color.RESET);
        sb.append("\n");        
        return sb.toString();
    }
   
            
    

}
