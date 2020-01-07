/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.view;

import ec.espe.edu.proyecto.model.IPersonal;
import ec.espe.edu.proyecto.model.Console;
import ec.espe.edu.proyecto.model.Stock;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cristian, Angel, Emilio, Pablo
 */
public class userMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int opc=0, id=0;
        Scanner scan = new Scanner(System. in);
        do{
        System.out.println("Escoja la opcion de lo que desea hacer: \n 1.Añadir usuario. \n 11.Añadir consola. \n 21. Mirar el stock\n 5. SALIR");
        opc= scan.nextInt();
        
            switch(opc){
                case 1:
                    IPersonal proyecto = new IPersonal();
                    proyecto.create();
                break;
                case 11:
                    Stock stock = new Stock();
                    System.out.println("Ingrese el id de la consola:");
                    id = scan.nextInt();
                    stock.add(new Console(id));
                break;
                    
                case 21:
                    System.out.println(Stock.listaConsole);
            }
                    
        }while (opc!=5);
    }
    
}
