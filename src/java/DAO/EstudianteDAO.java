package DAO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class EstudianteDAO {
    private final String ruta;
    public EstudianteDAO(String ruta){
        this.ruta = ruta;
    }
    public boolean existe(String identificacion){
        try{
            BufferedReader read = new BufferedReader(new FileReader(ruta));
            String linea = null;
            System.out.println("Inicio del WHILE");
            while((linea = read.readLine()) != null){
                String datos[] = linea.split(";");
                System.out.println(datos[0] + " dato: "+datos[1]);
                if(datos[0].equals(identificacion))
                    return true;
            }
            read.close();
            return false;
        }catch(IOException ex){
            return true;
        }
    }
    public String logueo(String user, String password){
        try{
            String envio=null;
            BufferedReader read = new BufferedReader(new FileReader(ruta));
            String estudiante = null;
            while((estudiante = read.readLine())!= null){
                String[]datos = estudiante.split(";");
                for(String dato : datos){
                    System.out.print(dato+" ");
                }
                if(datos[3].equals(user) && datos[0].equals(password)){
                    envio = datos[1];
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
