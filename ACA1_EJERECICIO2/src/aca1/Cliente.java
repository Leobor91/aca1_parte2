/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aca1;

/**
 *
 * @author leonel.borja
 */
public class Cliente {

    private String idCliente;
    private String nombreCliente;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Id del Cliente: ").append(idCliente);
        sb.append("\n");
        sb.append("Nombre del Cliente: ").append(nombreCliente);
        sb.append("\n");
        return sb.toString();
    }

}
