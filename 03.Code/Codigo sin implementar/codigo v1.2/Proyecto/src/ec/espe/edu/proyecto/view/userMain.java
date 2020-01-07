/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.view;

import ec.espe.edu.proyecto.model.IPersonal;
import ec.espe.edu.proyecto.model.Console;
import ec.espe.edu.proyecto.model.Menu;
import ec.espe.edu.proyecto.model.Stock;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
        
        BufferedReader br = null;
        String line = "";
        int cont = 0;
        boolean band = false;
        try{
            br = new BufferedReader(new FileReader("Personal.csv"));
            while ((line = br.readLine()) != null) {
                String[] dataPersonal = line.split(";");
                if(userName.equals(dataPersonal[0]) && userContra.equals(dataPersonal[1])){
                    band = true;
                }
                cont+=2;
            }        
        }catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("contador:  "+ cont);
        if (band)menu.showMenuUser();
    }
}
