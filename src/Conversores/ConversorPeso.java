package Conversores;

import java.util.Map;
import java.util.HashMap;

public class ConversorPeso {
	
	private Double peso;
    private Double gravedad;
    //creando hash map
    Map<String, Double> gravedades = new HashMap<>();
       
    public ConversorPeso() {
    	
    	//Para temas de escalabilidad usamos un hash map para asociar una palabra clave a una gravedad    	
        gravedades.put("tierra", 9.8);
        gravedades.put("marte", 3.7);
        gravedades.put("jupiter", 24.8);
        gravedades.put("luna", 1.6);
        gravedades.put("saturno", 10.4);       
        
    }
    
    public double calcularPesoEnPlaneta(Double peso, String planeta) {
    	
    	this.peso = peso;
    	planeta = planeta.toLowerCase();
    	
    	//si la el planta dado no existe en el hash map lanzamos un error
    	if(gravedades.containsKey(planeta)) {
    		gravedad = gravedades.get(planeta);
        	
            return Math.round((this.peso * (gravedad / gravedades.get("tierra"))));
    	}else {
    		throw new IllegalAccessError("Planeta no valido");
    	}
    	
    }	

}
