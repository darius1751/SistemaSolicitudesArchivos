package DAO;

import Clases.Solicitud;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
public class SolicitudDAO {
     private final String ruta;
    public SolicitudDAO(String ruta){
        this.ruta = ruta;
    }
    public int ultimoConsecutivo(){
        int consecutivo = 0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String data = null;
            while((data = reader.readLine()) != null){
                String[] solicitud = data.split(";");
                consecutivo = Integer.parseInt(solicitud[0]);
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return consecutivo;
    }
    public LinkedList<Solicitud> solicitudes(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            LinkedList<Solicitud> listaDeSolicitudes = new LinkedList<>();
            String data = null;
            while((data = reader.readLine()) != null){
                String[] solicitud = data.split(";");
                listaDeSolicitudes.add(new Solicitud(Integer.parseInt(solicitud[0]), solicitud[1], solicitud[2], solicitud[3], solicitud[4], solicitud[5], solicitud[6]));
            }
            reader.close();
            return listaDeSolicitudes;
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public LinkedList<Solicitud>solicitudes(String identificacion){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            LinkedList<Solicitud> listaDeSolicitudes = new LinkedList<>();
            String data = null;
            System.out.println("Inicio While Solicitudes");
            while((data = reader.readLine()) != null){
                String[] solicitud = data.split(";");
                if(solicitud[2].equals(identificacion))
                    listaDeSolicitudes.add(new Solicitud(Integer.parseInt(solicitud[0]), solicitud[1], solicitud[2], solicitud[3], solicitud[4], solicitud[5], solicitud[6]));
            }
            reader.close();
            return listaDeSolicitudes;
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
