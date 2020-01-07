/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.model;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Console {

    private int id;
    private float cost;
    private String name;
    private String memory;

    public Console(int id, float cost, String name, String memory) {
        this.id = id;
        this.cost = cost;
        this.name = name;
        this.memory = memory;
    }

     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    
    public Console(){
        cost = 150;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the memory
     */
    public String getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    public void askData(){
        System.out.println("Ingrese el id :");
        Scanner scan = new Scanner(System.in);
        this.id = Integer.parseInt(scan.nextLine());
        System.out.println("Ingrese su costo:");
        this.cost = Float.parseFloat(scan.nextLine());
        System.out.println("Ingrese su nombre:");
        this.name = scan.nextLine();
        System.out.println("Ingrese su memoria:");
        this.memory = scan.nextLine();
    }
}