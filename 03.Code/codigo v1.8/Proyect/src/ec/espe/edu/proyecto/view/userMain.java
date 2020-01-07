/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.view;

import com.csvreader.CsvWriter;
import ec.espe.edu.proyecto.model.IPersonal;
import ec.espe.edu.proyecto.model.Menu;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cristian, Angel, Emilio, Pablo
 */
public class userMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws com.csvreader.CsvWriter.FinalizedException
     */
    public static void main(String[] args) throws IOException  {

        Scanner scan = new Scanner(System. in);
        String admName = "pepito";
        String admContraseña = "pepito123";
        String userName, userContra; 
        System.out.println("INGRESE USUARIO:");
        userName = scan.nextLine();
        System.out.println("INGRESE CONTRASEÑA:");
        userContra = scan.nextLine();
        Menu menu = new Menu();
        
        if (userName.equals(admName) && userContra.equals(admContraseña)){

            menu.showMenuAdm();
        }
        
        IPersonal archivoPersonal = new IPersonal();
        if (archivoPersonal.existPersonal(userName, userContra))menu.showMenuUser();
    }
}
