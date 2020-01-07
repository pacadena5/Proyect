/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Pablo Cadena
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        FileWriter fichero;
        fichero = new FileWriter ("C: AngelCastillo.txt");
        System.out.println("Ingrese el nombre del usuario para realizar la compra o revicion");
        String nombre = "";
        Scanner scanner = new Scanner (System.in);
        nombre= scanner.nextLine ();
        fichero.write(nombre);
        fichero.close();
    }
    
}
