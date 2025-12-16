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
    //============================= CARGA DE PRODUCTOS ===================
    public static void cargarProductos(){
        inventario.add(new Producto("Arroz", 25, 10));
        inventario.add(new Producto("Frijoles", 30, 8));
        inventario.add(new Producto("Azucar", 20, 6));
        inventario.add(new Producto("Aceite", 55, 5));
        inventario.add(new Producto("Cafe", 40, 7));
        inventario.add(new Producto("Leche", 28, 14));
        inventario.add(new Producto("Pan", 5, 30));
        inventario.add(new Producto("Huevos (docena)", 75, 6));
        inventario.add(new Producto("Mantequilla", 35, 9));
        inventario.add(new Producto("Sal", 20, 10));
    }
    //======================== INVENTARIO ================================
    public static void mostrarInventario(){
        System.out.println("INVENTARIO DE PRODUCTOS");
        for(int i = 0; i < inventario.size(); i++){
            System.out.println((i + 1) + ". " + inventario.get(i));
        }
    }
    //======================== COMPRA DE PRODUCTO =========================
    public static void comprar(){
        mostrarInventario();
        
        System.out.println("Seleccione el producto a comprar: ");  
        int posicion = entrada.nextInt() - 1;
        
        if(posicion < 0 || posicion >= inventario.size()){
            System.out.println("El producto es invalido");
            return;
        }
    }
}
