/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class Venta {

    private Date fecha;
    private String anotaciones;
    private double total;
    private double subtotal;
    private List<DetalleVenta> ventas;

    public Venta() {
    }

    public Venta(Date fecha, String anotaciones, double total, double subtotal, List<DetalleVenta> ventas) {
        this.fecha = fecha;
        this.anotaciones = anotaciones;
        this.total = total;
        this.subtotal = subtotal;
        this.ventas = ventas;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the anotaciones
     */
    public String getAnotaciones() {
        return anotaciones;
    }

    /**
     * @param anotaciones the anotaciones to set
     */
    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the ventas
     */
    public List<DetalleVenta> getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(List<DetalleVenta> ventas) {
        this.ventas = ventas;
    }

}
