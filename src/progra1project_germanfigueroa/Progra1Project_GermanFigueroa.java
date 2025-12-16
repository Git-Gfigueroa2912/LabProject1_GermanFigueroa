/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progra1project_germanfigueroa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gafm2
 */
public class Progra1Project_GermanFigueroa {
    public static Scanner entrada = new Scanner(System.in);
    public static ArrayList<Producto> inventario = new ArrayList<>();
    public static double Totalcompra = 0;
    
    //Matriz para registrar ventas[producto][cantidad vendida]
    public static int[][] registroVentas = new int[5][2];
    
    public static void main(String[] args) {
        cargarProductos();
        Menu();
    }
    //======================== MENU RECURSVIO =======================
    public static void Menu(){
        System.out.println("PULPERIA DON GERMAN");
        System.out.println("1. Ver inventario");
        System.out.println("2. Comprar Producto");
        System.out.println("3. Ver total a pagar");
        System.out.println("4. Reporte de Ventas");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opcion: ");
        int opcion = entrada.nextInt();
        
        switch(opcion){
            case 1->{
                mostrarInventario();
                break;
            }
            case 2->{
                comprar();
                break;
            }
            case 3->{
                System.out.println("Total actual: L." +totalCompra);
                break;
            }
            case 4->{
                mostrarVentas();
                break;
            }
            case 5->{
                System.out.println("Muchas gracias por comprar, lo esperamos pronto");
                return;
            }
            default ->{
                System.out.println("Opcion invalida");
            }
        }
        Menu(); // <- RECURSIVIDAD
    }
}
