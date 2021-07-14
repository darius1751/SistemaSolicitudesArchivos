package Clases;
public class Solicitud {
    private int consecutivo;
    private String identificacion;
    private String fecha;
    private String facultad;
    private String area;
    private String requerimiento;
    private String estado;
    public Solicitud(String fecha,String identificacion, String facultad, String area, String requerimiento, String estado) {
        this.identificacion = identificacion;
        this.fecha = fecha;
        this.facultad = facultad;
        this.area = area;
        this.requerimiento = requerimiento;
        this.estado = estado;
    }

    
    public Solicitud(int consecutivo, String fecha,String identificacion, String facultad, String area, String requerimiento, String estado) {
        this.consecutivo = consecutivo;
        this.identificacion = identificacion;
        this.fecha = fecha;
        this.facultad = facultad;
        this.area = area;
        this.requerimiento = requerimiento;
        this.estado = estado;
    }
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
