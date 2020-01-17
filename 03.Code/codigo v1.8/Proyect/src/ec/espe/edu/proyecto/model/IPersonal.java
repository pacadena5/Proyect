/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.model;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
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
    public  void create(String username, String password) throws IOException {
        String studentFile = "Personal.txt";  
        Gson gson = new Gson();
        ArrayList<User> users = new ArrayList<>();
        users = leerGson();

        System.out.println("size:  "+ users.size());
        try (FileWriter fichero = new FileWriter(studentFile)) {
            User user = new User(username, password);
            users.add(user);
            for (User user1 : users) {
                String lineToSave = gson.toJson(user1);
//                System.out.println("line:  "+lineToSave);
                fichero.write(lineToSave+"\n");
            }
        }
        
        
    }
    public ArrayList<User>  leerGson(){
        BufferedReader br = null;
        
        String line = "";
        ArrayList<User> users = new ArrayList<>();
        Gson gson = new Gson();
        try{
            br = new BufferedReader(new FileReader("Personal.txt"));

            while ((line = br.readLine()) != null) {
                User user = new User();
                user = gson.fromJson(line, User.class);
                
                users.add(user);
            }
        }catch (IOException e) {
            System.out.print("e+");
            System.out.println(e);
        }
        return users;
    }    

    public boolean existPersonal(String userName, String userContra ){
        Gson gson = new Gson();
        ArrayList<User> users = new ArrayList<>();
        users = leerGson();
        boolean band = false;
        for(int i =0; i<users.size(); i++){
            if(userName.equals(users.get(i).getName()) &&
               userContra.equals(users.get(i).getPassword())){
                band = true;
            }
            
        }

        return band;
    }
    
    /*MONGO DB:
    public ArrayList<User>  leerMongo(){
        DBCursor cursor = tablaPersonal.find();
        Gson gson = new Gson();
        ArrayList<User> users = new ArrayList<>();

        String line = "";
        while(cursor.hasnext()){
            line = cursor.next();
            User user = new User();
            user = gson.fromJson( line, User.class);
            users.add(user);
        }
    }
    
    public boolean existPersonalMongo(String userName, String userContra ){
        Gson gson = new Gson();
        ArrayList<User> users = new ArrayList<>();
        users = leerMongo();
        boolean band = false;
        for(int i =0; i<users.size(); i++){
            if(userName.equals(users.get(i).getName()) &&
               userContra.equals(users.get(i).getPassword())){
                band = true;
            }
            
        }

        return band;
    */
    
/* PARA GUARDAR EN CSV:
    public  void create(String username, String password) {
        String studentFile = "Personal.csv";
        
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
        } catch (Exception e) {
            System.out.println("exeption writing");
        }

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
    }*/
    
    
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
    