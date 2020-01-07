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

    private int id;
    private float cost;
<<<<<<< HEAD
=======
    private String name;
>>>>>>> ef98c1186a8d0913fee885863ff0fc2e28331c81
    
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
<<<<<<< HEAD

=======
>>>>>>> ef98c1186a8d0913fee885863ff0fc2e28331c81
    
    public Console(){
        cost = 150;
    }
    
    public Console(int id){
<<<<<<< HEAD
        this.id= id;
=======
        id=id;
>>>>>>> ef98c1186a8d0913fee885863ff0fc2e28331c81
        cost= 150;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}