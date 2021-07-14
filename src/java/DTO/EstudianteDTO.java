package DTO;
import Clases.Estudiante;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import DAO.EstudianteDAO;
public class EstudianteDTO {
    private final String ruta;
    public EstudianteDTO(String ruta){
        this.ruta = ruta;
    }
    public boolean registrar(Estudiante estudiante){
        try{
            EstudianteDAO estudianteDAO = new EstudianteDAO(ruta);
            if(!estudianteDAO.existe(estudiante.getIdentificacion())){
                BufferedWriter writer = new BufferedWriter(new FileWriter(ruta,true));
                writer.write(estudiante.getIdentificacion()+";"+estudiante.getNombre()+";"+estudiante.getCelular()+";"+estudiante.getEmail());
                writer.newLine();
                writer.close();
                return true;
            }else
              return false;
        }catch(IOException ex){
            return false;
        }
    }
}
