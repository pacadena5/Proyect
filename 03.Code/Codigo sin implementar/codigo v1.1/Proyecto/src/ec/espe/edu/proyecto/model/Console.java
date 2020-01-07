/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.model;

/**
 *
 * @author Invitado
 */
public class Console {

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
    private int id;
    private float cost;
    
    public Console(){
        cost = 150;
    }
    
    public Console(int id){
        id= id;
        cost= 150;
    }
}