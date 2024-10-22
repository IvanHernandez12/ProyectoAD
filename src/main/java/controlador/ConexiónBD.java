/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ConexiónBD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/bd_Panaderia";
        String user = "root";
        String password = "no les voy a decir xd";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos");

            //     Controlador controlador = new Controlador(connection);
            while (true) {
                System.out.println("Ingrese el nombre del producto:");
                String name = scanner.nextLine();
                System.out.println("Ingrese el precio del producto:");
                double price = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.println("Ingrese la ruta de la imagen del producto:");
                String imagePath = scanner.nextLine();

         //       controlador.registarProducto(name, price, imagePath);

                System.out.println("¿Desea ingresar otro producto? (si/no)");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("no")) {
                    break;
                }
            }
            scanner.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos");
            e.printStackTrace();
        }
    }
}
