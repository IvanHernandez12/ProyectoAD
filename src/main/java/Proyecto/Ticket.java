/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author User
 */
public class Ticket {
    
    public static void main(String[] args) {
        
       
        
    }
    
    public static String generarT(Venta v)
    {
        String s="";
        s+="Venta\n"+"Total: "+v.getTotal();
           return s;     
    }
}
