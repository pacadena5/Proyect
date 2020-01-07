/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.model;

import com.csvreader.CsvWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Menu {
     public void showMenuAdm() {
        int opc=0, id=0;
        Scanner scan = new Scanner(System. in);
        Stock stock = new Stock();
        IConsole proyect = new IConsole();
        ArrayList<Console> arr = new ArrayList<>();
        do{
        System.out.println("Escoja la opcion de lo que desea hacer: \n 1.Añadir usuario. \n 11.Añadir consola. "
                + "\n 21.Mirar el stock \n 23.Borrar una consola \n 5. SALIR");
        opc= scan.nextInt();
        
            switch(opc){
                case 1:
                    IPersonal proyecto = new IPersonal();
                    proyecto.create();
                break;
                case 11:
                    
                    Console console = new Console();
                    console.askData();
                    
                    arr = proyect.leerCsv();
                    arr.add(console);
                    proyect.guardarCsv(arr);
                    
                break;
                    
                case 21:
                    arr = null;
                    arr = proyect.leerCsv();
                    System.out.println("ID:     COST:   NAME:   MEMORY:");
                    for (int i = 0 ; i<arr.size();i++){
                        console = arr.get(i);
                        System.out.println(console.getId()+"    "+console.getCost()
                                +"    "+console.getName()+"    "+console.getMemory());
                    }
                break;
                    
                case 23:
                    arr = proyect.leerCsv();
                    System.out.println("Ingrese el id de la consola que desea eliminar:");
                    int idDeleter = scan.nextInt();
                    for (int i = 0 ; i<arr.size();i++){
                        if (arr.get(i).getId()== idDeleter)arr.remove(i);
                        break;
                    }
                    proyect.guardarCsv(arr);
                break;
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
                    System.out.println(stock.getListaConsole()); 
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
                    
        }while (opc2!= "2");
     }
}
