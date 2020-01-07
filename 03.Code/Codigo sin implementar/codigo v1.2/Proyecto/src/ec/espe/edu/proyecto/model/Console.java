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


    private String name;
<<<<<<< HEAD

=======
<<<<<<< HEAD:03.Code/codigo v1.2/Proyecto/src/ec/espe/edu/ec/model/Console.java
    String sid = Integer.toString(id);
    String scost = Integer.toString((int) cost);
            

    public Console(String name, String scost, String sid) {
        this.name=name;
        this.scost=scost;
        this.sid=sid;

    }
=======
>>>>>>> ef98c1186a8d0913fee885863ff0fc2e28331c81
>>>>>>> refs/remotes/origin/master:03.Code/codigo v1.2/Proyecto/src/ec/espe/edu/proyecto/model/Console.java
>>>>>>> 0d73f075c2cb5ff812921297f261fea2ccd0c9fc
    
    public String getId() {
        return sid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCost() {
        return scost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }



    
    public Console(){
        cost = 150;
    }
    
    public Console(int id){

        this.id= id;

        id=id;

        cost= 150;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}