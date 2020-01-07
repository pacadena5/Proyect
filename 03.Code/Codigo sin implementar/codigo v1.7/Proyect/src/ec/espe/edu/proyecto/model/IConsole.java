/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.model;

import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Angel castillo
 */
public class IConsole {
    
    
        public void guardarCsv(ArrayList<Console> arr) {
        String inventaryFile = "Inventario.csv";
        File file = new File(inventaryFile);

        if (file.exists()) {
            file.delete();
        }
        
        try {
            CsvWriter writer = new CsvWriter(new FileWriter(inventaryFile), ';');

            for (int i =0; i<arr.size();i++){
                Console console =new Console();
                console = arr.get(i);
                writer.write(String.valueOf(console.getId()));
                writer.write(String.valueOf(console.getCost()));
                writer.write(String.valueOf(console.getName()));
                writer.write(String.valueOf(console.getMemory()));
                writer.endRecord();
                
            }
            writer.close();
        } catch (IOException e) {

        }
    }
        
        public ArrayList<Console> leerCsv(){
            BufferedReader br = null;
            String line = "";
            ArrayList<Console> arr = new ArrayList<>();
            try{
                br = new BufferedReader(new FileReader("Inventario.csv"));
                while ((line = br.readLine()) != null) {
                    String[] dataConsole = line.split(";");
                    int id = Integer.parseInt(dataConsole[0]);
                    float cost = Float.parseFloat(dataConsole[1]);
                    String name = dataConsole[2];
                    String memory = dataConsole[3];
                    Console console = new Console(id, cost, name, memory);
                    arr.add(console);
                }        
            }catch (IOException e) {
                System.out.println(e);
            }
            return arr;
        }
}
