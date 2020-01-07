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
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Pablo Cadena
 */
public class IPersonal {

    /**
     * @param args the command line arguments
     */
    public  void create(String username, String password) {
        String studentFile = "Personal.csv";
        Scanner scan = new Scanner(System. in);
        File file = new File(studentFile);
        if (file.exists()) {
            file.delete();
        }
        
        try {
            CsvWriter writer = new CsvWriter(new FileWriter(studentFile, true), ';');
            writer.write(username);
            writer.write(password);
            writer.endRecord();
            writer.close();
        } catch (Exception e) {}

    }

    public boolean existPersonal(String userName, String userContra ){
        BufferedReader br = null;
        String line = "";
        int cont = 0;
        boolean band = false;
        try{
            br = new BufferedReader(new FileReader("Personal.csv"));
            while ((line = br.readLine()) != null) {
                String[] dataPersonal = line.split(";");
                if(userName.equals(dataPersonal[0]) && userContra.equals(dataPersonal[1])){
                    band = true;
                }
                cont+=2;
            }        
        }catch (IOException e) {
            System.out.println(e);
        }

        return band;
    }
/*      para guardar en txt:
        FileWriter fichero;
        fichero = new FileWriter ("Personal.txt");
        System.out.println("Ingrese el nombre del usuario para generarlo");
        String nombre = "";
        Scanner scanner = new Scanner (System.in);
        nombre= scanner.nextLine ();
        fichero.write(nombre);
        fichero.close(); */
}
    