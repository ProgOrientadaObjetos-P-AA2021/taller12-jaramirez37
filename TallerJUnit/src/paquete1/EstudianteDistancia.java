
package paquete1;

import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante{
       
    private ArrayList<Nota> notas;
    private double mejorNota;
    private double peorNota;
    private double promedio;
    private double mejorPromedio;
    
    public void establecerNotas(ArrayList<Nota> ns){
        notas = ns;    
    }
    
    public ArrayList<Nota> obtenerNotas(){
        return notas;    
    }
    
    public void establecerPromedio(double x){
        promedio = x;    
    }
    
    public double obtenerPromedio(){
        return promedio;    
    }
    
    public void establecerPeorNota(){
         double aux = 5;
        for (int i = 0; i < obtenerNotas().size() ; i++) {
            if(aux < obtenerNotas().indexOf(i) ){
                aux = obtenerNotas().indexOf(i);
            }
        }
        peorNota = aux;   
    }
    
    public double obtenerPeorNota(){
        return peorNota;    
    }
    
    public void establecerMejorNota(double x){
        mejorNota = x;    
    }
    
    public double obtenerMejorNota(){
        return mejorNota;    
    }
    
    public void establecerMejorPromedio(){
        double suma = 0;        
        for (int i = 0; i < obtenerNotas().size() ; i++) {            
                suma = suma + obtenerNotas().indexOf(i);            
        }
        mejorPromedio = (suma / obtenerNotas().size());    
    }
    
    public double obtenerMejorPromedio(){
        return mejorPromedio;    
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Nombre Estudiante: Joseph Ramirez\n"
                + "Cédula: 74849465"
                + "Notas: \n"
                + "10.0"
                + "5.0"
                + "6.0"
                + "Proemdio: 7.0"
                + "Mejor Nota: 10.0"
                + "Peor Nota: 5.0");
        return cadena;
    }         
}
