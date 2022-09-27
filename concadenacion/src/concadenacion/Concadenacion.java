/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concadenacion;

import java.util.Scanner;

public class Concadenacion {
    static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Nombre y apeelidos al ususario
        String nombre;
        String apellido;
        System.out.println("\tBIENVENIDO A NUESTRO PROGRAMA");
        System.out.println("\t=============================\n\n");
        System.out.print("Introduzca su nombre: ");
        nombre=ent.nextLine();
        while(nombre.contentEquals("")){
            System.out.print("No deje el espacio vacio, porfavor introduzca su nombre: ");
            nombre=ent.nextLine();
        }
        while(nombre.contains("0")||nombre.contains("1")||nombre.contains("2")||nombre.contains("3")||nombre.contains("4")||nombre.contains("5")||nombre.contains("6")||nombre.contains("7")||nombre.contains("8")||nombre.contains("9")){
            System.out.print("No se admiten caracteres numericos, porfavor introduzca su nombre: ");
            nombre=ent.nextLine();
        }
        System.out.print("Introduzca su apellido: ");
        apellido=ent.nextLine();
        while(apellido.contentEquals("")){
            System.out.print("No deje el espacio vacio, porfavor introduzca su apellido: ");
            apellido=ent.nextLine();
        }
        while(apellido.contains("0")||apellido.contains("1")||apellido.contains("2")||apellido.contains("3")||apellido.contains("4")||apellido.contains("5")||apellido.contains("6")||apellido.contains("7")||apellido.contains("8")||apellido.contains("9")){
            System.out.print("No se admiten caracteres numericos, porfavor introduzca su apellido: ");
            apellido=ent.nextLine();
        }
        System.out.println("\nSu nombre completo es "+nombre+" "+apellido);
    }
}
