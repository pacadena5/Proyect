/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.model;

import ec.edu.espe.Crear;
import java.io.IOException;
import static java.lang.System.console;
import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Menu {
     public void showMenuAdm() throws IOException {
        int opc=0, id=0;
        Scanner scan = new Scanner(System. in);
        Stock stock = new Stock();
        do{
        System.out.println("Escoja la opcion de lo que desea hacer: \n 1.Añadir usuario. \n 11.Añadir consola. \n 21. Mirar el stock\n 5. SALIR");
        opc= scan.nextInt();
        
            switch(opc){
                case 1:
                    IPersonal proyecto = new IPersonal();
                    proyecto.create();
                break;
                case 11:
                    IConsole proyect = new IConsole();
                    proyect.create();
                    stock.add(new Console(id));
                    stock.guardarCsv(stock.getListaConsole());
                break;
                    
                case 21:
                    System.out.println(stock.listaConsole);
                    
            }
                    
        }while (opc!=5);
     }
     public void showMenuUser() throws IOException {
        String opc2 = "";
        Scanner scan = new Scanner(System. in);
        Stock stock = new Stock();
        do{
        System.out.println("Escoja la opcion de lo que desea hacer: \n 1. Mirar el stock\n 2. SALIR");
        opc2= scan.nextLine();
        
            switch(opc2){
               
                case "1":
                    System.out.println(stock.listaConsole); 
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
                    
        }while (opc2!= "2");
     }
}
