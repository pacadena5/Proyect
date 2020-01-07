/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer;
import java.util.Scanner;
/**
 *
 * @author Angel castillo
 */
public class Leer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tem = new Scanner(System.in);
        String name,apellido,id;
        String carrera;
        int cedula;
        System.out.println("Ingrese Nombre ");
        name = tem.nextLine();
        System.out.println("Ingrese Apellido ");
        apellido = tem.nextLine();
        System.out.println("Ingrese id de la universidad ");
        id = tem.nextLine();
        System.out.println("Ingrese su cedula ");
        cedula = tem.nextInt();
        System.out.println( name + "\n" + apellido + "\n" + id + "\n" + cedula);
    }
    
}
