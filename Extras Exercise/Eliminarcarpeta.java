/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoveCarpeta;

import java.io.File;

/**
 *
 * @author Cristian Arauz
 */
public class Eliminarcarpeta{
    
    public static void main(String[] args){
        
        String nombreCarpeta = "archivo eliminado.txt";
        File carpeta = new File(nombreCarpeta);
        
        carpeta.delete();
    }
}
