/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author User
 */
public class DetalleVenta {
    private int cant;
    private Producto Producto;
    private long codigoVenta;
    private float precioUnitario;

    public DetalleVenta() {
    }

    public DetalleVenta(int cant, Producto Producto, long codigoVenta, float precioUnitario) {
        this.cant = cant;
        this.Producto = Producto;
        this.codigoVenta = codigoVenta;
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the cant
     */
    public int getCant() {
        return cant;
    }

    /**
     * @param cant the cant to set
     */
    public void setCant(int cant) {
        this.cant = cant;
    }

    /**
     * @return the Producto
     */
    public Producto getProducto() {
        return Producto;
    }

    /**
     * @param Producto the Producto to set
     */
    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }

    /**
     * @return the codigoVenta
     */
    public long getCodigoVenta() {
        return codigoVenta;
    }

    /**
     * @param codigoVenta the codigoVenta to set
     */
    public void setCodigoVenta(long codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    /**
     * @return the precioUnitario
     */
    public float getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}
