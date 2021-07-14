package DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdministradorDAO {
    private final String ruta;
    public AdministradorDAO(String ruta){
        this.ruta = ruta;
    }
    public String logueo(String user, String password){
        try{
            String envio=null;
            BufferedReader read = new BufferedReader(new FileReader(ruta));
            String administrador = null;
            while((administrador = read.readLine())!= null){
                String[]datos = administrador.split(";");
                for(String dato : datos){
                    System.out.print(dato+" ");
                }
                if(datos[0].equals(user) && datos[1].equals(password)){
                    envio = datos[0];
                    break;
                }
                    
            }
            read.close();
            return envio;
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
