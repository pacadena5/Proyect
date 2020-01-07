/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.model;

import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Angel castillo
 */
public class IConsole {
    
        public static void create() throws IOException{
        String studentFile = "Console.csv";
        Scanner scan = new Scanner(System. in);
        File file = new File(studentFile);
        if (file.exists()) {
            file.delete();
        }

        try {
            CsvWriter writer = new CsvWriter(new FileWriter(studentFile, true), ';');

            System.out.println("Ingrese el nombre :");
            writer.write(scan.nextLine());
            System.out.println("Ingrese su id:");
            writer.write(scan.nextLine());
            System.out.println("Ingrese su costo:");
            writer.write(scan.nextLine());
            writer.endRecord();
            writer.close();
        } catch (IOException e) {

        }
    
    }
}
