
package paquete1;

public class Estudiante {    
    protected String nombresEstudiante;    
    protected String apellidosEstudiante;  
    protected String identificacionEstudiante;   
    protected int edadEstudiante;
    
    public void establecerNombresEstudiante(String x){
        nombresEstudiante = x;    
    }
    
    public String obtenerNombresEstudiante(){
        return nombresEstudiante;    
    }
    
    public void establecerApellidoEstudiante(String x){
        apellidosEstudiante = x;    
    }
    
    public String obtenerApellidoEstudiante(){
        return apellidosEstudiante;    
    }
    
    public void establecerIdentificacionEstudiante(String x){
        identificacionEstudiante = x;    
    }
    
    public String obtenerIdentificacionEstudiante(){
        return identificacionEstudiante;    
    }
}
