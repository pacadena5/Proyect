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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Invitado
 */
public class Menu {
     public void showMenuAdm() {
        int opc=0;
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
                {
                    try {
                        proyecto.create("pyp", "sapo");
                    } catch (IOException ex) {
                        System.out.println("error creating");
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
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
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        Stock stock = new Stock();
        ArrayList<Console> arr = new ArrayList<>();
        IConsole proyect = new IConsole();
        arr = proyect.leerCsv();
        stock.setListaConsole(arr);
        do{
        System.out.println("Escoja la opcion de lo que desea hacer: \n 1. Mirar el stock\n 2. Crear vaucher\n 5. SALIR");
        opc2 = scan.nextLine();
        int idSeller = 0;
            switch(opc2){
               
                case "1":
                    System.out.println("Consolas: ");
                    stock.getListaConsole();
                    System.out.println("ID:     COST:   NAME:   MEMORY:");
                    for (int i = 0 ; i<arr.size();i++){
                        Console console;
                        console = arr.get(i);
                        System.out.println(console.getId()+"    "+console.getCost()
                                +"    "+console.getName()+"    "+console.getMemory());
                    }
                break;
                    
                case "2":
                    Console console = new Console();
                    System.out.println("Inrese el id de la consola q va a vender:");
                    idSeller = scanInt.nextInt();
                    
                    System.out.println("ID:     COST:   NAME:   MEMORY:");
                    for (int i = 0 ; i<arr.size();i++){
                        console = arr.get(i);
                        if (arr.get(i).getId()== idSeller){

                            System.out.println(console.getId()+"    "+console.getCost()
                                +"    "+console.getName()+"    "+console.getMemory());
                        break;
                        } 
                    }
                break;
   
            }            
        }while (opc2 != "5");
    }
}
