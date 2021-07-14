package DTO;

import Clases.Solicitud;
import DAO.SolicitudDAO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class SolicitudDTO {
    private final String ruta;
    public SolicitudDTO(String ruta){
        this.ruta = ruta;
    }
    public boolean registrar(Solicitud solicitud){
        try{
            SolicitudDAO solicitudDAO = new SolicitudDAO(ruta);
            int consecutivo = solicitudDAO.ultimoConsecutivo();
            solicitud.setConsecutivo(consecutivo+1);
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta,true));
            writer.write(solicitud.getConsecutivo()+";"+solicitud.getFecha()+";"+solicitud.getIdentificacion()+";"+solicitud.getFacultad()+";"+solicitud.getArea()+";"+solicitud.getRequerimiento()+";"+solicitud.getEstado());
            writer.newLine();
            writer.close();
            return true;
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
        return false;
    }
    public boolean actualizar(int consecutivo,String estado){
        boolean sw= false;
        try{
            SolicitudDAO solicitudDAO = new SolicitudDAO(ruta);
            LinkedList<Solicitud>solicitudes = solicitudDAO.solicitudes();
            for(Solicitud solicitud : solicitudes){
                if(solicitud.getConsecutivo() == consecutivo){
                    solicitud.setEstado(estado);
                    sw = true;
                    break;
                }
            }
            if(sw){
                BufferedWriter writer = new BufferedWriter(new FileWriter(ruta,false));
                writer.write("");
                writer.close();
                solicitudes.forEach((solicitud) -> {
                    registrar(solicitud);
                });
            }
        }catch(IOException ex){
            System.out.println("Mi Error: "+ex.getMessage());
        }
        return sw;
    }
}
