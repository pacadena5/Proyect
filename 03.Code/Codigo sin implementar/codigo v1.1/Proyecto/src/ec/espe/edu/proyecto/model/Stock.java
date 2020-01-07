/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.model;

import java.util.ArrayList;

/**
 *
 * @author Invitado
 */
public class Stock {
    public static ArrayList<Console> listaConsole;
    
    public Stock(){        
    }
    
    public static void add(Console console){
        ArrayList<Console> arr= new ArrayList<>();
        arr.add(console);
        Stock.listaConsole =arr;
    }

    public static ArrayList<Console> getListaConsole() {
        return listaConsole;
    }

    public static void setListaConsole(ArrayList<Console> listaConsole) {
        Stock.listaConsole = listaConsole;
    }
    
}