/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.model;

/**
 *
 * @author jcadena
 */
public class User {
    private String name;
    private String password;
    private String type;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String type) {
        this.name = name;
        this.password = password;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
