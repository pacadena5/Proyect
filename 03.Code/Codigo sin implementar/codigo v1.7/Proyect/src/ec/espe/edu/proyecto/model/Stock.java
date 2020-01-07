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
import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Stock {
    private ArrayList<Console> listaConsole;
    
    public Stock(){        
    }
    
     public Stock(ArrayList<Console> arr){
         this.listaConsole = arr;
    }
    
    public void add(Console console){
        ArrayList<Console> arr= new ArrayList<>();
        arr.add(console);
        this.setListaConsole(arr);
    }

    public ArrayList<Console> getListaConsole() {
        return this.listaConsole;
    }

    public void setListaConsole(ArrayList<Console> arr) {
        this.listaConsole = arr;
    }
    
    public void guardarCsv(ArrayList<Console> arr) {
        String inventaryFile = "Inventario.csv";
        File file = new File(inventaryFile);

        if (file.exists()) {
            file.delete();
        }
        
        try {
            for (int i =0; i<arr.size();i++){
                CsvWriter writer = new CsvWriter(new FileWriter(inventaryFile, true), ';');
                Console console =new Console();
                console = arr.get(i);
                writer.write(String.valueOf(console.getId()));
                writer.write(String.valueOf(console.getCost()));
                writer.endRecord();
                writer.close();
            }
        } catch (IOException e) {

        }
    }

}